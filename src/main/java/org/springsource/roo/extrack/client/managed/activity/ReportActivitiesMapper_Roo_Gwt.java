// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

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

public abstract class ReportActivitiesMapper_Roo_Gwt {

    protected ApplicationRequestFactory requests;

    protected PlaceController placeController;

    protected Activity makeCreateActivity() {
        ReportEditView.instance().setCreating(true);
        final ReportRequest request = requests.reportRequest();
        Activity activity = new CreateAndEditProxy<ReportProxy>(ReportProxy.class, request, ScaffoldApp.isMobile() ? ReportMobileEditView.instance() : ReportEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(ReportProxy proxy) {
                request.persist().using(proxy);
                return request;
            }
        };
        return new ReportEditActivityWrapper(requests, ScaffoldApp.isMobile() ? ReportMobileEditView.instance() : ReportEditView.instance(), activity, null);
    }

    @SuppressWarnings("unchecked")
    protected EntityProxyId<org.springsource.roo.extrack.client.proxy.ReportProxy> coerceId(ProxyPlace place) {
        return (EntityProxyId<ReportProxy>) place.getProxyId();
    }

    protected Activity makeEditActivity(ProxyPlace place) {
        ReportEditView.instance().setCreating(false);
        EntityProxyId<ReportProxy> proxyId = coerceId(place);
        Activity activity = new FindAndEditProxy<ReportProxy>(proxyId, requests, ScaffoldApp.isMobile() ? ReportMobileEditView.instance() : ReportEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(ReportProxy proxy) {
                ReportRequest request = requests.reportRequest();
                request.persist().using(proxy);
                return request;
            }
        };
        return new ReportEditActivityWrapper(requests, ScaffoldApp.isMobile() ? ReportMobileEditView.instance() : ReportEditView.instance(), activity, proxyId);
    }
}
