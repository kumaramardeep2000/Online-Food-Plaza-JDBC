package com.project.coreJava.dao.impl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.project.connection.DbConnection;
import com.project.coreJava.DTO.ProductDTO;
//import com.project.coreJava.DTO.UserDTO;
import com.project.coreJava.dao.ProductDao;

public class ProductDaoimpl implements ProductDao {

	@Override
	public boolean addProduct(ProductDTO product) {
		try {
			Connection connection = DbConnection.establishConnection();
			PreparedStatement ps = connection
					.prepareStatement("insert into product(p_name,p_price,p_quantity) values(?,?,?)");
			ps.setString(1, product.getProductName());
			ps.setDouble(2, product.getProductPrice());
			ps.setInt(3, product.getProductQuantity());
			int rows = ps.executeUpdate();
			if (rows > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteProduct(String productName) {
		try {
			Connection connection = DbConnection.establishConnection();
			PreparedStatement ps = connection.prepareStatement("delete  from product where p_name = ?");
			ps.setString(1, productName);
			int rows = ps.executeUpdate();
			if (rows > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return false;
	}

	@Override
	public boolean updateProduct(ProductDTO product) {
		try {
			PreparedStatement ps = DbConnection.establishConnection().prepareStatement("update product SET p_name=?,p_price=?,p_quantity=?");
			ps.setString(1, product.getProductName());
			ps.setDouble(2, product.getProductPrice());
			ps.setInt(3, product.getProductQuantity());
			int rows = ps.executeUpdate();
			if(rows >0) {
				return true;
			}
			
		}catch ( Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<ProductDTO> showAllProduct() {
		List<ProductDTO> products = new ArrayList<ProductDTO>();
		try {
			PreparedStatement ps = DbConnection.establishConnection().prepareStatement("select * from product");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int p_id = rs.getInt("p_id");
				String p_name = rs.getString("p_name");
				Double p_price = rs.getDouble("p_price");
				int p_quantity = rs.getInt("p_quantity");
				
				ProductDTO product = new ProductDTO(p_id, p_name, p_price, p_quantity);
				products.add(product);
				
				

			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

}
