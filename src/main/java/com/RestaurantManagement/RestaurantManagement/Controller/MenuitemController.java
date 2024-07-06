package com.RestaurantManagement.RestaurantManagement.Controller;

import com.RestaurantManagement.RestaurantManagement.Model.Menuitem;
import com.RestaurantManagement.RestaurantManagement.Service.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/menuitems")
public class MenuitemController {
    private final OrdersServiceImpl ordersServiceImpl;

    @Autowired
    public MenuitemController(OrdersServiceImpl ordersServiceImpl) {
        this.ordersServiceImpl = ordersServiceImpl;
    }

    @PostMapping
    public ResponseEntity<Menuitem> addMenuItem(@RequestBody Menuitem menuitem) {
        return ResponseEntity.ok(this.ordersServiceImpl.addMenuitem(menuitem));
    }

    @GetMapping
    public ResponseEntity<List<Menuitem>> getAllMenuItems() {
        try {
            return ResponseEntity.ok(this.ordersServiceImpl.getAllMenuitems());
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMenuItem(@PathVariable Long id) {
        this.ordersServiceImpl.deleteMenuitem(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
