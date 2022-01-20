package com.ibm.service;

import java.util.List;

import com.ibm.entity.Product;

/**
 * This Service is for Product Entity
 * 
 * @author:Ritika_Sahu
 * @version:1.0
 * @since:January 2022
 * 
 */

public interface ProductService {

	Long addProduct(Product product, Long id);
	
	void deleteProduct(Long id);
	
	void updateProduct(Product product);
	
	List<Product> getProducts();

	
	
	
}
