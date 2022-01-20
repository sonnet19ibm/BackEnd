package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entity.Product;
import com.ibm.service.ProductService;

/**
 * This Controller is for Adding/Deleting/Updating/Getting Product
 * 
 * @author:Ritika_Sahu
 * @version:1.0
 * @since:January 2022
 * 
 */

@CrossOrigin
@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@PostMapping(value = "/product/{id}", consumes = "application/json")
	void addProduct(@RequestBody Product product, @PathVariable Long id)
	{
		service.addProduct(product, id);
	}
	
	@DeleteMapping(value = "/product/{id}")
	public void deleteProduct(@PathVariable("id") Long id) {
		service.deleteProduct(id);
	}
	
	@PutMapping(value = "/productupdate", consumes = "application/json")
	public void updateProduct(@RequestBody Product product) {
		service.updateProduct(product);
	}
	
	@GetMapping(value="/listproducts", produces = "application/json")
	public List<Product> getProduct(){
		return service.getProducts();
	}
}
