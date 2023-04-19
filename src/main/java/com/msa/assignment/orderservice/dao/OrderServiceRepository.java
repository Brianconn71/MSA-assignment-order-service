package com.msa.assignment.orderservice.dao;

import com.msa.assignment.orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderServiceRepository extends JpaRepository<Order, Long> {

}
