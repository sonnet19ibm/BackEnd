package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.entity.Product;

/**
 * This Repository is for Product Entity
 * 
 * @author:Ritika_Sahu
 * @version:1.0
 * @since:January 2022
 * 
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}