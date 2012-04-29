// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.springsource.roo.extrack.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import org.springsource.roo.extrack.client.proxy.EmployeeProxy;
import org.springsource.roo.extrack.client.scaffold.place.ProxyDetailsView;
import org.springsource.roo.extrack.client.scaffold.place.ProxyListView;
import org.springsource.roo.extrack.shared.domain.Gender;

public abstract class EmployeeDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<EmployeeProxy> {

    @UiField
    SpanElement id;

    @UiField
    SpanElement displayName;

    @UiField
    SpanElement userName;

    @UiField
    SpanElement department;

    @UiField
    SpanElement supervisor;

    @UiField
    SpanElement gender;

    @UiField
    SpanElement admin;

    @UiField
    SpanElement version;

    EmployeeProxy proxy;

    @UiField
    SpanElement displayRenderer;

    public void setValue(EmployeeProxy proxy) {
        this.proxy = proxy;
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        displayName.setInnerText(proxy.getDisplayName() == null ? "" : String.valueOf(proxy.getDisplayName()));
        userName.setInnerText(proxy.getUserName() == null ? "" : String.valueOf(proxy.getUserName()));
        department.setInnerText(proxy.getDepartment() == null ? "" : String.valueOf(proxy.getDepartment()));
        supervisor.setInnerText(proxy.getSupervisor() == null ? "" : org.springsource.roo.extrack.client.managed.ui.EmployeeProxyRenderer.instance().render(proxy.getSupervisor()));
        gender.setInnerText(proxy.getGender() == null ? "" : String.valueOf(proxy.getGender()));
        admin.setInnerText(proxy.getAdmin() == null ? "" : String.valueOf(proxy.getAdmin()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        displayRenderer.setInnerText(EmployeeProxyRenderer.instance().render(proxy));
    }
}