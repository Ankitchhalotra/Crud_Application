package com.ankit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankit.DAO.ProductRepository;
import com.ankit.model.Product;

@Service
public class productServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;
	
	//Search any particular products details
	public Product serachDetail(int code) {
		Product product = repository.searchProduct(code);
	    product.setDiscount(product.getPrice()*10/100);
		
		return product;
	}

	public Product removeProduct(int pcode) {
		Product product = repository.removeProduct(pcode);
		return product;
	}

	public Product addProduct(Product product) {
		repository.addProduct(product);
		return null;
	}

	public List<Product> showProducts() {
		List<Product> product = repository.showProducts();
		return product;
	}

}
