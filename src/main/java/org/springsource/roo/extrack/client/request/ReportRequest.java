// WARNING: THIS FILE IS MANAGED BY SPRING ROO.

package org.springsource.roo.extrack.client.request;

import com.google.web.bindery.requestfactory.shared.InstanceRequest;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.ServiceName;
import org.springframework.roo.addon.gwt.RooGwtRequest;

@RooGwtRequest("org.springsource.roo.extrack.server.domain.Report")
@ServiceName("org.springsource.roo.extrack.server.domain.Report")
public interface ReportRequest extends RequestContext {

    abstract Request<java.lang.Long> countReports();

    abstract Request<java.util.List<org.springsource.roo.extrack.client.proxy.ReportProxy>> findAllReports();

    abstract Request<java.util.List<org.springsource.roo.extrack.client.proxy.ReportProxy>> findReportEntries(int firstResult, int maxResults);

    abstract Request<org.springsource.roo.extrack.client.proxy.ReportProxy> findReport(Long id);

    abstract InstanceRequest<org.springsource.roo.extrack.client.proxy.ReportProxy, java.lang.Void> persist();

    abstract InstanceRequest<org.springsource.roo.extrack.client.proxy.ReportProxy, java.lang.Void> remove();
}
