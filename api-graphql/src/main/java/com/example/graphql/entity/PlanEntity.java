package com.example.graphql.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name="plan")
public class PlanEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String carrier;

    @Column(name="benefit_type")
    private String benefitType;

    @OneToMany(mappedBy="plan")
    private Set<PlanAttributeEntity> attributes;
}
