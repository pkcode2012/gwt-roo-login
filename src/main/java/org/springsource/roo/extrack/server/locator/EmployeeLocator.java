package org.springsource.roo.extrack.server.locator;

import com.google.web.bindery.requestfactory.shared.Locator;
import org.springframework.roo.addon.gwt.RooGwtLocator;
import org.springframework.stereotype.Component;
import org.springsource.roo.extrack.server.domain.Employee;

@RooGwtLocator("org.springsource.roo.extrack.server.domain.Employee")
@Component
public class EmployeeLocator extends Locator<Employee, Long> {

    public Employee create(Class<? extends org.springsource.roo.extrack.server.domain.Employee> clazz) {
        return new Employee();
    }

    public Employee find(Class<? extends org.springsource.roo.extrack.server.domain.Employee> clazz, Long id) {
        return Employee.findEmployee(id);
    }

    public Class<org.springsource.roo.extrack.server.domain.Employee> getDomainType() {
        return Employee.class;
    }

    public Long getId(Employee employee) {
        return employee.getId();
    }

    public Class<java.lang.Long> getIdType() {
        return Long.class;
    }

    public Object getVersion(Employee employee) {
        return employee.getVersion();
    }
}
