package com.RestaurantManagement.RestaurantManagement.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.awt.*;

@Entity
@Data
public class OrderMenuitem {

    @Id
    @ManyToOne
    @JoinColumn(name = "menuitem_id", nullable = false)
    private Menuitem menuitem;

    @Id
    @ManyToOne
    @JoinColumn(name = "orders_id", nullable = false)
    private Orders orders;

    private int quantity;
}
