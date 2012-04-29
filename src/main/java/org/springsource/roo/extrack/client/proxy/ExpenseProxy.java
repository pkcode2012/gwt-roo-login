// WARNING: THIS FILE IS MANAGED BY SPRING ROO.

package org.springsource.roo.extrack.client.proxy;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyForName;
import java.util.Date;
import org.springframework.roo.addon.gwt.RooGwtProxy;

@ProxyForName(value = "org.springsource.roo.extrack.server.domain.Expense", locator = "org.springsource.roo.extrack.server.locator.ExpenseLocator")
@RooGwtProxy(value = "org.springsource.roo.extrack.server.domain.Expense", readOnly = { "version", "id" }, scaffold = true)
public interface ExpenseProxy extends EntityProxy {

    abstract Long getId();

    abstract Double getAmount();

    abstract void setAmount(Double amount);

    abstract String getDescription();

    abstract void setDescription(String description);

    abstract ReportProxy getReport();

    abstract void setReport(ReportProxy report);

    abstract String getApproval();

    abstract void setApproval(String approval);

    abstract String getCategory();

    abstract void setCategory(String category);

    abstract Date getCreated();

    abstract void setCreated(Date created);

    abstract String getReasonDenied();

    abstract void setReasonDenied(String reasonDenied);

    abstract Integer getVersion();
}
