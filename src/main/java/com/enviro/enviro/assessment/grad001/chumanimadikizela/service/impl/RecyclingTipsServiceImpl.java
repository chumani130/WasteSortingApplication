package com.enviro.enviro.assessment.grad001.chumanimadikizela.service.impl;

import com.enviro.enviro.assessment.grad001.chumanimadikizela.entity.RecyclingTipsEntity;
import com.enviro.enviro.assessment.grad001.chumanimadikizela.entity.WasteCategoryEntity;
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
    public RecyclingTipsEntity update(RecyclingTipsEntity recyclingTipsEntity) {
        RecyclingTipsEntity dbRecyclingTip = findById(recyclingTipsEntity.getId());
        if (dbRecyclingTip != null) {
            dbRecyclingTip.setTip(recyclingTipsEntity.getTip());
            dbRecyclingTip.setSource(recyclingTipsEntity.getSource());
            return recyclingTipsRepository.save(dbRecyclingTip);
        }
        return null;
    }

    @Override
    public List<RecyclingTipsEntity> findAll() {
        return recyclingTipsRepository.findAll();
    }

    @Override
    public RecyclingTipsEntity findById(Long id) {
        return recyclingTipsRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        recyclingTipsRepository.deleteById(id);
    }
}
