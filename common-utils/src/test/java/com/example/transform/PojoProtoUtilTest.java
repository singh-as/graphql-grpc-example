package com.example.transform;

import com.example.grpc.cost.PlanCost;

import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PojoProtoUtilTest {

    private static final String CODE = "000ABC";
    private static final float EMPL_COST = 200f;
    private static final float EMPLR_COST = 800f;

    @Test
    void testPojo2Proto() throws InvalidProtocolBufferException {
        Cost cost = new Cost();
        cost.setId(1L);
        cost.setPlanCode(CODE);

        PlanCost.Builder builder = PlanCost.newBuilder();
        PojoProtoUtil.toProto(cost, builder);

        PlanCost planCost = builder.build();
        Assertions.assertEquals(planCost.getPlanCode(), cost.getPlanCode());
    }

    @Test
    void testProto2Pojo() throws InvalidProtocolBufferException {
        PlanCost planCost = PlanCost.newBuilder()
                .setEmplCovrgRate(EMPL_COST)
                .setEmplCovrgRate(EMPLR_COST)
                .setPlanCode(CODE)
                .build();

        Cost cost = PojoProtoUtil.toPojo(planCost, Cost.class);

        Assertions.assertEquals(planCost.getPlanCode(), cost.getPlanCode());
        Assertions.assertNull(cost.getId());
    }
}

class Cost {
    private Long id;
    private String planCode;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getPlanCode() { return planCode; }
    public void setPlanCode(String planCode) { this.planCode = planCode; }
}