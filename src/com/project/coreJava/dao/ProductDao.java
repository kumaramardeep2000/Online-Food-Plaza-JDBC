package com.project.coreJava.dao;

import java.util.List;

import com.project.coreJava.DTO.ProductDTO;

public interface ProductDao {

boolean addProduct(ProductDTO product);
boolean deleteProduct(String productName);
boolean updateProduct(ProductDTO product);
List<ProductDTO> showAllProduct();

}
