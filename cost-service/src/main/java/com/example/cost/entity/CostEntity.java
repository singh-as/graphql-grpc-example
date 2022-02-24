package com.example.cost.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(name="cost")
public class CostEntity implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="code")
    private String planCode;

    @Column(name="empl_covrg_rate")
    private float emplCovrgRate;

    @Column(name="emplr_covrg_rate")
    private float emplrCovrgRate;
}
