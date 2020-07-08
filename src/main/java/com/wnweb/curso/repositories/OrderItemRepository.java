package com.wnweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wnweb.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
