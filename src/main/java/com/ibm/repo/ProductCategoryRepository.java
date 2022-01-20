package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.entity.ProductCategory;

/**
 * This Repository is for ProductCategory Entity
 * 
 * @author:Ritika_Sahu
 * @version:1.0
 * @since:January 2022
 * 
 */

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
