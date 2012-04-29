package org.springsource.roo.extrack.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import org.springsource.roo.extrack.client.managed.request.ApplicationEntityTypesProcessor;
import org.springsource.roo.extrack.client.managed.request.ApplicationRequestFactory;
import org.springsource.roo.extrack.client.managed.ui.EmployeeListView;
import org.springsource.roo.extrack.client.managed.ui.EmployeeMobileListView;
import org.springsource.roo.extrack.client.managed.ui.ExpenseListView;
import org.springsource.roo.extrack.client.managed.ui.ExpenseMobileListView;
import org.springsource.roo.extrack.client.managed.ui.ReportListView;
import org.springsource.roo.extrack.client.managed.ui.ReportMobileListView;
import org.springsource.roo.extrack.client.proxy.EmployeeProxy;
import org.springsource.roo.extrack.client.proxy.ExpenseProxy;
import org.springsource.roo.extrack.client.proxy.ReportProxy;
import org.springsource.roo.extrack.client.scaffold.ScaffoldApp;
import org.springsource.roo.extrack.client.scaffold.place.ProxyListPlace;

public final class ApplicationMasterActivities extends ApplicationMasterActivities_Roo_Gwt {

    @Inject
    public ApplicationMasterActivities(ApplicationRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }
}
