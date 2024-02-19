package com.project.coreJava.controller.service.impl;

import java.util.List;

import com.project.coreJava.DTO.CartDTO;
import com.project.coreJava.controller.service.CartService;
import com.project.coreJava.dao.CartDao;
import com.project.coreJava.dao.impl.CartDaoImpl;

public class CartServiceImpl implements CartService {
	CartDao cartdao = new CartDaoImpl();

	@Override
	public boolean addToCart(CartDTO cart) {
		// TODO Auto-generated method stub
		return cartdao.addToCart(cart);
	}

	@Override
	public boolean deleteFromCart(Integer c_id) {
		// TODO Auto-generated method stub
		return cartdao.deleteFromCart(c_id);
	}

	@Override
	public List<CartDTO> showAllItems() {
		List<CartDTO> cart = cartdao.showAllItems();
		return cart;
	}

}
