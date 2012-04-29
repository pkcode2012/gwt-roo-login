package org.springsource.roo.extrack.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import org.springsource.roo.extrack.client.managed.request.ApplicationRequestFactory;
import org.springsource.roo.extrack.client.managed.ui.ReportDetailsView;
import org.springsource.roo.extrack.client.managed.ui.ReportEditView;
import org.springsource.roo.extrack.client.managed.ui.ReportListView;
import org.springsource.roo.extrack.client.managed.ui.ReportMobileDetailsView;
import org.springsource.roo.extrack.client.managed.ui.ReportMobileEditView;
import org.springsource.roo.extrack.client.proxy.EmployeeProxy;
import org.springsource.roo.extrack.client.proxy.ReportProxy;
import org.springsource.roo.extrack.client.request.ReportRequest;
import org.springsource.roo.extrack.client.scaffold.ScaffoldApp;
import org.springsource.roo.extrack.client.scaffold.place.CreateAndEditProxy;
import org.springsource.roo.extrack.client.scaffold.place.FindAndEditProxy;
import org.springsource.roo.extrack.client.scaffold.place.ProxyPlace;

public class ReportActivitiesMapper extends ReportActivitiesMapper_Roo_Gwt {

    public ReportActivitiesMapper(ApplicationRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }

    public Activity getActivity(ProxyPlace place) {
        switch(place.getOperation()) {
            case DETAILS:
                return new ReportDetailsActivity((EntityProxyId<ReportProxy>) place.getProxyId(), requests, placeController, ScaffoldApp.isMobile() ? ReportMobileDetailsView.instance() : ReportDetailsView.instance());
            case EDIT:
                return makeEditActivity(place);
            case CREATE:
                return makeCreateActivity();
        }
        throw new IllegalArgumentException("Unknown operation " + place.getOperation());
    }
}
