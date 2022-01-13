package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
