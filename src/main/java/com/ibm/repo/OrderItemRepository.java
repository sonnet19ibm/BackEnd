package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.OrderItem;

/**
 * This Repository is for OrderItem Entity
 * 
 * @author:Poojitha_Puligundla
 * @version:1.0
 * @since:January 2022
 * 
 */

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
