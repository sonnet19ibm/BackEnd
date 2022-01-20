package com.ibm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.ProductCategory;
import com.ibm.repo.ProductCategoryRepository;

/**
 * This ServiceImpl is for ProductCategory Entity
 * 
 * @author:Ritika_Sahu
 * @version:1.0
 * @since:January 2022
 * 
 */

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

	@Autowired
	private ProductCategoryRepository repo;
	
	@Override
	public Long addProductCategory(ProductCategory productcategory) {
		repo.save(productcategory);
		return productcategory.getId();
	}

	@Override
	public void deleteProductCategory(Long id) {
		repo.deleteById(id);

	}

	@Override
	public ProductCategory getProductCategory(Long id) {
		return repo.getById(id);
		
	}

}
