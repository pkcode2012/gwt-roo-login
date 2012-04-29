// WARNING: THIS FILE IS MANAGED BY SPRING ROO.

package org.springsource.roo.extrack.client.request;

import com.google.web.bindery.requestfactory.shared.InstanceRequest;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.ServiceName;
import org.springframework.roo.addon.gwt.RooGwtRequest;

@RooGwtRequest("org.springsource.roo.extrack.server.domain.Expense")
@ServiceName("org.springsource.roo.extrack.server.domain.Expense")
public interface ExpenseRequest extends RequestContext {

    abstract Request<java.lang.Long> countExpenses();

    abstract Request<java.util.List<org.springsource.roo.extrack.client.proxy.ExpenseProxy>> findAllExpenses();

    abstract Request<java.util.List<org.springsource.roo.extrack.client.proxy.ExpenseProxy>> findExpenseEntries(int firstResult, int maxResults);

    abstract Request<org.springsource.roo.extrack.client.proxy.ExpenseProxy> findExpense(Long id);

    abstract InstanceRequest<org.springsource.roo.extrack.client.proxy.ExpenseProxy, java.lang.Void> persist();

    abstract InstanceRequest<org.springsource.roo.extrack.client.proxy.ExpenseProxy, java.lang.Void> remove();
}
