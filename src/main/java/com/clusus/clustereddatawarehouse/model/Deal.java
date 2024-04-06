package com.clusus.clustereddatawarehouse.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Deal {

    @Id
    @Column(nullable = false, unique = true)
    private Long dealId;

    private String toCurrency;

    private String fromCurrency;

    private Double amount;

    private Date time;

}
