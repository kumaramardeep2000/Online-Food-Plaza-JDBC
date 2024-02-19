package com.project.coreJava.dao.impl;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.project.connection.DbConnection;
import com.project.coreJava.DTO.CartDTO;
//import com.project.coreJava.DTO.ProductDTO;
import com.project.coreJava.dao.CartDao;

public class CartDaoImpl implements CartDao {

	@Override
	public boolean addToCart(CartDTO cart) {
		try {
			PreparedStatement ps = DbConnection.establishConnection().prepareStatement(
					"insert into cart(customer_id,product_id,quantity,price,total_price)  values(?,?,?,?,?)");
			ps.setInt(1, cart.getCustomer_id());
			ps.setInt(2, cart.getProduct_id());
			ps.setInt(3, cart.getQuantity());
			ps.setInt(4, cart.getPrice());
			ps.setInt(5, cart.getTotal_price());

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
	public boolean deleteFromCart(Integer c_id) {
		try {
			PreparedStatement ps = DbConnection.establishConnection().prepareStatement("delete from cart where c_id=?");
			ps.setInt(1, c_id);
			int rows = ps.executeUpdate();
			if (rows > 0) {
				return true;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return false;
	}

	@Override
	public List<CartDTO> showAllItems() {
		List<CartDTO> carts = new ArrayList<>();

		try {
			PreparedStatement ps = DbConnection.establishConnection().prepareStatement("select * from cart");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int customer_id = rs.getInt("customer_id");
				int product_id = rs.getInt("product_id");
				int c_id = rs.getInt("c_id");
				int quantity = rs.getInt("quantity");
				int price = rs.getInt("price");
				int total_price = rs.getInt("total_price");

				CartDTO cart = new CartDTO(customer_id, product_id, c_id, quantity, price, total_price);

				carts.add(cart);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return carts;
	}

}
