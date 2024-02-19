package com.project.coreJava.controller.service;

import java.util.List;

import com.project.coreJava.DTO.CartDTO;

public interface CartService {
	
	boolean addToCart (CartDTO cart);
	boolean deleteFromCart(Integer c_id);
	List<CartDTO> showAllItems();
	
}
