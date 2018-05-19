package org.lucky.actions;

import org.apache.commons.lang.StringUtils;
import org.lucky.services.LoginService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import model.User;

public class Login extends ActionSupport
{
	private String userId;
	private String password;
	private User user;
	public void  validate()
	{
		if(StringUtils.isEmpty(getUserId()))
			addFieldError("userId" , " user Id cant be empty ");
		if(StringUtils.isEmpty(getPassword()))
			addFieldError("password" , " password cant be open ");
	}
	public String execute()
	{
		LoginService ls = new LoginService();
		user.setUserId(userId);
		user.setPassword(password);
		System.out.println(userId + " " + password);
		
		if(ls.verification(user))
			return SUCCESS;
		else
			return LOGIN;
	}	
	public String getUserId() {
		return userId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
}
