package com.enviro.enviro.assessment.grad001.chumanimadikizela.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "recycling_tips")
public class RecyclingTipsEntity extends BaseEntity {

    @Column(name = "tip", nullable = false)
    private String tip;

    @Column(name = "source")
    private String source;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "waste_category_id", nullable = false)
    private WasteCategoryEntity wasteCategory;
}
