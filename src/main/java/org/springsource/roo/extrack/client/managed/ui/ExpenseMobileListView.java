package org.springsource.roo.extrack.client.managed.ui;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.text.client.DateTimeFormatRenderer;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.AbstractSafeHtmlRenderer;
import com.google.gwt.text.shared.Renderer;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.springsource.roo.extrack.client.proxy.ExpenseProxy;
import org.springsource.roo.extrack.client.proxy.ReportProxy;
import org.springsource.roo.extrack.client.scaffold.ScaffoldMobileApp;
import org.springsource.roo.extrack.client.scaffold.ui.MobileProxyListView;

public class ExpenseMobileListView extends ExpenseMobileListView_Roo_Gwt {

    private static org.springsource.roo.extrack.client.managed.ui.ExpenseMobileListView instance;

    public ExpenseMobileListView() {
        super("New Expense", new CellRenderer());
        init();
    }

    public static org.springsource.roo.extrack.client.managed.ui.ExpenseMobileListView instance() {
        if (instance == null) {
            instance = new ExpenseMobileListView();
        }
        return instance;
    }

    public String[] getPaths() {
        return paths.toArray(new String[paths.size()]);
    }

    private static class CellRenderer extends AbstractSafeHtmlRenderer<ExpenseProxy> {

        private final String dateStyle = ScaffoldMobileApp.getMobileListResources().cellListStyle().dateProp();

        private final String secondaryStyle = ScaffoldMobileApp.getMobileListResources().cellListStyle().secondaryProp();

        private final Renderer<String> primaryRenderer = new AbstractRenderer<String>() {

            public String render(java.lang.String obj) {
                return obj == null ? "" : String.valueOf(obj);
            }
        };

        private final Renderer<String> secondaryRenderer = new AbstractRenderer<String>() {

            public String render(java.lang.String obj) {
                return obj == null ? "" : String.valueOf(obj);
            }
        };

        private final Renderer<Date> dateRenderer = new DateTimeFormatRenderer(DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT));

        @Override
        public SafeHtml render(ExpenseProxy value) {
            if (value == null) {
                return SafeHtmlUtils.EMPTY_SAFE_HTML;
            }
            SafeHtmlBuilder sb = new SafeHtmlBuilder();
            if (value.getDescription() != null) {
                sb.appendEscaped(primaryRenderer.render(value.getDescription()));
            }
            sb.appendHtmlConstant("<div style=\"position:relative;\">");
            sb.appendHtmlConstant("<div class=\"" + secondaryStyle + "\">");
            if (value.getApproval() != null) {
                sb.appendEscaped(secondaryRenderer.render(value.getApproval()));
            }
            sb.appendHtmlConstant("</div>");
            sb.appendHtmlConstant("<div class=\"" + dateStyle + "\">");
            if (value.getCreated() != null) {
                sb.appendEscaped(dateRenderer.render(value.getCreated()));
            }
            sb.appendHtmlConstant("</div>");
            sb.appendHtmlConstant("</div>");
            return sb.toSafeHtml();
        }
    }
}
