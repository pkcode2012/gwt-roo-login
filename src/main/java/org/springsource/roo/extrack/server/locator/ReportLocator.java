package org.springsource.roo.extrack.server.locator;

import com.google.web.bindery.requestfactory.shared.Locator;
import org.springframework.roo.addon.gwt.RooGwtLocator;
import org.springframework.stereotype.Component;
import org.springsource.roo.extrack.server.domain.Report;

@RooGwtLocator("org.springsource.roo.extrack.server.domain.Report")
@Component
public class ReportLocator extends Locator<Report, Long> {

    public Report create(Class<? extends org.springsource.roo.extrack.server.domain.Report> clazz) {
        return new Report();
    }

    public Report find(Class<? extends org.springsource.roo.extrack.server.domain.Report> clazz, Long id) {
        return Report.findReport(id);
    }

    public Class<org.springsource.roo.extrack.server.domain.Report> getDomainType() {
        return Report.class;
    }

    public Long getId(Report report) {
        return report.getId();
    }

    public Class<java.lang.Long> getIdType() {
        return Long.class;
    }

    public Object getVersion(Report report) {
        return report.getVersion();
    }
}
