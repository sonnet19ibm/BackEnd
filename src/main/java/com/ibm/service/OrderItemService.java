package com.ibm.service;

import java.util.List;

import com.ibm.entity.OrderItem;

public interface OrderItemService {
   void addOrderItem(OrderItem orderitem);
   
   void deleteOrderItem(Long id);
   
   Long updateOrderItem(OrderItem orderitem, Long id);
   
   List<OrderItem> getOrderItems();
   
}
