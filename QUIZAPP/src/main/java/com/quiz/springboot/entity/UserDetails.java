package com.quiz.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userdetails")
public class UserDetails {
	@Id
	private String userid;
	private String username;
	private String useremail;
	private long userphone;
	private String userpassword;
	private int loginToken;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public long getUserphone() {
		return userphone;
	}

	public void setUserphone(long userphone) {
		this.userphone = userphone;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public int getLoginToken() {
		return loginToken;
	}

	public void setLoginToken(int loginToken) {
		this.loginToken = loginToken;
	}

	public UserDetails(String userid, String username, String useremail, long userphone, String userpassword,
			int loginToken) {
		super();
		this.userid = userid;
		this.username = username;
		this.useremail = useremail;
		this.userphone = userphone;
		this.userpassword = userpassword;
		this.loginToken = loginToken;
	}

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserDetails [userid=" + userid + ", username=" + username + ", useremail=" + useremail + ", userphone="
				+ userphone + ", userpassword=" + userpassword + ", loginToken=" + loginToken + "]";
	}

}
