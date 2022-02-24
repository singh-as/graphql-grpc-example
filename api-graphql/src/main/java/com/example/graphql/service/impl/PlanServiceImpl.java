package com.example.graphql.service.impl;

import com.example.graphql.entity.PlanEntity;
import com.example.graphql.repository.PlanRepository;
import com.example.graphql.service.PlanService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanRepository planRepository;

    public List<PlanEntity> plans(List<String> codes) {
        log.info("fetching plans");
        return planRepository.findByCodeIn(codes);
    }

}
