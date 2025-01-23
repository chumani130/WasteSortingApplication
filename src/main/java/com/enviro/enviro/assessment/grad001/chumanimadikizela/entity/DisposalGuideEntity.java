package com.enviro.enviro.assessment.grad001.chumanimadikizela.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "guidelines")
public class DisposalGuideEntity {

    @Column(name = "guideline", nullable = false)
    private String guideline;

    @Column(name = "step_number")
    private Integer stepNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "waste_category_id", nullable = false)
    private WasteCategoryEntity wasteCategory;
}
