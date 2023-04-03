package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
