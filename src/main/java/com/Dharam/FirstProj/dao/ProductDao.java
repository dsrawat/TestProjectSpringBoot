package com.Dharam.FirstProj.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	
	HashMap<Integer,String> Product=new HashMap<Integer,String>();
	
	public ProductDao()
	{
		Product.put(1, "Window Laptop");
		Product.put(2,"Apple MacBook");
		Product.put(3,"Applie Ipad");
	}
	
	
	
	
	public HashMap<Integer,String> getAllProduct()
	{
		return Product;
	}
	
	public String getProduct(int id)
	{
		return Product.get(id);
	}

}
