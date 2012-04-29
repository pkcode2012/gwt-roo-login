// WARNING: THIS FILE IS MANAGED BY SPRING ROO.

package org.springsource.roo.extrack.client.request;

import com.google.web.bindery.requestfactory.shared.InstanceRequest;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.ServiceName;
import org.springframework.roo.addon.gwt.RooGwtRequest;

@RooGwtRequest("org.springsource.roo.extrack.server.domain.Employee")
@ServiceName("org.springsource.roo.extrack.server.domain.Employee")
public interface EmployeeRequest extends RequestContext {

    abstract Request<java.lang.Long> countEmployees();

    abstract Request<java.util.List<org.springsource.roo.extrack.client.proxy.EmployeeProxy>> findAllEmployees();

    abstract Request<java.util.List<org.springsource.roo.extrack.client.proxy.EmployeeProxy>> findEmployeeEntries(int firstResult, int maxResults);

    abstract Request<org.springsource.roo.extrack.client.proxy.EmployeeProxy> findEmployee(Long id);

    abstract InstanceRequest<org.springsource.roo.extrack.client.proxy.EmployeeProxy, java.lang.Void> persist();

    abstract InstanceRequest<org.springsource.roo.extrack.client.proxy.EmployeeProxy, java.lang.Void> remove();
}
