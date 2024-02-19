package com.project.connection;

import java.sql.Connection;

public class test {

	private static Connection connection;

	public static void main(String[] args) {
		connection = DbConnection.establishConnection();
		if(connection!=null) {
			System.out.println("connected...");
		}
		else {
			System.out.println("not connected");
		}

	}

}
