package org.springsource.roo.extrack.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import org.springsource.roo.extrack.client.managed.request.ApplicationRequestFactory;
import org.springsource.roo.extrack.client.managed.ui.EmployeeDetailsView;
import org.springsource.roo.extrack.client.managed.ui.EmployeeEditView;
import org.springsource.roo.extrack.client.managed.ui.EmployeeListView;
import org.springsource.roo.extrack.client.managed.ui.EmployeeMobileDetailsView;
import org.springsource.roo.extrack.client.managed.ui.EmployeeMobileEditView;
import org.springsource.roo.extrack.client.proxy.EmployeeProxy;
import org.springsource.roo.extrack.client.request.EmployeeRequest;
import org.springsource.roo.extrack.client.scaffold.ScaffoldApp;
import org.springsource.roo.extrack.client.scaffold.place.CreateAndEditProxy;
import org.springsource.roo.extrack.client.scaffold.place.FindAndEditProxy;
import org.springsource.roo.extrack.client.scaffold.place.ProxyPlace;
import org.springsource.roo.extrack.shared.domain.Gender;

public class EmployeeActivitiesMapper extends EmployeeActivitiesMapper_Roo_Gwt {

    public EmployeeActivitiesMapper(ApplicationRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }

    public Activity getActivity(ProxyPlace place) {
        switch(place.getOperation()) {
            case DETAILS:
                return new EmployeeDetailsActivity((EntityProxyId<EmployeeProxy>) place.getProxyId(), requests, placeController, ScaffoldApp.isMobile() ? EmployeeMobileDetailsView.instance() : EmployeeDetailsView.instance());
            case EDIT:
                return makeEditActivity(place);
            case CREATE:
                return makeCreateActivity();
        }
        throw new IllegalArgumentException("Unknown operation " + place.getOperation());
    }
}
