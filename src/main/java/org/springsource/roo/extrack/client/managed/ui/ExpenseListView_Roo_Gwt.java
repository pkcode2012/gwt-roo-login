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
import org.springsource.roo.extrack.client.proxy.ExpenseProxy;
import org.springsource.roo.extrack.client.proxy.ReportProxy;
import org.springsource.roo.extrack.client.scaffold.place.AbstractProxyListView;

public abstract class ExpenseListView_Roo_Gwt extends AbstractProxyListView<ExpenseProxy> {

    @UiField
    CellTable<ExpenseProxy> table;

    protected Set<String> paths = new HashSet<String>();

    public void init() {
        paths.add("id");
        table.addColumn(new TextColumn<ExpenseProxy>() {

            Renderer<java.lang.Long> renderer = new AbstractRenderer<java.lang.Long>() {

                public String render(java.lang.Long obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(ExpenseProxy object) {
                return renderer.render(object.getId());
            }
        }, "Id");
        paths.add("amount");
        table.addColumn(new TextColumn<ExpenseProxy>() {

            Renderer<java.lang.Double> renderer = new AbstractRenderer<java.lang.Double>() {

                public String render(java.lang.Double obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(ExpenseProxy object) {
                return renderer.render(object.getAmount());
            }
        }, "Amount");
        paths.add("description");
        table.addColumn(new TextColumn<ExpenseProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(ExpenseProxy object) {
                return renderer.render(object.getDescription());
            }
        }, "Description");
        paths.add("report");
        table.addColumn(new TextColumn<ExpenseProxy>() {

            Renderer<org.springsource.roo.extrack.client.proxy.ReportProxy> renderer = org.springsource.roo.extrack.client.managed.ui.ReportProxyRenderer.instance();

            @Override
            public String getValue(ExpenseProxy object) {
                return renderer.render(object.getReport());
            }
        }, "Report");
        paths.add("approval");
        table.addColumn(new TextColumn<ExpenseProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(ExpenseProxy object) {
                return renderer.render(object.getApproval());
            }
        }, "Approval");
        paths.add("category");
        table.addColumn(new TextColumn<ExpenseProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(ExpenseProxy object) {
                return renderer.render(object.getCategory());
            }
        }, "Category");
        paths.add("created");
        table.addColumn(new TextColumn<ExpenseProxy>() {

            Renderer<java.util.Date> renderer = new DateTimeFormatRenderer(DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT));

            @Override
            public String getValue(ExpenseProxy object) {
                return renderer.render(object.getCreated());
            }
        }, "Created");
        paths.add("reasonDenied");
        table.addColumn(new TextColumn<ExpenseProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(ExpenseProxy object) {
                return renderer.render(object.getReasonDenied());
            }
        }, "Reason Denied");
        paths.add("version");
        table.addColumn(new TextColumn<ExpenseProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(ExpenseProxy object) {
                return renderer.render(object.getVersion());
            }
        }, "Version");
    }
}
