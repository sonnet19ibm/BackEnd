package com.ibm.service;

import com.ibm.entity.ProductCategory;

public interface ProductCategoryService {
	void addProductCategory(ProductCategory productcategory);

	void deleteProductCategory(Long id);
}
