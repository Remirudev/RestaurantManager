package com.RestaurantManagement.RestaurantManagement.Controller;

import com.RestaurantManagement.RestaurantManagement.Service.OrdersServiceImpl;
import com.RestaurantManagement.RestaurantManagement.Model.OrderMenuitem;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/ordermenuitem")
public class OrderMenuitemController {

    private final OrdersServiceImpl ordersServiceImpl;

    public OrderMenuitemController(OrdersServiceImpl ordersServiceImpl) {
        this.ordersServiceImpl = ordersServiceImpl;
    }

    @PostMapping
    public OrderMenuitem addOrderMenuitem(@RequestBody OrderMenuitem orderMenuitem) {
        return ordersServiceImpl.addOrderMenuitem(orderMenuitem);
    }

    @GetMapping
    public List<OrderMenuitem> getAllOrderMenuitems() {
        return ordersServiceImpl.getAllOrderMenuitems();
    }

    @DeleteMapping("/{id}")
    public void deleteOrderMenuitem(@PathVariable Long id) {
        ordersServiceImpl.deleteOrderMenuitem(id);
    }
}
