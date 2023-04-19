package com.msa.assignment.orderservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Order implements Serializable {

    @Id
    @GeneratedValue
    private Long Id;

    @GeneratedValue
    private String orderNumber;

    public Order(){

    }

    public Long getId(){
        return Id;
    }

    public String getOrderNumber(){
        return orderNumber;
    }
}
