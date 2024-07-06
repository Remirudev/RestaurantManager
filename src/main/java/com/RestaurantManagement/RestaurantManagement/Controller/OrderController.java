package com.RestaurantManagement.RestaurantManagement.Controller;

import com.RestaurantManagement.RestaurantManagement.Model.Orders;
import com.RestaurantManagement.RestaurantManagement.Model.RestaurantTable;
import com.RestaurantManagement.RestaurantManagement.Service.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/orders")
public class OrderController {


    private OrdersServiceImpl ordersServiceImpl;

    @Autowired
    public OrderController(OrdersServiceImpl ordersServiceImpl) {
        this.ordersServiceImpl = ordersServiceImpl;
    }

    @PostMapping
    public ResponseEntity<Orders> addOrder(@RequestBody Orders order) {
        Orders savedOrder = ordersServiceImpl.addOrder(order);
        return ResponseEntity.ok(savedOrder);
    }


    @GetMapping
    public ResponseEntity<List<Orders>> getAllOrders() {
        List<Orders> orders = ordersServiceImpl.getAllOrders();
        return ResponseEntity.ok(orders);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
        ordersServiceImpl.deleteOrder(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


}
