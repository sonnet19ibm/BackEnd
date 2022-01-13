package com.ibm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.ProductCategory;
import com.ibm.repo.ProductCategoryRepository;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

	@Autowired
	private ProductCategoryRepository repo;
	
	@Override
	public void addProductCategory(ProductCategory productcategory) {
		repo.save(productcategory);
	}

	@Override
	public void deleteProductCategory(Long id) {
		repo.deleteById(id);

	}

}
