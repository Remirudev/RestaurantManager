package com.RestaurantManagement.RestaurantManagement.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OrderMenuitem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long menuitemId;

    private Long orderId;

    private int quantity;
}
