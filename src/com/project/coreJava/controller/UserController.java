package com.project.coreJava.controller;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import com.project.coreJava.DTO.UserDTO;
import com.project.coreJava.controller.service.UserService;
import com.project.coreJava.controller.service.impl.UserServiceImpl;

public class UserController {

	//public static void main(String[] args) {
		private int optionUser=0;
		Scanner sc = new Scanner(System.in);
		UserService userService = new UserServiceImpl();
		
		{
			do {
				System.out.println("1.Select 1 to AddUser\n2.Select 2 to Delete User\n3.Select 3 to Update User\n"
						+ "4.Select 4 to Show all User\n5.Select 5 to show any User\n6.Select 6 to Exit from User\n");
				optionUser=sc.nextInt();
				switch(optionUser) {
				case 1:
					addUser();
					break;
				case 2:
					deleteUser();
					break;
				case 3:
					updateUser();
					break;
				case 4:
					showAllUserData();
					break;
				case 5:
					searchUser();
				case 6:
					System.out.println("Exited from user section successfully.......\n\n");
					
				default :
					System.out.println("enter valid number\n");
				}
			}while(optionUser!=6);
				

		}
	
	

	private void addUser() {
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			System.out.println("Enter Name");
			String name = br.readLine();
			System.out.println("Enter Email");
			String email = br.readLine();
			System.out.println("Enter password");
			String password = br.readLine();
			UserDTO user= new UserDTO(name, email, password);
			boolean isUserSaved= userService.saveUser(user);
			if(isUserSaved) {
				System.out.println("Data saved successfully......");
			}
			else {
				System.out.println("Something went wrong");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	
	
	
	


	private void showAllUserData() {
		List<UserDTO> users= userService.showAllUser();
		System.out.println("-----------Users Records are------------------");
		for(UserDTO user : users) {
			System.out.println(user);
		}
		
	}







	private void searchUser() {
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			System.out.println("Enter Email fetch your data");
			String email = br.readLine();
			
			List<UserDTO> users = userService.searchUser1(email);
			
			for(UserDTO row : users) {
				System.out.println(row);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}







	private void updateUser() {
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			System.out.println("Enter Name");
			String name = br.readLine();
			System.out.println("Enter Email");
			String email = br.readLine();
			System.out.println("Enter password");
			String password = br.readLine();
			UserDTO user= new UserDTO(name, email, password);
			boolean isUserUpadated = userService.updateUser(user);

			if(isUserUpadated) {
				System.out.println("Data updated successfully......");
			}
			else {
				System.out.println("Something went wrong");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}


	
	
	
	
	

	private void deleteUser() {
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			System.out.println("Enter Email to Delete record");
			String email = br.readLine();
			//UserDTO user= new UserDTO(email);
			boolean isUserDeleted = userService.deleteUser(email);
			if(isUserDeleted) {
				System.out.println("Data deleted successfully......");
			}
			else {
				System.out.println("Something went wrong");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
		
}
