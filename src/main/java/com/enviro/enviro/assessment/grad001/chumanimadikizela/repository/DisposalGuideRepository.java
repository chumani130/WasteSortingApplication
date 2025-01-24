package com.enviro.enviro.assessment.grad001.chumanimadikizela.repository;

import com.enviro.enviro.assessment.grad001.chumanimadikizela.entity.DisposalGuideEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisposalGuideRepository extends JpaRepository<DisposalGuideEntity, Long> {
}
