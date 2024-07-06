package com.RestaurantManagement.RestaurantManagement.Model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Menuitem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menuitem_id")
    private Long menuitemId;

    private String name;

    private Double price;

    private String description;

    private String menuitemimg;

}
