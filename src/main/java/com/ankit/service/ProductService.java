package com.ankit.service;

import java.util.List;

import com.ankit.model.Product;

public interface ProductService {
	
	public Product serachDetail(int code);
	public Product removeProduct(int code);
	public Product addProduct(Product product);
	public List<Product> showProducts();

}
