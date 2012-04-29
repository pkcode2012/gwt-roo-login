// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.springsource.roo.extrack.server.domain;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import org.springsource.roo.extrack.server.domain.Report;

privileged aspect Report_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Report.entityManager;
    
    public static final EntityManager Report.entityManager() {
        EntityManager em = new Report().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Report.countReports() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Report o", Long.class).getSingleResult();
    }
    
    public static List<Report> Report.findAllReports() {
        return entityManager().createQuery("SELECT o FROM Report o", Report.class).getResultList();
    }
    
    public static Report Report.findReport(Long id) {
        if (id == null) return null;
        return entityManager().find(Report.class, id);
    }
    
    public static List<Report> Report.findReportEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Report o", Report.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Report.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Report.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Report attached = Report.findReport(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Report.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Report.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Report Report.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Report merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
