// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.springsource.roo.extrack.server.domain;

import java.util.Date;
import org.springsource.roo.extrack.server.domain.Employee;
import org.springsource.roo.extrack.server.domain.Report;

privileged aspect Report_Roo_JavaBean {
    
    public String Report.getPurpose() {
        return this.purpose;
    }
    
    public void Report.setPurpose(String purpose) {
        this.purpose = purpose;
    }
    
    public String Report.getNotes() {
        return this.notes;
    }
    
    public void Report.setNotes(String notes) {
        this.notes = notes;
    }
    
    public Date Report.getCreated() {
        return this.created;
    }
    
    public void Report.setCreated(Date created) {
        this.created = created;
    }
    
    public String Report.getDepartment() {
        return this.department;
    }
    
    public void Report.setDepartment(String department) {
        this.department = department;
    }
    
    public Employee Report.getReporter() {
        return this.reporter;
    }
    
    public void Report.setReporter(Employee reporter) {
        this.reporter = reporter;
    }
    
    public Employee Report.getApprovedSupervisor() {
        return this.approvedSupervisor;
    }
    
    public void Report.setApprovedSupervisor(Employee approvedSupervisor) {
        this.approvedSupervisor = approvedSupervisor;
    }
    
}