package com.project.coreJava.controller;

import java.util.List;

import java.util.Scanner;

import com.project.coreJava.DTO.ProductDTO;
          
import com.project.coreJava.controller.service.ProductService;
import com.project.coreJava.controller.service.impl.ProductServiceImpl;

public class ProductController {
	Scanner sc = new Scanner(System.in);
	int optionProduct =0;
	ProductService productService = new ProductServiceImpl();
	
	{
		do {
			System.out.println("1.Select 1 to Add Product\n2.Select 2 to Delete Product\n3.Select 3 to Update Product\n"
					+ "4.Select 4 to Show all Product\n5.Select 5 to Exit from Product\n");
			optionProduct=sc.nextInt();
			switch(optionProduct) {
			case 1:
				addProduct();
				
				break;
			case 2:
				deleteProduct();
				break;
			case 3:
				updateProduct();
				break;
			case 4:
				showAllProduct();
				break;
			
			case 5:
				System.out.println("Exited from Product section successfully.......\n\n");
				break;
			default :
				System.out.println("enter valid number\n");
			
			}
		}while(optionProduct!=5);
	}

	private void addProduct() {
		System.out.println("Enter Product Name");
		String productName = sc.next();
		System.out.println("Enter Price of Quantity");
		Double productPrice = sc.nextDouble();
		System.out.println("Enter Product Quantity");
		Integer productQuantity = sc.nextInt();
		
		ProductDTO product = new ProductDTO(productName,productPrice,productQuantity);
		 boolean isProductAdded = productService.addProduct(product);
		 if(isProductAdded) {
			 System.out.println("record inserted");
			 
		 }
		 else {
			 System.out.println("try again");
		 }
		 
		 		
		
	}

	private void showAllProduct() {
		List<ProductDTO> products= productService.showAllProduct();
		System.out.println("-----------product Records are------------------\n");
//		for(ProductDTO product : products) {
//			System.out.println(product);
//		}
		
		products.forEach(System.out::println);
		
	}

	private void updateProduct() {
		System.out.println("Enter Product Name for update");
		String productName = sc.next();
		System.out.println("Enter Price of Quantity for update");
		Double productPrice = sc.nextDouble();
		System.out.println("Enter Product Quantity for update");
		Integer productQuantity = sc.nextInt();
		
		ProductDTO product = new ProductDTO(productName, productPrice, productQuantity);
		boolean isProductupdated = productService.updateProduct(product);
		if(isProductupdated) {
			System.out.println("product updated");
		}
		else{
			 System.out.println("try again");
		 }
		
	}

	private void deleteProduct() {
		System.out.println("Enter Product name to delete your product");
		String productName = sc.next();
		//ProductDTO product = new ProductDTO();
		boolean isProductDeleted = productService.deleteProduct(productName);
		if(isProductDeleted) {
			System.out.println("record deleted");
			
		}
		else {
			System.out.println("something went wrong");
		}
		
	}

}
