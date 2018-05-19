package org.lucky.services;

import model.User;

public class LoginService 
{
	public boolean verification(User u)
	{
		if(u.getUserId().equalsIgnoreCase("lucky") && u.getPassword().equalsIgnoreCase("12345"))
			return true;
		return false;
	}
}
