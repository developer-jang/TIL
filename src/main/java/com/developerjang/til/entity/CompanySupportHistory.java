package com.developerjang.til.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "m_company_support")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompanySupportHistory {

    @Id
    @GeneratedValue(generator = "system-uuid2")
    @GenericGenerator(name = "system-uuid2", strategy = "uuid2")
    @Column(length = 50)
    private String id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "company_id", updatable = false)
    private Company company;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", updatable = false)
    private User user;

    @CreationTimestamp
    private LocalDateTime createDt;

    @UpdateTimestamp
    private LocalDateTime updateDt;
}