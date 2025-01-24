package com.enviro.enviro.assessment.grad001.chumanimadikizela.repository;

import com.enviro.enviro.assessment.grad001.chumanimadikizela.entity.WasteCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WasteCategoryRepository extends JpaRepository<WasteCategoryEntity, Long> {
}
