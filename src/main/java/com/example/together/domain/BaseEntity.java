package com.example.together.domain;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(value = { AuditingEntityListener.class })
@Getter @Setter
abstract class BaseEntity {

    @CreatedDate
    @Column(name = "REGDATE", updatable = false)
    private LocalDateTime regDate;

    @LastModifiedDate
    @Column(name ="MODDATE" )
    private LocalDateTime modDate;

}
