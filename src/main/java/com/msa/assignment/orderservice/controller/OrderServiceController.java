package com.msa.assignment.orderservice.controller;

import com.msa.assignment.orderservice.dao.OrderServiceRepository;
import com.msa.assignment.orderservice.entity.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Service
@RequiredArgsConstructor
@RequestMapping("/api/orders")
public class OrderServiceController {

    private final OrderServiceRepository orderRepo;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Order> findAll(){
        return orderRepo.findAll();
    }
}
