package org.springsource.roo.extrack.client.managed.ui;

import com.google.web.bindery.requestfactory.gwt.ui.client.ProxyRenderer;
import org.springsource.roo.extrack.client.proxy.ExpenseProxy;
import org.springsource.roo.extrack.client.proxy.ReportProxy;

public class ExpenseProxyRenderer extends ProxyRenderer<ExpenseProxy> {

    private static org.springsource.roo.extrack.client.managed.ui.ExpenseProxyRenderer INSTANCE;

    protected ExpenseProxyRenderer() {
        super(new String[] { "description" });
    }

    public static org.springsource.roo.extrack.client.managed.ui.ExpenseProxyRenderer instance() {
        if (INSTANCE == null) {
            INSTANCE = new ExpenseProxyRenderer();
        }
        return INSTANCE;
    }

    public String render(ExpenseProxy object) {
        if (object == null) {
            return "";
        }
        return object.getDescription() + " (" + object.getDescription() + ")";
    }
}
