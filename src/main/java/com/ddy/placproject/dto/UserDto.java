package com.ddy.placproject.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class UserDto {
	private int user_pk;
	private String user_id;
	private String password;
	private String nickname;
	private String email;
	private String gender;
	@DateTimeFormat(pattern = "yyyy-MM-dd") //input type="date" 일 경우 무조건 이걸 붙여야함..
	private Date birthday;
	private String phone;
	private Date created_at;
	
	
	public UserDto() {
		super();
	}


	public UserDto(int user_pk, String user_id, String password, String nickname, String email, String gender,
			Date birthday, String phone, Date created_at) {
		super();
		this.user_pk = user_pk;
		this.user_id = user_id;
		this.password = password;
		this.nickname = nickname;
		this.email = email;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
		this.created_at = created_at;
	}


	public int getUser_pk() {
		return user_pk;
	}


	public void setUser_pk(int user_pk) {
		this.user_pk = user_pk;
	}


	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Date getCreated_at() {
		return created_at;
	}


	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
	
	
}
