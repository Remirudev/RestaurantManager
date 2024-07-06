package com.RestaurantManagement.RestaurantManagement.Repository;

import com.RestaurantManagement.RestaurantManagement.Model.Chair;
import com.RestaurantManagement.RestaurantManagement.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}