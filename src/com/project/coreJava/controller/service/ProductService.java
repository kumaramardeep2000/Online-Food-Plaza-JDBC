package com.project.coreJava.controller.service;

import java.util.List;


import com.project.coreJava.DTO.ProductDTO;

public interface ProductService {
	boolean addProduct(ProductDTO product);

	boolean deleteProduct(String productName);

	boolean updateProduct(ProductDTO product);

	List<ProductDTO> showAllProduct();
	
	

}
