package com.RestaurantManagement.RestaurantManagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class RestaurantTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int tableNumber;

    private int seatingCapacity;

    private boolean isOccupied;

}
