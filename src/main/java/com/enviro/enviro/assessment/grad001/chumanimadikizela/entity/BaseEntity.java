package com.enviro.enviro.assessment.grad001.chumanimadikizela.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
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
