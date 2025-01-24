package com.enviro.enviro.assessment.grad001.chumanimadikizela.service;

import com.enviro.enviro.assessment.grad001.chumanimadikizela.entity.WasteCategoryEntity;

import java.util.List;

public interface WasteCategoryService {

    WasteCategoryEntity save(WasteCategoryEntity wasteCategoryEntity);
    WasteCategoryEntity update(WasteCategoryEntity wasteCategoryEntity);
    List<WasteCategoryEntity> findAll();
    WasteCategoryEntity findById(Long id);
    void deleteById(Long id);
}
