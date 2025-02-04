package com.enviro.enviro.assessment.grad001.chumanimadikizela.entity;

import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "guidelines")
public class DisposalGuideEntity extends BaseEntity {

    @Column(name = "guideline", nullable = false)
    private String guideline;

    @Column(name = "step_number")
    private Integer stepNumber;


}
