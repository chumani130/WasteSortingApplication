package com.enviro.enviro.assessment.grad001.chumanimadikizela.service;

import com.enviro.enviro.assessment.grad001.chumanimadikizela.entity.RecyclingTipsEntity;

import java.util.List;

public interface RecyclingTipsService {

    RecyclingTipsEntity save(RecyclingTipsEntity recyclingTipsEntity);
    List<RecyclingTipsEntity> findAll();
    RecyclingTipsEntity findById(Long id);
    void deleteById(Long id);
}
