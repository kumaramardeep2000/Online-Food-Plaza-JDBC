package com.project.coreJava.dao;

import java.util.List;

import com.project.coreJava.DTO.CartDTO;

public interface CartDao {
	boolean addToCart (CartDTO cart);
	boolean deleteFromCart(Integer c_id);
	List<CartDTO> showAllItems();

}
