package com.example.cost.repository;

import com.example.cost.entity.CostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CostRepository extends JpaRepository<CostEntity, Long> {

    List<CostEntity> findByPlanCodeIn(List<String> codes);
}
