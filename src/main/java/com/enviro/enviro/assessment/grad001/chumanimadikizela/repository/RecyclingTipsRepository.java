package com.enviro.enviro.assessment.grad001.chumanimadikizela.repository;

import com.enviro.enviro.assessment.grad001.chumanimadikizela.entity.RecyclingTipsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class RecyclingTipsRepository extends JpaRepository<RecyclingTipsEntity, Long> {
}
