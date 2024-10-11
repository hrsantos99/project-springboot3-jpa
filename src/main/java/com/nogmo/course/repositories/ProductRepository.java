package com.nogmo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nogmo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
