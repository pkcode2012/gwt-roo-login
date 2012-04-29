package org.springsource.roo.extrack.client.managed.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;
import java.util.Set;
import org.springsource.roo.extrack.client.managed.request.ApplicationRequestFactory;
import org.springsource.roo.extrack.client.proxy.EmployeeProxy;
import org.springsource.roo.extrack.client.scaffold.activity.IsScaffoldMobileActivity;
import org.springsource.roo.extrack.client.scaffold.place.ProxyDetailsView;
import org.springsource.roo.extrack.client.scaffold.place.ProxyListPlace;
import org.springsource.roo.extrack.client.scaffold.place.ProxyPlace;
import org.springsource.roo.extrack.client.scaffold.place.ProxyPlace.Operation;
import org.springsource.roo.extrack.shared.domain.Gender;

public class EmployeeDetailsActivity extends EmployeeDetailsActivity_Roo_Gwt {

    public EmployeeDetailsActivity(EntityProxyId<org.springsource.roo.extrack.client.proxy.EmployeeProxy> proxyId, ApplicationRequestFactory requests, PlaceController placeController, ProxyDetailsView<org.springsource.roo.extrack.client.proxy.EmployeeProxy> view) {
        this.placeController = placeController;
        this.proxyId = proxyId;
        this.requests = requests;
        view.setDelegate(this);
        this.view = view;
    }

    public void editClicked() {
        placeController.goTo(getEditButtonPlace());
    }

    public Place getBackButtonPlace() {
        return new ProxyListPlace(EmployeeProxy.class);
    }

    public String getBackButtonText() {
        return "Back";
    }

    public Place getEditButtonPlace() {
        return new ProxyPlace(view.getValue().stableId(), Operation.EDIT);
    }

    public String getTitleText() {
        return "View Employee";
    }

    public boolean hasEditButton() {
        return true;
    }

    public void onCancel() {
        onStop();
    }

    public void onStop() {
        display = null;
    }

    public void start(AcceptsOneWidget displayIn, EventBus eventBus) {
        this.display = displayIn;
        Receiver<EntityProxy> callback = new Receiver<EntityProxy>() {

            public void onSuccess(EntityProxy proxy) {
                if (proxy == null) {
                    placeController.goTo(getBackButtonPlace());
                    return;
                }
                if (display == null) {
                    return;
                }
                view.setValue((EmployeeProxy) proxy);
                display.setWidget(view);
            }
        };
        find(callback);
    }
}
