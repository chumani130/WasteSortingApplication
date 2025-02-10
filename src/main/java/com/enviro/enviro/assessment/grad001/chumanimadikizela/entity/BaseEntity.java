package com.enviro.enviro.assessment.grad001.chumanimadikizela.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_created", updatable = false)
    private LocalDateTime dateCreated;

    @Column(name = "date_modified")
    private LocalDateTime dateModified;

    @PrePersist
    protected void setCreationParameters() {
        if (Objects.isNull(dateCreated)) {
            dateCreated = LocalDateTime.now();
        }
    }

    @PreUpdate
    private void modificationAt() {
        dateModified = LocalDateTime.now();
    }
}
