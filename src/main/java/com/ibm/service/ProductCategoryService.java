package com.ibm.service;

import com.ibm.entity.ProductCategory;

/**
 * This Service is for ProductCategory Entity
 * 
 * @author:Ritika_Sahu
 * @version:1.0
 * @since:January 2022
 * 
 */

public interface ProductCategoryService {
	Long addProductCategory(ProductCategory productcategory);
	
	ProductCategory getProductCategory(Long id);

	void deleteProductCategory(Long id);
}
