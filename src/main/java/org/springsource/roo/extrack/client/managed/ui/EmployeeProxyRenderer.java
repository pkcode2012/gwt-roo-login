package org.springsource.roo.extrack.client.managed.ui;

import com.google.web.bindery.requestfactory.gwt.ui.client.ProxyRenderer;
import org.springsource.roo.extrack.client.proxy.EmployeeProxy;
import org.springsource.roo.extrack.shared.domain.Gender;

public class EmployeeProxyRenderer extends ProxyRenderer<EmployeeProxy> {

    private static org.springsource.roo.extrack.client.managed.ui.EmployeeProxyRenderer INSTANCE;

    protected EmployeeProxyRenderer() {
        super(new String[] { "displayName" });
    }

    public static org.springsource.roo.extrack.client.managed.ui.EmployeeProxyRenderer instance() {
        if (INSTANCE == null) {
            INSTANCE = new EmployeeProxyRenderer();
        }
        return INSTANCE;
    }

    public String render(EmployeeProxy object) {
        if (object == null) {
            return "";
        }
        return object.getDisplayName() + " (" + object.getDisplayName() + ")";
    }
}
