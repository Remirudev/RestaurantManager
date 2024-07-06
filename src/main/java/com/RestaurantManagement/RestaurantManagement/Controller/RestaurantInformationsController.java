package com.RestaurantManagement.RestaurantManagement.Controller;

import com.RestaurantManagement.RestaurantManagement.Model.RestaurantInformations;
import com.RestaurantManagement.RestaurantManagement.Service.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
public class RestaurantInformationsController {
    private OrdersServiceImpl ordersServiceImpl;
    @Autowired
    public RestaurantInformationsController(OrdersServiceImpl ordersServiceImpl) {
        this.ordersServiceImpl = ordersServiceImpl;
    }

    @GetMapping
    public List<RestaurantInformations> getAllRestaurantInformations() {
        return ordersServiceImpl.getAllRestaurantInformations();
    }

    @PostMapping
    public RestaurantInformations createRestaurantInformations(@RequestBody RestaurantInformations restaurantInformations) {
        return ordersServiceImpl.addRestaurantInformations(restaurantInformations);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRestaurantInformations(@PathVariable Long id) {
        ordersServiceImpl.deleteRestaurantInformations(id);
        return ResponseEntity.ok().build();
    }
}
