package com.RestaurantManagement.RestaurantManagement.Repository;

import com.RestaurantManagement.RestaurantManagement.Model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
