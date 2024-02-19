package com.project.coreJava.controller.service.impl;

import java.util.List;

import com.project.coreJava.DTO.UserDTO;
import com.project.coreJava.controller.service.UserService;
import com.project.coreJava.dao.UserDao;
import com.project.coreJava.dao.impl.UserDaoImpl;

public class UserServiceImpl implements UserService{
	
	private UserDao userDao = new UserDaoImpl();
	

	@Override
	public boolean saveUser(UserDTO user) {
		System.out.println(user     +"from userService implementation layer");
	
		return userDao.saveUser(user);
	}
	
	

	@Override
	public boolean updateUser(UserDTO user) {
		
		return userDao.updateUser(user);
	}
	
	

	@Override
	public boolean deleteUser(String email) {
		
		return userDao.deleteUser(email);
	}
	
	

	@Override
	public List<UserDTO> searchUser1(String email) {
		
		return userDao.searchUser1(email);
	}
	
	

	@Override
	public List<UserDTO> showAllUser() {
		
		return userDao.showAllUser();
	}

}
