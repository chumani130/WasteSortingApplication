package com.enviro.enviro.assessment.grad001.chumanimadikizela.service.impl;

import com.enviro.enviro.assessment.grad001.chumanimadikizela.entity.RecyclingTipsEntity;
import com.enviro.enviro.assessment.grad001.chumanimadikizela.exceptions.NotFoundException;
import com.enviro.enviro.assessment.grad001.chumanimadikizela.repository.RecyclingTipsRepository;
import com.enviro.enviro.assessment.grad001.chumanimadikizela.service.RecyclingTipsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RecyclingTipsServiceImpl implements RecyclingTipsService {

    private final RecyclingTipsRepository recyclingTipsRepository;

    @Override
    public RecyclingTipsEntity save(RecyclingTipsEntity recyclingTipsEntity) {
        return recyclingTipsRepository.save(recyclingTipsEntity);
    }

    @Override
    public List<RecyclingTipsEntity> findAll() {
        return recyclingTipsRepository.findAll();
    }

    @Override
    public RecyclingTipsEntity findById(Long id) {
        return recyclingTipsRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Could not find the recycling tips with id: " + id));
    }

    @Override
    public void deleteById(Long id) {
        recyclingTipsRepository.deleteById(id);
    }
}
