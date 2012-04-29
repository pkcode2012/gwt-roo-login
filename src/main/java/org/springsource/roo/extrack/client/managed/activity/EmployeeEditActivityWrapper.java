package org.springsource.roo.extrack.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.Receiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.springsource.roo.extrack.client.managed.request.ApplicationRequestFactory;
import org.springsource.roo.extrack.client.proxy.EmployeeProxy;
import org.springsource.roo.extrack.client.scaffold.activity.IsScaffoldMobileActivity;
import org.springsource.roo.extrack.client.scaffold.place.ProxyEditView;
import org.springsource.roo.extrack.client.scaffold.place.ProxyListPlace;
import org.springsource.roo.extrack.client.scaffold.place.ProxyPlace;
import org.springsource.roo.extrack.shared.domain.Gender;

public class EmployeeEditActivityWrapper extends EmployeeEditActivityWrapper_Roo_Gwt {

    private final EntityProxyId<EmployeeProxy> proxyId;

    public EmployeeEditActivityWrapper(ApplicationRequestFactory requests, View<?> view, Activity activity, EntityProxyId<org.springsource.roo.extrack.client.proxy.EmployeeProxy> proxyId) {
        this.requests = requests;
        this.view = view;
        this.wrapped = activity;
        this.proxyId = proxyId;
    }

    public Place getBackButtonPlace() {
        return (proxyId == null) ? new ProxyListPlace(EmployeeProxy.class) : new ProxyPlace(proxyId, ProxyPlace.Operation.DETAILS);
    }

    public String getBackButtonText() {
        return "Cancel";
    }

    public Place getEditButtonPlace() {
        return null;
    }

    public String getTitleText() {
        return (proxyId == null) ? "New Employee" : "Edit Employee";
    }

    public boolean hasEditButton() {
        return false;
    }

    @Override
    public String mayStop() {
        return wrapped.mayStop();
    }

    @Override
    public void onCancel() {
        wrapped.onCancel();
    }

    @Override
    public void onStop() {
        wrapped.onStop();
    }

    public interface View<V extends org.springsource.roo.extrack.client.scaffold.place.ProxyEditView<org.springsource.roo.extrack.client.proxy.EmployeeProxy, V>> extends ProxyEditView<EmployeeProxy, V> {

        void setGenderPickerValues(Collection<org.springsource.roo.extrack.shared.domain.Gender> values);

        void setSupervisorPickerValues(Collection<org.springsource.roo.extrack.client.proxy.EmployeeProxy> values);
    }
}
