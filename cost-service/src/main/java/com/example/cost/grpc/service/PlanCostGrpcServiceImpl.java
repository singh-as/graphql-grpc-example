package com.example.cost.grpc.service;

import com.definition.grpc.cost.PlanCostRequest;
import com.definition.grpc.cost.PlanCostResponse;
import com.definition.grpc.cost.PlanCostServiceGrpc;
import com.example.cost.service.PlanCostService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GrpcService
public class PlanCostGrpcServiceImpl extends PlanCostServiceGrpc.PlanCostServiceImplBase {

    @Autowired
    private PlanCostService planCostService;

    @Override
    public void getPlanCost(PlanCostRequest request, StreamObserver<PlanCostResponse> responseObserver) {
        List<String> codes = request.getPlanCodeList();
        responseObserver.onNext(PlanCostResponse.newBuilder()
                                                .addAllCost(planCostService.planCosts(codes))
                                                .build());
        responseObserver.onCompleted();
    }
}
