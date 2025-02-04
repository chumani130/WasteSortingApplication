package com.enviro.enviro.assessment.grad001.chumanimadikizela.controller;

import com.enviro.enviro.assessment.grad001.chumanimadikizela.entity.DisposalGuideEntity;
import com.enviro.enviro.assessment.grad001.chumanimadikizela.service.DisposalGuideService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/disposal-guides")
public class DisposalGuideController {
    private final DisposalGuideService disposalGuideService;


    public DisposalGuideController(DisposalGuideService disposalGuideService) {
        this.disposalGuideService = disposalGuideService;
    }

    @PostMapping
    public DisposalGuideEntity createDisposalGuide(@RequestBody DisposalGuideEntity guideline) {
        return disposalGuideService.save(guideline);
    }

    @GetMapping
    public List<DisposalGuideEntity> getAllGuides() {
        return disposalGuideService.findAll();
    }

    @GetMapping("/{id}")
    public DisposalGuideEntity getGuideById(@PathVariable Long id) {
        return disposalGuideService.findById(id);
    }

    @PutMapping("/{id}")
    public DisposalGuideEntity updateGuide(@PathVariable Long id, @RequestBody DisposalGuideEntity guide) {
//        guide.setId(id);
        return disposalGuideService.update(guide);
    }

    @DeleteMapping("/{id}")
    public void deleteGuide(@PathVariable Long id) {
        disposalGuideService.deleteById(id);
    }
}
