// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.springsource.roo.extrack.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.editor.client.EditorError;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DoubleBox;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.LongBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.web.bindery.requestfactory.gwt.client.RequestFactoryEditorDriver;
import com.google.web.bindery.requestfactory.shared.RequestFactory;
import java.util.Collection;
import java.util.List;
import org.springsource.roo.extrack.client.managed.activity.EmployeeEditActivityWrapper;
import org.springsource.roo.extrack.client.managed.activity.EmployeeEditActivityWrapper.View;
import org.springsource.roo.extrack.client.proxy.EmployeeProxy;
import org.springsource.roo.extrack.client.scaffold.place.ProxyEditView;
import org.springsource.roo.extrack.client.scaffold.ui.*;
import org.springsource.roo.extrack.shared.domain.Gender;

public abstract class EmployeeEditView_Roo_Gwt extends Composite implements View<EmployeeEditView> {

    @UiField
    TextBox displayName;

    @UiField
    TextBox userName;

    @UiField
    TextBox department;

    @UiField(provided = true)
    ValueListBox<EmployeeProxy> supervisor = new ValueListBox<EmployeeProxy>(org.springsource.roo.extrack.client.managed.ui.EmployeeProxyRenderer.instance(), new com.google.web.bindery.requestfactory.gwt.ui.client.EntityProxyKeyProvider<org.springsource.roo.extrack.client.proxy.EmployeeProxy>());

    @UiField(provided = true)
    ValueListBox<Gender> gender = new ValueListBox<Gender>(new AbstractRenderer<org.springsource.roo.extrack.shared.domain.Gender>() {

        public String render(org.springsource.roo.extrack.shared.domain.Gender obj) {
            return obj == null ? "" : String.valueOf(obj);
        }
    });

    @UiField(provided = true)
    CheckBox admin = new CheckBox() {

        public void setValue(Boolean value) {
            super.setValue(value == null ? Boolean.FALSE : value);
        }
    };

    public void setSupervisorPickerValues(Collection<org.springsource.roo.extrack.client.proxy.EmployeeProxy> values) {
        supervisor.setAcceptableValues(values);
    }

    public void setGenderPickerValues(Collection<org.springsource.roo.extrack.shared.domain.Gender> values) {
        gender.setAcceptableValues(values);
    }
}
