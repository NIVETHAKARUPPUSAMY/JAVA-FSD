package com.quiz.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.springboot.dao.UserDao;
import com.quiz.springboot.entity.UserDetails;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	public List<UserDetails> retrieveAllUserDetails() {
		return (List<UserDetails>) userDao.findAll();
	}

	public UserDetails retrieveByUserId(String userid) {
		List<UserDetails> allUsers = retrieveAllUserDetails();

		for (UserDetails user : allUsers) {
			if (user.getUserid().equals(userid)) {
				return user;
			}
		}
		return null;
	}

	public UserDetails retrieveByUserEmail(String useremail) {
		List<UserDetails> allUsers = retrieveAllUserDetails();

		for (UserDetails user : allUsers) {
			if (user.getUseremail().equals(useremail)) {
				return user;
			}
		}
		return null;
	}
	
	public UserDetails retrieveByUserPhone(long phone) {
		List<UserDetails> allUsers = retrieveAllUserDetails();

		for (UserDetails user : allUsers) {
			if (user.getUserphone()==phone) {
				return user;
			}
		}
		return null;
	}
	
	public void addUsers(UserDetails user)
	{
		userDao.save(user);
	}
	
	public boolean isPasswordMatching(String original , String repeat)
	{
		return original.equals(repeat);
	}
	
	public boolean isEmailIdExists(String useremail)
	{
		if(retrieveByUserEmail(useremail)!=null)
		{
			return true;
		}
		return false;
	}
	
	public boolean isUserIdExists(String userid)
	{
		if(retrieveByUserId(userid)!=null)
		{
			return true;
		}
		return false;
	}
	
	public boolean isUserPhoneExists(long userphone)
	{
		if(retrieveByUserPhone(userphone)!=null)
		{
			return true;
		}
		return false;
	}
	
	public UserDetails findUserByUserId(String userid)
	{
		List<UserDetails> allUsers = retrieveAllUserDetails();
		
		for(UserDetails user : allUsers)
		{
			if(user.getUserid().equals(userid))
			{
				return user;
			}
		}
		return null;
	}
	
	public boolean isUserNotExists(String userid)
	{
		if(findUserByUserId(userid)==null)
		{
			return true;
		}
		return false;
	}
	
	public boolean isValidUser(String userid , String password)
	{
		if(findUserByUserId(userid).getUserpassword().equals(password))
		{
			return true;
		}
		return false;
	}
	
	public void authenticated(String userid)
	{
		UserDetails currentUser = retrieveByUserId(userid);
		currentUser.setLoginToken(1);
		addUsers(currentUser);
	}
	
	public void disconnected(String userid)
	{
		UserDetails currentUser = retrieveByUserId(userid);
		currentUser.setLoginToken(0);
		addUsers(currentUser);
	}
}
