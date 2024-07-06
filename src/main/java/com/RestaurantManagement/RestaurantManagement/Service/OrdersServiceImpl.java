package com.RestaurantManagement.RestaurantManagement.Service;

import com.RestaurantManagement.RestaurantManagement.Model.*;
import com.RestaurantManagement.RestaurantManagement.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl {
    private OrdersRepository ordersRepository;
    private RestaurantTableRepository restaurantTableRepository;
    private ChairRepository chairRepository;
    private EmployeeRepository employeeRepository;
    private MenuitemRepository menuitemRepository;
    private OpeningHourRepository openingHourRepository;
    private OrderMenuitemRepository orderMenuitemRepository;
    private RestaurantInformationsRepository restaurantInformationsRepository;

    @Autowired
    public OrdersServiceImpl(OrdersRepository ordersRepository, RestaurantTableRepository restaurantTableRepository, ChairRepository chairRepository, EmployeeRepository employeeRepository, MenuitemRepository menuitemRepository, OpeningHourRepository openingHourRepository, OrderMenuitemRepository orderMenuitemRepository, RestaurantInformationsRepository restaurantInformationsRepository) {
        this.ordersRepository = ordersRepository;
        this.restaurantTableRepository = restaurantTableRepository;
        this.chairRepository = chairRepository;
        this.employeeRepository = employeeRepository;
        this.menuitemRepository = menuitemRepository;
        this.openingHourRepository = openingHourRepository;
        this.orderMenuitemRepository = orderMenuitemRepository;
        this.restaurantInformationsRepository = restaurantInformationsRepository;
    }


    // Employee
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    // Menuitem
    public Menuitem addMenuitem(Menuitem menuitem) {
        return menuitemRepository.save(menuitem);
    }

    public List<Menuitem> getAllMenuitems() {
        return menuitemRepository.findAll();
    }

    public void deleteMenuitem(Long id) {
        menuitemRepository.deleteById(id);
    }

    // OpeningHour
    public OpeningHour addOpeningHour(OpeningHour openingHour) {
        return openingHourRepository.save(openingHour);
    }

    public List<OpeningHour> getAllOpeningHours() {
        return openingHourRepository.findAll();
    }

    public void deleteOpeningHour(Long id) {
        openingHourRepository.deleteById(id);
    }

    // OrderMenuitem
    public OrderMenuitem addOrderMenuitem(OrderMenuitem orderMenuitem) {
        return orderMenuitemRepository.save(orderMenuitem);
    }

    public List<OrderMenuitem> getAllOrderMenuitems() {
        return orderMenuitemRepository.findAll();
    }

    public void deleteOrderMenuitem(Long id) {
        orderMenuitemRepository.deleteById(id);
    }

    // RestaurantInformations
    public RestaurantInformations addRestaurantInformations(RestaurantInformations restaurantInformations) {
        return restaurantInformationsRepository.save(restaurantInformations);
    }

    public List<RestaurantInformations> getAllRestaurantInformations() {
        return restaurantInformationsRepository.findAll();
    }

    public void deleteRestaurantInformations(Long id) {
        restaurantInformationsRepository.deleteById(id);
    }

    // Orders
    public List<Orders> getAllOrders() {
        return ordersRepository.findAll();
    }

    public Orders addOrder(Orders order) {
        return ordersRepository.save(order);
    }

    public void deleteOrder(Long id) {
        ordersRepository.deleteById(id);
    }

    // RestaurantTable
    public List<RestaurantTable> getAllRestaurantTables() {
        return restaurantTableRepository.findAll();
    }

    public RestaurantTable addRestaurantTable(RestaurantTable restaurantTable) {
        return restaurantTableRepository.save(restaurantTable);
    }

    public void deleteRestaurantTable(Long id) {
        restaurantTableRepository.deleteById(id);
    }

    // Chair
    public List<Chair> getAllChairs() {
        return chairRepository.findAll();
    }

    public Chair addChair(Chair chair) {
        return chairRepository.save(chair);
    }

    public void deleteChair(Long id) {
        chairRepository.deleteById(id);
    }


}
