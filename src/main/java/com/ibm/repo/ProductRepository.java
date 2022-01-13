package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}