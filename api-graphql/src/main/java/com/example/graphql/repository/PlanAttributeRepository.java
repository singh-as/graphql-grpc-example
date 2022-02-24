package com.example.graphql.repository;

import com.example.graphql.entity.PlanAttributeEntity;
import com.example.graphql.entity.PlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlanAttributeRepository extends JpaRepository<PlanAttributeEntity, Long> {

}
