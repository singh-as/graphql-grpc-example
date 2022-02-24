package com.example.cost.service.impl;

import com.definition.grpc.cost.PlanCost;
import com.example.cost.entity.CostEntity;
import com.example.cost.repository.CostRepository;
import com.example.cost.service.PlanCostService;
import com.example.transform.PojoProtoUtil;
import com.google.protobuf.InvalidProtocolBufferException;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
public class PlanCostServicempl implements PlanCostService {

    @Autowired
    private CostRepository costRepository;

    public List<PlanCost> planCosts(List<String> codes) {
        List<CostEntity> entities = costRepository.findByPlanCodeIn(codes);
        List<PlanCost> costs = new ArrayList(entities.size());
        for (CostEntity entity : entities) {
            try {
                PlanCost.Builder builder = PlanCost.newBuilder();
                PojoProtoUtil.toProto(entity, builder);
                costs.add(builder.build());
            } catch (InvalidProtocolBufferException e) {
                log.error(e);
            }
        }
        return costs;
    }
}
