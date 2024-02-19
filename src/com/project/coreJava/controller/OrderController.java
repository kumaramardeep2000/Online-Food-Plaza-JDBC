package com.project.coreJava.controller;

import java.util.Scanner;

import com.project.coreJava.DTO.OrderDTO;
import com.project.coreJava.controller.service.OrderService;
import com.project.coreJava.controller.service.impl.OrdeServiceImpl;

public class OrderController {

	int optionorder = 0;
	Scanner sc = new Scanner(System.in);
	OrderService order = new OrdeServiceImpl();

	{
		do {
			
			
			System.out.println("1.Select 1 to Place An Order\n2.Select 2 to Exit from Order\n");
			optionorder=sc.nextInt();
			switch (optionorder) {
			case 1:
				placeOrder();
				break;
			case 2:
				System.out.println("Exited from order section successfully.......\n\n");
				break;
				
				
				
			}
		} while (optionorder != 2);

	}

	private void placeOrder() {
		System.out.println("Enter Customer id");
		int customer_id = sc.nextInt();
		
		System.out.println("Enter cart id");
		int cart_id = sc.nextInt();
		
		System.out.println("Enter your Address");
		String address = sc.next();
		
		System.out.println("Enter total bill");
		Double total_bill=sc.nextDouble();
		
		System.out.println("how do you want pay (cash/upi/internet banking");
		String transaction_type = sc.next();
		
		OrderDTO orders = new OrderDTO(customer_id, cart_id, address, total_bill, transaction_type);
		boolean isOrderPlaced=order.placeOrder(orders);
		if(isOrderPlaced) {
			System.out.println("Order Placed Successfully");
		}
		else {
			System.out.println("something went wrong");
		}
		
		
		
	}

}
