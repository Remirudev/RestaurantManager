package com.RestaurantManagement.RestaurantManagement.Model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok .*;
import org.checkerframework.checker.units.qual.C;


@Data
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orders_id")
    private Long ordersId;

    private Long tableId;

    private String description;

    @Column(name = "total_cost")
    private BigDecimal totalCost;

    //private LocalDateTime orderDate;
}