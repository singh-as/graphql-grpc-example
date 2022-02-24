package com.example.graphql.data.fetcher;

import com.definition.grpc.cost.PlanCost;
import com.definition.grpc.document.Document;
import com.example.graphql.entity.PlanEntity;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.DgsQuery;
import com.example.graphql.model.Plan;
import com.example.graphql.model.PlanAttribute;
import com.example.graphql.service.PlanService;
import graphql.schema.DataFetchingEnvironment;
import org.dataloader.DataLoader;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@DgsComponent
public class PlanDataFetcher {

    @Autowired
    private PlanService planService;

    @DgsQuery
    @Transactional
    public List<Plan> viewPlans(DataFetchingEnvironment environment, List<String> planCodes) {

        List<PlanEntity> planEntities = planService.plans(planCodes);
        boolean fetchAttributes = environment.getSelectionSet().contains("attributes");

        return planEntities
                    .stream()
                    .map(entity -> {
                        Plan.PlanBuilder builder = Plan.builder()
                                                        .code(entity.getCode())
                                                        .name(entity.getName())
                                                        .benefitType(entity.getBenefitType())
                                                        .carrier(entity.getCarrier());
                        if (fetchAttributes) {
                            builder.attributes(
                                    entity.getAttributes()
                                            .stream()
                                            .map(attrEntity -> new PlanAttribute(attrEntity.getName(),
                                                                                 attrEntity.getValue()))
                                            .collect(Collectors.toList()));
                        }
                        return builder.build();
                    })
                    .collect(Collectors.toList());
    }

    @DgsData(parentType = "Plan")
    public CompletableFuture<PlanCost> cost(DgsDataFetchingEnvironment dfe) {
        DataLoader<String, PlanCost> dataLoader = dfe.getDataLoader("cost");
        Plan pln = dfe.getSource();
        return dataLoader.load(pln.getCode());
    }

    @DgsData(parentType = "Plan")
    public CompletableFuture<Document> document(DgsDataFetchingEnvironment dfe) {
        DataLoader<String, Document> dataLoader = dfe.getDataLoader("document");
        Plan pln = dfe.getSource();
        return dataLoader.load(pln.getCode());
    }
}
