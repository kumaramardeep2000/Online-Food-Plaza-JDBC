package com.project.coreJava.controller.service.impl;

import java.util.List;

import com.project.coreJava.DTO.ProductDTO;
import com.project.coreJava.controller.service.ProductService;
import com.project.coreJava.dao.ProductDao;
import com.project.coreJava.dao.impl.ProductDaoimpl;

public class ProductServiceImpl implements ProductService {
	
	ProductDao dao = new ProductDaoimpl();

	@Override
	public boolean addProduct(ProductDTO product) {
		System.out.println(product);
		return dao.addProduct(product);
	}

	

	@Override
	public boolean updateProduct(ProductDTO product) {
		// TODO Auto-generated method stub
		return dao.updateProduct(product);
	}

	@Override
	public List<ProductDTO> showAllProduct() {
		// TODO Auto-generated method stub
		return dao.showAllProduct();
	}

	@Override
	public boolean deleteProduct(String productName) {
		// TODO Auto-generated method stub
		return dao.deleteProduct(productName);
	}
	
	

}
