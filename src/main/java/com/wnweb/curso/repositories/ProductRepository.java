package com.wnweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wnweb.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
