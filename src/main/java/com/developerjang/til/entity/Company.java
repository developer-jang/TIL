package com.developerjang.til.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "m_company")
@Getter
@Setter
@Builder
public class Company {

    @Id
    @GeneratedValue(generator = "system-uuid2")
    @GenericGenerator(name = "system-uuid2", strategy = "uuid2")
    @Column(name = "companyId", length = 50)
    private String companyId;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private Set<User> users;
}