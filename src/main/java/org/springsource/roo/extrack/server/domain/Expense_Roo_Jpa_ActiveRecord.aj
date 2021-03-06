// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.springsource.roo.extrack.server.domain;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import org.springsource.roo.extrack.server.domain.Expense;

privileged aspect Expense_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Expense.entityManager;
    
    public static final EntityManager Expense.entityManager() {
        EntityManager em = new Expense().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Expense.countExpenses() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Expense o", Long.class).getSingleResult();
    }
    
    public static List<Expense> Expense.findAllExpenses() {
        return entityManager().createQuery("SELECT o FROM Expense o", Expense.class).getResultList();
    }
    
    public static Expense Expense.findExpense(Long id) {
        if (id == null) return null;
        return entityManager().find(Expense.class, id);
    }
    
    public static List<Expense> Expense.findExpenseEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Expense o", Expense.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Expense.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Expense.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Expense attached = Expense.findExpense(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Expense.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Expense.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Expense Expense.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Expense merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
