package com.example.graphql.repository;

import com.example.graphql.entity.PlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlanRepository extends JpaRepository<PlanEntity, Long> {
    List<PlanEntity> findByCodeIn(List<String> codes);
}
