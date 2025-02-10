package com.enviro.enviro.assessment.grad001.chumanimadikizela.controller;

import com.enviro.enviro.assessment.grad001.chumanimadikizela.entity.DisposalGuideEntity;
import com.enviro.enviro.assessment.grad001.chumanimadikizela.entity.RecyclingTipsEntity;
import com.enviro.enviro.assessment.grad001.chumanimadikizela.service.RecyclingTipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recycling-tips")
public class RecyclingTipsController {

    @Autowired
    private RecyclingTipsService recyclingTipsService;

//    public RecyclingTipsController(RecyclingTipsService recyclingTipsService) {
//        this.recyclingTipsService = recyclingTipsService;
//    }

    @PostMapping
    public RecyclingTipsEntity createRecyclingTip(@RequestBody RecyclingTipsEntity recyclingTip) {
        return recyclingTipsService.save(recyclingTip);
    }


    @GetMapping
    public List<RecyclingTipsEntity> getAllRecyclingTips() {
        return recyclingTipsService.findAll();
    }

    @GetMapping("/{id}")
    public RecyclingTipsEntity getRecyclingTipById(@PathVariable Long id) {
        return recyclingTipsService.findById(id);
    }

    @PutMapping("/{id}")
    public RecyclingTipsEntity updateRecyclingTip(@PathVariable Long id, @RequestBody RecyclingTipsEntity recyclingTipsEntity) {
        return recyclingTipsService.update(recyclingTipsEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteRecyclingTip(@PathVariable Long id) {
        recyclingTipsService.deleteById(id);
    }
}
