package com.javatechie.crud.service;

import com.javatechie.crud.entity.Order;
import com.javatechie.crud.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    public OrderRepository orderRepository;


    public Order addOrder(Order order){
        return orderRepository.save(order);
    }

    public List<Order> getOrders(){
        return orderRepository.findAll();
    }

    public Order getOrderById(int id){
        return orderRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("Invalid Id entered for order "+id));
    }
}
