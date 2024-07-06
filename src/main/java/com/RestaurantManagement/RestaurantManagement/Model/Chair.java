package com.RestaurantManagement.RestaurantManagement.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Chair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chairId;

    @ManyToOne
    @JoinColumn(name = "table_id", nullable = false)
    private RestaurantTable restaurantTable;

    private int chairNumber;

    private String chairImage = "https://firebasestorage.googleapis.com/v0/b/restaurantm-ff08b.appspot.com/o/stool.png?alt=media&token=031cadfc-e216-489d-8e9c-eb93a1b953db";
}
