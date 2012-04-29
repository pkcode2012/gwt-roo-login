package org.springsource.roo.extrack.client.managed.activity;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.view.client.Range;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;
import java.util.List;
import org.springsource.roo.extrack.client.managed.request.ApplicationRequestFactory;
import org.springsource.roo.extrack.client.proxy.ExpenseProxy;
import org.springsource.roo.extrack.client.proxy.ReportProxy;
import org.springsource.roo.extrack.client.scaffold.ScaffoldMobileApp;
import org.springsource.roo.extrack.client.scaffold.activity.IsScaffoldMobileActivity;
import org.springsource.roo.extrack.client.scaffold.place.AbstractProxyListActivity;
import org.springsource.roo.extrack.client.scaffold.place.ProxyListView;

public class ExpenseListActivity extends ExpenseListActivity_Roo_Gwt {

    public ExpenseListActivity(ApplicationRequestFactory requests, ProxyListView<org.springsource.roo.extrack.client.proxy.ExpenseProxy> view, PlaceController placeController) {
        super(placeController, view, ExpenseProxy.class);
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
        return "Expenses";
    }

    public boolean hasEditButton() {
        return false;
    }

    protected Request<java.util.List<org.springsource.roo.extrack.client.proxy.ExpenseProxy>> createRangeRequest(Range range) {
        return requests.expenseRequest().findExpenseEntries(range.getStart(), range.getLength());
    }
}
