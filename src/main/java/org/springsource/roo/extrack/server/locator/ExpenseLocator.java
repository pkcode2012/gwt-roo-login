package org.springsource.roo.extrack.server.locator;

import com.google.web.bindery.requestfactory.shared.Locator;
import org.springframework.roo.addon.gwt.RooGwtLocator;
import org.springframework.stereotype.Component;
import org.springsource.roo.extrack.server.domain.Expense;

@RooGwtLocator("org.springsource.roo.extrack.server.domain.Expense")
@Component
public class ExpenseLocator extends Locator<Expense, Long> {

    public Expense create(Class<? extends org.springsource.roo.extrack.server.domain.Expense> clazz) {
        return new Expense();
    }

    public Expense find(Class<? extends org.springsource.roo.extrack.server.domain.Expense> clazz, Long id) {
        return Expense.findExpense(id);
    }

    public Class<org.springsource.roo.extrack.server.domain.Expense> getDomainType() {
        return Expense.class;
    }

    public Long getId(Expense expense) {
        return expense.getId();
    }

    public Class<java.lang.Long> getIdType() {
        return Long.class;
    }

    public Object getVersion(Expense expense) {
        return expense.getVersion();
    }
}
