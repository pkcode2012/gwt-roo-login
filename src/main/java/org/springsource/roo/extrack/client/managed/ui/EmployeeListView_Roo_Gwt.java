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
import org.springsource.roo.extrack.client.scaffold.place.AbstractProxyListView;
import org.springsource.roo.extrack.shared.domain.Gender;

public abstract class EmployeeListView_Roo_Gwt extends AbstractProxyListView<EmployeeProxy> {

    @UiField
    CellTable<EmployeeProxy> table;

    protected Set<String> paths = new HashSet<String>();

    public void init() {
        paths.add("id");
        table.addColumn(new TextColumn<EmployeeProxy>() {

            Renderer<java.lang.Long> renderer = new AbstractRenderer<java.lang.Long>() {

                public String render(java.lang.Long obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(EmployeeProxy object) {
                return renderer.render(object.getId());
            }
        }, "Id");
        paths.add("displayName");
        table.addColumn(new TextColumn<EmployeeProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(EmployeeProxy object) {
                return renderer.render(object.getDisplayName());
            }
        }, "Display Name");
        paths.add("userName");
        table.addColumn(new TextColumn<EmployeeProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(EmployeeProxy object) {
                return renderer.render(object.getUserName());
            }
        }, "User Name");
        paths.add("department");
        table.addColumn(new TextColumn<EmployeeProxy>() {

            Renderer<java.lang.String> renderer = new AbstractRenderer<java.lang.String>() {

                public String render(java.lang.String obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(EmployeeProxy object) {
                return renderer.render(object.getDepartment());
            }
        }, "Department");
        paths.add("supervisor");
        table.addColumn(new TextColumn<EmployeeProxy>() {

            Renderer<org.springsource.roo.extrack.client.proxy.EmployeeProxy> renderer = org.springsource.roo.extrack.client.managed.ui.EmployeeProxyRenderer.instance();

            @Override
            public String getValue(EmployeeProxy object) {
                return renderer.render(object.getSupervisor());
            }
        }, "Supervisor");
        paths.add("gender");
        table.addColumn(new TextColumn<EmployeeProxy>() {

            Renderer<org.springsource.roo.extrack.shared.domain.Gender> renderer = new AbstractRenderer<org.springsource.roo.extrack.shared.domain.Gender>() {

                public String render(org.springsource.roo.extrack.shared.domain.Gender obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(EmployeeProxy object) {
                return renderer.render(object.getGender());
            }
        }, "Gender");
        paths.add("admin");
        table.addColumn(new TextColumn<EmployeeProxy>() {

            Renderer<java.lang.Boolean> renderer = new AbstractRenderer<java.lang.Boolean>() {

                public String render(java.lang.Boolean obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(EmployeeProxy object) {
                return renderer.render(object.getAdmin());
            }
        }, "Admin");
        paths.add("version");
        table.addColumn(new TextColumn<EmployeeProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(EmployeeProxy object) {
                return renderer.render(object.getVersion());
            }
        }, "Version");
    }
}
