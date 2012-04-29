package org.springsource.roo.extrack.client.managed.activity;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.view.client.Range;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;
import java.util.List;
import org.springsource.roo.extrack.client.managed.request.ApplicationRequestFactory;
import org.springsource.roo.extrack.client.proxy.EmployeeProxy;
import org.springsource.roo.extrack.client.proxy.ReportProxy;
import org.springsource.roo.extrack.client.scaffold.ScaffoldMobileApp;
import org.springsource.roo.extrack.client.scaffold.activity.IsScaffoldMobileActivity;
import org.springsource.roo.extrack.client.scaffold.place.AbstractProxyListActivity;
import org.springsource.roo.extrack.client.scaffold.place.ProxyListView;

public class ReportListActivity extends ReportListActivity_Roo_Gwt {

    public ReportListActivity(ApplicationRequestFactory requests, ProxyListView<org.springsource.roo.extrack.client.proxy.ReportProxy> view, PlaceController placeController) {
        super(placeController, view, ReportProxy.class);
        this.requests = requests;
    }

    public Place getBackButtonPlace() {
        return ScaffoldMobileApp.ROOT_PLACE;
    }

    public String getBackButtonText() {
        return "Entities";
    }

    public Place getEditButtonPlace() {
        return null;
    }

    public String getTitleText() {
        return "Reports";
    }

    public boolean hasEditButton() {
        return false;
    }

    protected Request<java.util.List<org.springsource.roo.extrack.client.proxy.ReportProxy>> createRangeRequest(Range range) {
        return requests.reportRequest().findReportEntries(range.getStart(), range.getLength());
    }
}
