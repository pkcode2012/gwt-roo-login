package org.springsource.roo.extrack.client.managed.ui;

import com.google.web.bindery.requestfactory.gwt.ui.client.ProxyRenderer;
import org.springsource.roo.extrack.client.proxy.EmployeeProxy;
import org.springsource.roo.extrack.client.proxy.ReportProxy;

public class ReportProxyRenderer extends ProxyRenderer<ReportProxy> {

    private static org.springsource.roo.extrack.client.managed.ui.ReportProxyRenderer INSTANCE;

    protected ReportProxyRenderer() {
        super(new String[] { "purpose" });
    }

    public static org.springsource.roo.extrack.client.managed.ui.ReportProxyRenderer instance() {
        if (INSTANCE == null) {
            INSTANCE = new ReportProxyRenderer();
        }
        return INSTANCE;
    }

    public String render(ReportProxy object) {
        if (object == null) {
            return "";
        }
        return object.getPurpose() + " (" + object.getPurpose() + ")";
    }
}
