package com.ankit.DAO;

import java.util.List;

import com.ankit.model.Product;

public interface ProductRepository {
	public Product searchProduct(int code);
	public Product removeProduct(int code);
	public Product addProduct(Product product);
	public List<Product> showProducts();

}
