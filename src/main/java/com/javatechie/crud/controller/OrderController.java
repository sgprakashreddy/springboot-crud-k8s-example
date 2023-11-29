package com.javatechie.crud.controller;


import com.javatechie.crud.entity.Order;
import com.javatechie.crud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    public OrderService orderService;

    @PostMapping()
    public Order addOrder(@RequestBody Order order){
            return orderService.addOrder(order);
    }

    @GetMapping
    public List<Order> listOrders(){
        return orderService.getOrders();
    }

    @GetMapping("{/id}")
    public Order getOrderById(@PathVariable int id){
        return orderService.getOrderById(id);
    }


}
