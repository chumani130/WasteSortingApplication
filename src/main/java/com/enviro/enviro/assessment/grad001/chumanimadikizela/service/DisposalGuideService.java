package com.enviro.enviro.assessment.grad001.chumanimadikizela.service;

import com.enviro.enviro.assessment.grad001.chumanimadikizela.entity.DisposalGuideEntity;

import java.util.List;

public class DisposalGuideService {

    DisposalGuideEntity save(DisposalGuideEntity disposalGuideEntity);
    List<DisposalGuideEntity> findAll();
    DisposalGuideEntity findById(Long id);
    void deleteById(Long id);
}
