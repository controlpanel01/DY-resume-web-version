package com.ddy.placproject.dto;

public class UserHobbyDto {

	private int user_hobby_pk;
	private int user_pk;
	private int hobby_pk;
	
	public UserHobbyDto() {
		super();
	}

	public UserHobbyDto(int user_hobby_pk, int user_pk, int hobby_pk) {
		super();
		this.user_hobby_pk = user_hobby_pk;
		this.user_pk = user_pk;
		this.hobby_pk = hobby_pk;
	}

	public int getUser_hobby_pk() {
		return user_hobby_pk;
	}

	public void setUser_hobby_pk(int user_hobby_pk) {
		this.user_hobby_pk = user_hobby_pk;
	}

	public int getUser_pk() {
		return user_pk;
	}

	public void setUser_pk(int user_pk) {
		this.user_pk = user_pk;
	}

	public int getHobby_pk() {
		return hobby_pk;
	}

	public void setHobby_pk(int hobby_pk) {
		this.hobby_pk = hobby_pk;
	}
	
	
	
	
}
