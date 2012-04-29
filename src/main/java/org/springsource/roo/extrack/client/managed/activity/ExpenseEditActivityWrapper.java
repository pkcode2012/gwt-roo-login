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
import org.springsource.roo.extrack.client.proxy.ExpenseProxy;
import org.springsource.roo.extrack.client.proxy.ReportProxy;
import org.springsource.roo.extrack.client.scaffold.activity.IsScaffoldMobileActivity;
import org.springsource.roo.extrack.client.scaffold.place.ProxyEditView;
import org.springsource.roo.extrack.client.scaffold.place.ProxyListPlace;
import org.springsource.roo.extrack.client.scaffold.place.ProxyPlace;

public class ExpenseEditActivityWrapper extends ExpenseEditActivityWrapper_Roo_Gwt {

    private final EntityProxyId<ExpenseProxy> proxyId;

    public ExpenseEditActivityWrapper(ApplicationRequestFactory requests, View<?> view, Activity activity, EntityProxyId<org.springsource.roo.extrack.client.proxy.ExpenseProxy> proxyId) {
        this.requests = requests;
        this.view = view;
        this.wrapped = activity;
        this.proxyId = proxyId;
    }

    public Place getBackButtonPlace() {
        return (proxyId == null) ? new ProxyListPlace(ExpenseProxy.class) : new ProxyPlace(proxyId, ProxyPlace.Operation.DETAILS);
    }

    public String getBackButtonText() {
        return "Cancel";
    }

    public Place getEditButtonPlace() {
        return null;
    }

    public String getTitleText() {
        return (proxyId == null) ? "New Expense" : "Edit Expense";
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

    public interface View<V extends org.springsource.roo.extrack.client.scaffold.place.ProxyEditView<org.springsource.roo.extrack.client.proxy.ExpenseProxy, V>> extends ProxyEditView<ExpenseProxy, V> {

        void setReportPickerValues(Collection<org.springsource.roo.extrack.client.proxy.ReportProxy> values);
    }
}
