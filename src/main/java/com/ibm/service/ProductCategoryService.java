package com.ibm.service;

import com.ibm.entity.ProductCategory;

public interface ProductCategoryService {
	Long addProductCategory(ProductCategory productcategory);
	
	ProductCategory getProductCategory(Long id);

	void deleteProductCategory(Long id);
}
