package com.project.blogsite.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.blogsite.model.Order;
import com.project.blogsite.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping("/orders/api")
    public String ordersList() throws JsonProcessingException {
        Order order = new Order();
        order.id = 1;
        order.name = "user";
        order.drink = "cola";
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        String json = objectMapper.writeValueAsString(order);
        return json;

//        List<Order> orderList = new ArrayList<>();
//        orderList.add(order);
//        return orderList;
    }

}
