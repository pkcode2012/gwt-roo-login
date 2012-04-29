package org.springsource.roo.extrack.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import org.springsource.roo.extrack.client.managed.request.ApplicationRequestFactory;
import org.springsource.roo.extrack.client.managed.ui.ExpenseDetailsView;
import org.springsource.roo.extrack.client.managed.ui.ExpenseEditView;
import org.springsource.roo.extrack.client.managed.ui.ExpenseListView;
import org.springsource.roo.extrack.client.managed.ui.ExpenseMobileDetailsView;
import org.springsource.roo.extrack.client.managed.ui.ExpenseMobileEditView;
import org.springsource.roo.extrack.client.proxy.ExpenseProxy;
import org.springsource.roo.extrack.client.proxy.ReportProxy;
import org.springsource.roo.extrack.client.request.ExpenseRequest;
import org.springsource.roo.extrack.client.scaffold.ScaffoldApp;
import org.springsource.roo.extrack.client.scaffold.place.CreateAndEditProxy;
import org.springsource.roo.extrack.client.scaffold.place.FindAndEditProxy;
import org.springsource.roo.extrack.client.scaffold.place.ProxyPlace;

public class ExpenseActivitiesMapper extends ExpenseActivitiesMapper_Roo_Gwt {

    public ExpenseActivitiesMapper(ApplicationRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }

    public Activity getActivity(ProxyPlace place) {
        switch(place.getOperation()) {
            case DETAILS:
                return new ExpenseDetailsActivity((EntityProxyId<ExpenseProxy>) place.getProxyId(), requests, placeController, ScaffoldApp.isMobile() ? ExpenseMobileDetailsView.instance() : ExpenseDetailsView.instance());
            case EDIT:
                return makeEditActivity(place);
            case CREATE:
                return makeCreateActivity();
        }
        throw new IllegalArgumentException("Unknown operation " + place.getOperation());
    }
}
