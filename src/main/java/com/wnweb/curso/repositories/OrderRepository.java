package com.wnweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wnweb.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
