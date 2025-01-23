package com.enviro.enviro.assessment.grad001.chumanimadikizela.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

public class WasteCategoryEntity extends BaseEntity {

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "wasteCategory", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DisposalGuideEntity> disposalGuides = new ArrayList<>();

    @OneToMany(mappedBy = "wasteCategory", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RecyclingTipsEntity> recyclingTips = new ArrayList<>();
}
