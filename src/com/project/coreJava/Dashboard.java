package com.project.coreJava;

import java.util.Scanner;

import com.project.coreJava.controller.CartController;
import com.project.coreJava.controller.OrderController;
import com.project.coreJava.controller.ProductController;
import com.project.coreJava.controller.UserController;

public class Dashboard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option =0;
		do {
			System.out.println("============WELCOME TO THE DASHBOARD\n===============");
			System.out.println("1.Select 1 for User\n2.Select 2 for Product\n3.Select 3 for Cart\n4.Select 4 for Order\n"
					                                                            + "5.Select 5 for Exit\n");
			option=sc.nextInt();
			switch(option){
			case 1:
				new UserController();
				break;
			
			case 2:
			    new ProductController();
			    break;
			
			case 3:
				new CartController();
				break;
				
			case 4:
				new OrderController();
				break;
			case 5:
				System.out.println("Exited Successfully......");
				System.exit(0);
				break;
		  }
			
		}while(option !=5);
		sc.close();
	}

}
