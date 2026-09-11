package com.example.ordermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final List<Order> orders = new ArrayList<>();

    public Order saveOrder(Order order) {
        orders.add(order);
        return order;
    }

    public Optional<Order> findOrderById(Long id) {
        return orders.stream().filter(order -> order.getId().equals(id)).findFirst();
    }

    public List<Order> findAllOrders() {
        return new ArrayList<>(orders);
    }
}