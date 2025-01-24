package com.enviro.enviro.assessment.grad001.chumanimadikizela.service.impl;

import com.enviro.enviro.assessment.grad001.chumanimadikizela.entity.DisposalGuideEntity;
import com.enviro.enviro.assessment.grad001.chumanimadikizela.exceptions.NotFoundException;
import com.enviro.enviro.assessment.grad001.chumanimadikizela.repository.DisposalGuideRepository;
import com.enviro.enviro.assessment.grad001.chumanimadikizela.service.DisposalGuideService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DisposalGuideServiceImpl implements DisposalGuideService {
    private final DisposalGuideRepository disposalGuideRepository;

    @Override
    public DisposalGuideEntity save(DisposalGuideEntity disposalGuideEntity) {
        return disposalGuideRepository.save(disposalGuideEntity);
    }

    @Override
    public List<DisposalGuideEntity> findAll() {
        return disposalGuideRepository.findAll();
    }

    @Override
    public DisposalGuideEntity findById(Long id) {
        return disposalGuideRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Could not find the disposal guide"));
    }

    @Override
    public void deleteById(Long id) {
        disposalGuideRepository.deleteById(id);
    }

}
