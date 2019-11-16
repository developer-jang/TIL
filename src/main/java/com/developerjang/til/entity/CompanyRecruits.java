package com.developerjang.til.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "m_company")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompanyRecruits {

    @Id
    @GeneratedValue(generator = "system-uuid2")
    @GenericGenerator(name = "system-uuid2", strategy = "uuid2")
    @Column(length = 50)
    private String id;

    @Column(name = "recruit_user_subject")
    private String recruitSubject;

    //TODO : 채용 공고 BLOB?

    @Column(name = "recruit_user_count")
    @ColumnDefault("0")
    private Long recruitUserCount;

    @CreationTimestamp
    private LocalDateTime createDt;

    @UpdateTimestamp
    private LocalDateTime updateDt;

}