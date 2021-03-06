/**
 *
 */
package com.mazecode.service;

import com.mazecode.model.Users;

import java.util.List;

public interface UserService {
	
	List<Users> all();
	
	void saveLastLoginDate(String username);
	
	Users getUser(String username);
	
	void saveUser(Users user);
}
