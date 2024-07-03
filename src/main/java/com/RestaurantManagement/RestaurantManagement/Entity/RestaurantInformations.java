package com.RestaurantManagement.RestaurantManagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
public class RestaurantInformations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long restaurantInfoId;

    private String name;


}
