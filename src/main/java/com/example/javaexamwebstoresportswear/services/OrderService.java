package com.example.javaexamwebstoresportswear.services;

import com.example.javaexamwebstore.models.Order;
import com.example.javaexamwebstore.models.User;
import com.example.javaexamwebstore.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService
{
    private final OrderRepository orderRepository;
    public OrderService(OrderRepository orderRepository)
    {
        this.orderRepository = orderRepository;
    }
    public List<Order> getOrdersByUser(User user)
    {
        return orderRepository.findByUser(user);
    }
    public void saveOrder(Order order)
    {
        orderRepository.save(order);
    }
    public List<Order> getAllOrders()
    {
        return orderRepository.findAll();
    }
}