package com.RestaurantManagement.RestaurantManagement.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok .*;


@Data
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ordersId;

    private String description;

    private BigDecimal totalCost;

    private LocalDateTime orderDate;

    private Long customerId;

}