package com.ibm.service;

import java.util.List;

import com.ibm.entity.OrderItem;

/**
 * This Service is for OrderItem
 * 
 * @author:Poojitha_Puligundla
 * @version:1.0
 * @since:January 2022
 * 
 */

public interface OrderItemService {
   void addOrderItem(OrderItem orderitem);
   
   void deleteOrderItem(Long id);
   
   Long updateOrderItem(OrderItem orderitem, Long id);
   
   List<OrderItem> getOrderItems();
   
}
