package com.KillSystem.Service;

import com.KillSystem.domain.User;

public interface UserService extends BaseService<User>{

	User login(User user);
	
}