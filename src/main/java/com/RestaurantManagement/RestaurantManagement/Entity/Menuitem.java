package com.RestaurantManagement.RestaurantManagement.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class Menuitem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuitemId;

    private String name;

    private Double price;

    private String description;

}
