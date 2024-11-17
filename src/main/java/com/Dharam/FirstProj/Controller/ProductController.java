package com.Dharam.FirstProj.Controller;


import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Dharam.FirstProj.Services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	//@ResponseBody
	@RequestMapping(value = "/getAllProduct",method = RequestMethod.GET,produces="application/json")
	//@GetMapping(value="/getAllProduct")
	public HashMap<Integer,String> getAllProduct()
	{
		return productService.getAllProduct();
	}
	
	@RequestMapping(value="/getProduct/{id}",method = RequestMethod.GET,produces="application/json")
	public String getProduct(@PathVariable int id)
	{
		return productService.getProduct(id);
	}

}
