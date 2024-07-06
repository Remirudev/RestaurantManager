package com.RestaurantManagement.RestaurantManagement.Repository;

import com.RestaurantManagement.RestaurantManagement.Model.Chair;
import com.RestaurantManagement.RestaurantManagement.Model.RestaurantInformations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantInformationsRepository extends JpaRepository<RestaurantInformations, Long> {
}