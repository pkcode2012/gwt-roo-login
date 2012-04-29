package org.springsource.roo.extrack.server.domain;

import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import org.springsource.roo.extrack.shared.domain.Gender;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Employee {

    @NotNull
    private String displayName;

    @NotNull
    @Size(min = 3, max = 30)
    private String userName;

    private String department;

    @ManyToOne
    private org.springsource.roo.extrack.server.domain.Employee supervisor;

    @Enumerated
    private Gender gender;

    @NotNull
    private Boolean admin;
}
