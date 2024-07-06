package com.RestaurantManagement.RestaurantManagement.Model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class RestaurantInformations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long restaurantInfoId;

    private String name;


}
