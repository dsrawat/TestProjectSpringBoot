package com.Dharam.FirstProj.Services;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dharam.FirstProj.dao.ProductDao;

@Service
public class ProductService {
	
	@Autowired
	ProductDao productdao;
	
	public HashMap<Integer,String> getAllProduct()
	{
		return productdao.getAllProduct();
	}
	
	public String getProduct(int id)
	{
		return productdao.getProduct(id);
	}

}
