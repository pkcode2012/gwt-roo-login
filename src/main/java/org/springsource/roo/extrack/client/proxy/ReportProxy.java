// WARNING: THIS FILE IS MANAGED BY SPRING ROO.

package org.springsource.roo.extrack.client.proxy;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyForName;
import java.util.Date;
import org.springframework.roo.addon.gwt.RooGwtProxy;

@ProxyForName(value = "org.springsource.roo.extrack.server.domain.Report", locator = "org.springsource.roo.extrack.server.locator.ReportLocator")
@RooGwtProxy(value = "org.springsource.roo.extrack.server.domain.Report", readOnly = { "version", "id" }, scaffold = true)
public interface ReportProxy extends EntityProxy {

    abstract Long getId();

    abstract String getPurpose();

    abstract void setPurpose(String purpose);

    abstract String getNotes();

    abstract void setNotes(String notes);

    abstract Date getCreated();

    abstract void setCreated(Date created);

    abstract String getDepartment();

    abstract void setDepartment(String department);

    abstract EmployeeProxy getReporter();

    abstract void setReporter(EmployeeProxy reporter);

    abstract EmployeeProxy getApprovedSupervisor();

    abstract void setApprovedSupervisor(EmployeeProxy approvedSupervisor);

    abstract Integer getVersion();
}
