package com.ankit.controller;

import java.io.IOException;
import java.sql.Blob;
import java.util.List;

import javax.validation.Valid;

import org.hibernate.engine.jdbc.BlobProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ankit.model.Product;
import com.ankit.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService service;

	
	@RequestMapping("saveChange")
	public ModelAndView saveChange(@ModelAttribute("product") Product product) {
		service.addProduct(product);
		ModelAndView mv = new ModelAndView("redirect:allProduct.jsp");		
		return mv;
	}
	
	@RequestMapping("update")
	public ModelAndView updateProduct(@RequestParam("code") int pcode) {
		Product product = service.serachDetail(pcode);
		ModelAndView mv = new ModelAndView("pupdate");
		mv.addObject("product", product);
		return mv;
	}
	
	
	@RequestMapping("showAllProduct")
	public ModelAndView showAllProducts() {
		List<Product> product = service.showProducts();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("allProduct");
		mv.addObject("info", product);
		return mv;
	}
	
	
	@RequestMapping("addProduct")
	public ModelAndView addProducts(@Valid @ModelAttribute("info") Product product,@RequestParam("photo") MultipartFile file, BindingResult result) {		
		System.out.println(product+" "+file);
		if(result.hasErrors()) {
			ModelAndView mv = new ModelAndView();
			//mv.setViewName("addProduct");
			mv.setViewName("error");
			return mv;
		}
		
		
		 try {
	            // Convert MultipartFile to Blob
	            byte[] fileBytes = file.getBytes();
	            Blob blob = BlobProxy.generateProxy(fileBytes);

	            // Set Blob to the product
	            product.setPhoto(blob);
	        } catch (IOException e) {
	            e.printStackTrace();
	            // Handle the exception appropriately, possibly returning an error response
	        }
		
			
		service.addProduct(product);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("saveConfirm");
		mv.addObject("info", product);
		
		return mv;
	}
	@RequestMapping("addProductData")
	public String addproduct() {
		
		return "addProduct";
	}
	
	
	@RequestMapping("remove")
	public ModelAndView remove(@RequestParam("pcode") int pcode) {
		
		Product product = service.removeProduct(pcode);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteData");
		mv.addObject("info", product);
		return mv;
	}	
	
	@RequestMapping("removeProduct")
	public String removeProduct() {
		
		return "DeleteInput";
	}

	
	
	@RequestMapping("searchDetails")
	public ModelAndView searchDetails(@RequestParam("pcode") int pcode) {
		Product product = service.serachDetail(pcode);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Result");
		mv.addObject("info", product);
		return mv;
		
	}	
	@RequestMapping("searchProduct")
	public String searchProduct() {
		
		return "input";
	}

}
