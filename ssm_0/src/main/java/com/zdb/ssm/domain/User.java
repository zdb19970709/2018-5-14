package com.zdb.ssm.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private String uid;
	private String username;
	private String telephone;
	private Date birthday;
	private String sex;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public User(String uid, String username, String telephone, Date birthday, String sex) {
		super();
		this.uid = uid;
		this.username = username;
		this.telephone = telephone;
		this.birthday = birthday;
		this.sex = sex;
	}
	
	
	public User() {}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", telephone=" + telephone + ", birthday=" + birthday
				+ ", sex=" + sex + "]";
	}
	
	
}
