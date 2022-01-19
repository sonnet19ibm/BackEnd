package com.ibm.service;

import java.util.List;

import com.ibm.entity.Product;

public interface ProductService {

	Long addProduct(Product product, Long id);
	
	void deleteProduct(Long id);
	
	void updateProduct(Product product);
	
	List<Product> getProducts();

	
	
	
}
