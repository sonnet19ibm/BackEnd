package com.ibm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.ProductCategory;
import com.ibm.service.ProductCategoryService;

@CrossOrigin
@RestController
public class ProductCategoryController {

	@Autowired
	private ProductCategoryService service;
	
	@PostMapping(value="/productcategory", consumes = "application/json")
	void addProductCategory(@RequestBody ProductCategory productcategory)
	{
		service.addProductCategory(productcategory);
	}
	
	@DeleteMapping(value = "/productcategory/{id}")
	public void deleteProductCategory(@PathVariable("id") Long id) {
		service.deleteProductCategory(id);
	}
}
