package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Product;
import com.ibm.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repo;
	
	@Override
	public void addProduct(Product product) {
		repo.save(product);
	}

	@Override
	public void deleteProduct(Long id) {
		repo.deleteById(id);
	}

	@Override
	public void updateProduct(Product product) {
		repo.save(product);
	}

	@Override
	public List<Product> getProducts() {
		return repo.findAll();
	}

}
