package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
