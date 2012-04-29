// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.springsource.roo.extrack.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.text.client.DateTimeFormatRenderer;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import java.util.HashSet;
import java.util.Set;
import org.springsource.roo.extrack.client.proxy.EmployeeProxy;
import org.springsource.roo.extrack.client.proxy.ReportProxy;
import org.springsource.roo.extrack.client.scaffold.place.AbstractProxyListView;

public abstract class ReportListView_Roo_Gwt extends AbstractProxyListView<ReportProxy> {

    @UiField
    CellTable<ReportProxy> table;

    protected Set<String> paths = new HashSet<String>();

    public void init() {
        paths.add("id");
        table.addColumn(new TextColumn<ReportProxy>() {

            Renderer<java.lang.Long> renderer = new AbstractRenderer<java.lang.Long>() {

                public String render(java.lang.Long obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(ReportProxy object) {
                return renderer.render(object.getId());
            }
        }, "Id");
        paths.add("purpose");
        table.addColumn(new TextColumn<ReportProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(ReportProxy object) {
                return renderer.render(object.getPurpose());
            }
        }, "Purpose");
        paths.add("notes");
        table.addColumn(new TextColumn<ReportProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(ReportProxy object) {
                return renderer.render(object.getNotes());
            }
        }, "Notes");
        paths.add("created");
        table.addColumn(new TextColumn<ReportProxy>() {

            Renderer<java.util.Date> renderer = new DateTimeFormatRenderer(DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT));

            @Override
            public String getValue(ReportProxy object) {
                return renderer.render(object.getCreated());
            }
        }, "Created");
        paths.add("department");
        table.addColumn(new TextColumn<ReportProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(ReportProxy object) {
                return renderer.render(object.getDepartment());
            }
        }, "Department");
        paths.add("reporter");
        table.addColumn(new TextColumn<ReportProxy>() {

            Renderer<org.springsource.roo.extrack.client.proxy.EmployeeProxy> renderer = org.springsource.roo.extrack.client.managed.ui.EmployeeProxyRenderer.instance();

            @Override
            public String getValue(ReportProxy object) {
                return renderer.render(object.getReporter());
            }
        }, "Reporter");
        paths.add("approvedSupervisor");
        table.addColumn(new TextColumn<ReportProxy>() {

            Renderer<org.springsource.roo.extrack.client.proxy.EmployeeProxy> renderer = org.springsource.roo.extrack.client.managed.ui.EmployeeProxyRenderer.instance();

            @Override
            public String getValue(ReportProxy object) {
                return renderer.render(object.getApprovedSupervisor());
            }
        }, "Approved Supervisor");
        paths.add("version");
        table.addColumn(new TextColumn<ReportProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(ReportProxy object) {
                return renderer.render(object.getVersion());
            }
        }, "Version");
    }
}
