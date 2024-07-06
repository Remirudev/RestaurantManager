package com.RestaurantManagement.RestaurantManagement.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "RESTAURANT_TABLE")
public class RestaurantTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "table_id")
    private Long tableId;

    @Column(name = "table_number")
    private int tableNumber;

    @Column(name = "seating_capacity")
    private int seatingCapacity;

    @Column(name = "is_occupied")
    private boolean isOccupied;

    private String tableimage;

}
