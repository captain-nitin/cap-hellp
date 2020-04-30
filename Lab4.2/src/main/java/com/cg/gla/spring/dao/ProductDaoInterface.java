package com.cg.gla.spring.dao;

import java.util.List;

import com.cg.gla.spring.entity.Product;
import com.cg.gla.spring.entity.ProductOld;


public interface ProductDaoInterface {
	
	public boolean create(Product product);
	public List<Product> reterivev1();
//	public List<ProductOld> reterieve();

}
