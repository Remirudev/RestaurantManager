package com.RestaurantManagement.RestaurantManagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Entity
@Data
public class OpeningHour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long openingHourId;


    @ManyToOne
    @JoinColumn(name = "restaurant_info_id", nullable = false)
    private RestaurantInformations restaurantInfoId;

    private String referencedDay;

    private String openingTime;

    private String closingTime;



}