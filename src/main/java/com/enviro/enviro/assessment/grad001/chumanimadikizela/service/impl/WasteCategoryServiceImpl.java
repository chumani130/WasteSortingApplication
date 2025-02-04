package com.enviro.enviro.assessment.grad001.chumanimadikizela.service.impl;

import com.enviro.enviro.assessment.grad001.chumanimadikizela.entity.WasteCategoryEntity;
import com.enviro.enviro.assessment.grad001.chumanimadikizela.repository.WasteCategoryRepository;
import com.enviro.enviro.assessment.grad001.chumanimadikizela.service.WasteCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WasteCategoryServiceImpl implements WasteCategoryService {

    private final WasteCategoryRepository wasteCategoryRepository;

    @Override
    public WasteCategoryEntity save(WasteCategoryEntity wasteCategoryEntity) {
        return wasteCategoryRepository.save(wasteCategoryEntity);
    }

    @Override
    public WasteCategoryEntity update(WasteCategoryEntity wasteCategoryEntity) {
        WasteCategoryEntity dbWasteCategory = findById(wasteCategoryEntity.getId());
        if (dbWasteCategory != null) {
            dbWasteCategory.setCategory(wasteCategoryEntity.getCategory());
            dbWasteCategory.setDescription(wasteCategoryEntity.getDescription());
            return wasteCategoryRepository.save(dbWasteCategory);
        }
        return null;
    }

    @Override
    public List<WasteCategoryEntity> findAll() {
        return wasteCategoryRepository.findAll();
    }

    @Override
    public WasteCategoryEntity findById(Long id) {
        return wasteCategoryRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        wasteCategoryRepository.deleteById(id);
    }
}
