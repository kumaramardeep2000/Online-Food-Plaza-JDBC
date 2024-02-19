package com.project.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	private static Connection con;
	public static Connection establishConnection() {
		
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/foodplazaproject", "root", "root");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	
	}

}
