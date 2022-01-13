package com.ibm.service;

import com.ibm.entity.OrderItem;

public interface OrderItemService {
   void addOrderItem(OrderItem orderitem);
   
   void deleteOrderItem(Long id);
   
}
