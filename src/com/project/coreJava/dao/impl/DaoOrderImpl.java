package com.project.coreJava.dao.impl;

import java.sql.PreparedStatement;

import com.project.connection.DbConnection;
import com.project.coreJava.DTO.OrderDTO;
import com.project.coreJava.dao.DaoOrder;

public class DaoOrderImpl implements DaoOrder {

	@Override
	public boolean placeOrder(OrderDTO order) {
		try {
			PreparedStatement ps = DbConnection.establishConnection().prepareStatement
					("insert into orders(Customer_id,cart_id,ADDRESS,TOTAL_"
							+ "BILL,TRANSACTION_TYPE) values(?,?,?,?,?)");
			
			ps.setInt(1, order.getCustomer_id());
			ps.setInt(2, order.getCart_id());
			ps.setString(3,order.getAddress());
			ps.setDouble(4,order.getTotal_bill());
			ps.setString(5, order.getTransaction_type());
			
			int rows = ps.executeUpdate();
			if(rows>0) {
				return true;
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	

}
