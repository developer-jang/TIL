package com.developerjang.til.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "m_user")
@Getter
@Setter
@Builder
public class User {

    @Id
    @GeneratedValue(generator = "system-uuid2")
    @GenericGenerator(name = "system-uuid2", strategy = "uuid2")
    @Column(name = "user_id", length = 50)
    private String userId;

    @Column
    private String id;

    @Column
    private String password;

    @ManyToOne(optional = false)
    @JoinColumn(name = "company_id", updatable = false)
    private Company company;
}