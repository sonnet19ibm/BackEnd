package com.ibm.service;

import java.util.List;

import com.ibm.entity.Product;

public interface ProductService {

	void addProduct(Product product);
	
	void deleteProduct(Long id);
	
	void updateProduct(Product product);
	
	List<Product> getProducts();
	
	
}
