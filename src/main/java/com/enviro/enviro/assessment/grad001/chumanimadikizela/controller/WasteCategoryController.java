package com.enviro.enviro.assessment.grad001.chumanimadikizela.controller;

import com.enviro.enviro.assessment.grad001.chumanimadikizela.entity.WasteCategoryEntity;
import com.enviro.enviro.assessment.grad001.chumanimadikizela.service.WasteCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/waste-categories")
public class WasteCategoryController {

    @Autowired
    private final WasteCategoryService wasteCategoryService;

    public WasteCategoryController(WasteCategoryService wasteCategoryService) {
        this.wasteCategoryService = wasteCategoryService;
    }

    @PostMapping
    public WasteCategoryEntity createWasteCategory(@RequestBody WasteCategoryEntity wasteCategoryEntity) {
        return wasteCategoryService.save(wasteCategoryEntity);
    }

    @GetMapping
    public List<WasteCategoryEntity> getAllWasteCategories() {
        return wasteCategoryService.findAll();
    }

    @GetMapping("/{id}")
    public WasteCategoryEntity getWasteCategoryById(@PathVariable Long id) {
        return wasteCategoryService.findById(id);
    }

    @PutMapping("/{id}")
    public WasteCategoryEntity updateWasteCategory(@PathVariable Long id, @RequestBody WasteCategoryEntity wasteCategoryEntity) {
        return wasteCategoryService.update(wasteCategoryEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteWasteCategory(@PathVariable Long id) {
        wasteCategoryService.deleteById(id);
    }
}
