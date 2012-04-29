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
import org.springsource.roo.extrack.client.managed.activity.ExpenseEditActivityWrapper;
import org.springsource.roo.extrack.client.managed.activity.ExpenseEditActivityWrapper.View;
import org.springsource.roo.extrack.client.proxy.ExpenseProxy;
import org.springsource.roo.extrack.client.proxy.ReportProxy;
import org.springsource.roo.extrack.client.scaffold.place.ProxyEditView;
import org.springsource.roo.extrack.client.scaffold.ui.*;

public abstract class ExpenseEditView_Roo_Gwt extends Composite implements View<ExpenseEditView> {

    @UiField
    DoubleBox amount;

    @UiField
    TextBox description;

    @UiField(provided = true)
    ValueListBox<ReportProxy> report = new ValueListBox<ReportProxy>(org.springsource.roo.extrack.client.managed.ui.ReportProxyRenderer.instance(), new com.google.web.bindery.requestfactory.gwt.ui.client.EntityProxyKeyProvider<org.springsource.roo.extrack.client.proxy.ReportProxy>());

    @UiField
    TextBox approval;

    @UiField
    TextBox category;

    @UiField
    DateBox created;

    @UiField
    TextBox reasonDenied;

    public void setReportPickerValues(Collection<org.springsource.roo.extrack.client.proxy.ReportProxy> values) {
        report.setAcceptableValues(values);
    }
}
