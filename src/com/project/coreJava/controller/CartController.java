package com.project.coreJava.controller;

import java.util.List;

import java.util.Scanner;

import com.project.coreJava.DTO.CartDTO;
//import com.project.coreJava.DTO.ProductDTO;
//import com.project.coreJava.DTO.UserDTO;
import com.project.coreJava.controller.service.CartService;
import com.project.coreJava.controller.service.impl.CartServiceImpl;

public class CartController {

	private int optionCart = 0;
	
	Scanner sc = new Scanner(System.in);
	CartService cartService = new CartServiceImpl();
	{
		do

		{
			System.out.println("1.Select 1 to Add Cart\n2.Select 2 to Delete Cart\n3.select 3 to show all items\n4.Select 4 to Exit from cart\n");
			optionCart = sc.nextInt();
			switch (optionCart) {
			case 1:
				addToCart();
				break;
			case 2:
				deleteFromCart();
				break;
			case 3:
				showAllItems();
				break;
			case 4:
				System.out.println("Exited from Cart section successfully.......\n\n");
				break;
			}
		} while (optionCart != 3);
		

	}
	private void addToCart() {
		System.out.println("enter Customer_id");
		int customer_id=sc.nextInt();
		
		System.out.println("Enter Product Id");
		int product_id=sc.nextInt();
		
		System.out.println("Enter quantity ");
		int quantity = sc.nextInt();
		
		System.out.println("Enter price of one product");
		int price = sc.nextInt();
		
		System.out.println("Enter total price");
		int total_price=sc.nextInt();
		
		CartDTO cart = new CartDTO(customer_id,product_id, quantity, price, total_price);
		boolean isAddedToCart = cartService.addToCart(cart);
		if(isAddedToCart) {
			System.out.println("\nAdded to cart successfully\n");
		}
		else {
			System.out.println("\ntry again\n");
		}
		
		
		
	}
	private void deleteFromCart() {
		System.out.println("Enter cart id to delete");
		int c_id = sc.nextInt();
		
		boolean isCartDeleted = cartService.deleteFromCart(c_id);
		if(isCartDeleted) {
			System.out.println("delete from cart successfully");
		}
		else {
			System.out.println("somthing went wrong");
		}
		
	}
	
	
	
	private void showAllItems() {
		List<CartDTO> carts= cartService.showAllItems();
		System.out.println("-----------carts Records are------------------");
		for (CartDTO cart : carts) {
			System.out.println(cart);
		}
//		carts.forEach(System.out::println);
		
	
		
		
	}
}
