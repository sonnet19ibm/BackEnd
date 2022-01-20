package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.Order;

/**
 * This Repository is for Order Entity
 * 
 * @author:Poojitha_Puligundla
 * @version:1.0
 * @since:January 2022
 * 
 */

public interface OrderRepository extends JpaRepository<Order, Long> {

}
