package com.project.coreJava.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.project.connection.DbConnection;
import com.project.coreJava.DTO.UserDTO;
import com.project.coreJava.dao.UserDao;

public class UserDaoImpl implements UserDao {
	
	private Connection con;
	private PreparedStatement ps;
	
	

	@Override
	public boolean saveUser(UserDTO user) {
		try {
			con = DbConnection.establishConnection();
			ps=con.prepareStatement("insert into TBL_USER(name,email,password) values(?,?,?)");
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			
			int row=ps.executeUpdate();
			if(row>0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if (con!=null) {
				try {
					ps.close();
					con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("from user");
		return false;
	}
	
	
	
	

	@Override
	public boolean updateUser(UserDTO user) {
		try {
			con = DbConnection.establishConnection();
			ps=con.prepareStatement("update TBL_USER SET name=?,  password=? where email=?");
			ps.setString(1, user.getName());
			ps.setString(3, user.getEmail());
			ps.setString(2, user.getPassword());
			
			
			int row=ps.executeUpdate();
			if(row>0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if (con!=null) {
				try {
					ps.close();
					con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}
	
	
	
	

	@Override
	public boolean deleteUser(String email) {
		try {
			con = DbConnection.establishConnection();
			ps=con.prepareStatement("delete from tbl_user where email = ?");
			ps.setString(1, email);
			
			int row=ps.executeUpdate();
			if(row>0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
				try {
					ps.close();
					con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
		
	}
		return false;
}
	
	
	
	

	@Override
	public List<UserDTO> searchUser1(String email) {
		List<UserDTO> users = new ArrayList<>();
		try {
			con = DbConnection.establishConnection();
			ps=con.prepareStatement("select * from tbl_user where email=?");
			ps.setString(1, email);
			
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				 email = rs.getString("email");
				String password = rs.getString("password");
				UserDTO user = new UserDTO(id, name, email, password);
				users.add(user);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if (con!=null) {
				try {
					ps.close();
					con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		return users;
	}
	
	
	
	

	@Override
	public List<UserDTO> showAllUser() {
		List<UserDTO> users = new ArrayList<UserDTO>();
		try {
			con = DbConnection.establishConnection();
			ps=con.prepareStatement("select * from tbl_user");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");

				String password = rs.getString("password");
				UserDTO user = new UserDTO(id, name, email, password);
				users.add(user);

			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}
}





	

