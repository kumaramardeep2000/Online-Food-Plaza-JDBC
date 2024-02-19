package com.project.coreJava.controller.service;

import java.util.List;


import com.project.coreJava.DTO.UserDTO;

public interface UserService {
	
	boolean saveUser(UserDTO user);
	boolean updateUser(UserDTO user);
	boolean deleteUser(String email);
	
	List<UserDTO> showAllUser();
	List<UserDTO> searchUser1(String email);
	
	

}
