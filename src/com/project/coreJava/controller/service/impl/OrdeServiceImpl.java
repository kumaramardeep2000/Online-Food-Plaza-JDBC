package com.project.coreJava.controller.service.impl;

import com.project.coreJava.DTO.OrderDTO;
import com.project.coreJava.controller.service.OrderService;
import com.project.coreJava.dao.DaoOrder;
import com.project.coreJava.dao.impl.DaoOrderImpl;

public class OrdeServiceImpl implements OrderService {
	
	DaoOrder daoorder = new DaoOrderImpl();
	

	@Override
	public boolean placeOrder(OrderDTO order) {
		// TODO Auto-generated method stub
		return daoorder.placeOrder(order);
	}

}
