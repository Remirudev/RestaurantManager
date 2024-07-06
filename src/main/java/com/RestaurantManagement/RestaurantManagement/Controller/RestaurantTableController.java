package com.RestaurantManagement.RestaurantManagement.Controller;

import com.RestaurantManagement.RestaurantManagement.Model.Chair;
import com.RestaurantManagement.RestaurantManagement.Model.RestaurantTable;
import com.RestaurantManagement.RestaurantManagement.Service.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/table")
public class RestaurantTableController {

    private OrdersServiceImpl ordersServiceImpl;
    @Autowired
    public RestaurantTableController(OrdersServiceImpl ordersServiceImpl) {
        this.ordersServiceImpl = ordersServiceImpl;
    }

    @PostMapping
    public ResponseEntity<RestaurantTable> createTable(@RequestBody RestaurantTable restaurantTable) {
        RestaurantTable newRestaurantTable = ordersServiceImpl.addRestaurantTable(restaurantTable);
        return new ResponseEntity<>(newRestaurantTable, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<RestaurantTable>> getTables() {
        List<RestaurantTable> listTables = ordersServiceImpl.getAllRestaurantTables();
        return new ResponseEntity<>(listTables, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTable(@PathVariable Long id) {
        ordersServiceImpl.deleteRestaurantTable(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @PostMapping("/chair")
    public ResponseEntity<Chair> createChair(@RequestBody Chair chair) {
        Chair newChair = ordersServiceImpl.addChair(chair);
        return new ResponseEntity<>(newChair, HttpStatus.CREATED);
    }

    @GetMapping("/chair")
    public ResponseEntity<List<Chair>> getChairs() {
        List<Chair> chairList = ordersServiceImpl.getAllChairs();
        return new ResponseEntity<>(chairList, HttpStatus.OK);
    }

    @DeleteMapping("/chair/{id}")
    public ResponseEntity<Void> deleteChair(@PathVariable Long id) {
        ordersServiceImpl.deleteChair(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
