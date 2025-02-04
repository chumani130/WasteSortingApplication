package com.enviro.enviro.assessment.grad001.chumanimadikizela.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "waste-categories")
public class WasteCategoryEntity extends BaseEntity {

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "description")
    private String description;

}
