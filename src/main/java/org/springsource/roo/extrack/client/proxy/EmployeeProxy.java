// WARNING: THIS FILE IS MANAGED BY SPRING ROO.

package org.springsource.roo.extrack.client.proxy;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyForName;
import org.springframework.roo.addon.gwt.RooGwtProxy;
import org.springsource.roo.extrack.shared.domain.Gender;

@ProxyForName(value = "org.springsource.roo.extrack.server.domain.Employee", locator = "org.springsource.roo.extrack.server.locator.EmployeeLocator")
@RooGwtProxy(value = "org.springsource.roo.extrack.server.domain.Employee", readOnly = { "version", "id" }, scaffold = true)
public interface EmployeeProxy extends EntityProxy {

    abstract Long getId();

    abstract String getDisplayName();

    abstract void setDisplayName(String displayName);

    abstract String getUserName();

    abstract void setUserName(String userName);

    abstract String getDepartment();

    abstract void setDepartment(String department);

    abstract org.springsource.roo.extrack.client.proxy.EmployeeProxy getSupervisor();

    abstract void setSupervisor(org.springsource.roo.extrack.client.proxy.EmployeeProxy supervisor);

    abstract Gender getGender();

    abstract void setGender(Gender gender);

    abstract Boolean getAdmin();

    abstract void setAdmin(Boolean admin);

    abstract Integer getVersion();
}
