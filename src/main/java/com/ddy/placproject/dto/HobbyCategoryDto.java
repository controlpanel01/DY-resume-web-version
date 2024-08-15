package com.ddy.placproject.dto;

public class HobbyCategoryDto {

	private int hobby_pk;
	private String name;
	
	public HobbyCategoryDto() {
		super();
	}
	public HobbyCategoryDto(int hobby_pk, String name) {
		super();
		this.hobby_pk = hobby_pk;
		this.name = name;
	}
	public int getHobby_pk() {
		return hobby_pk;
	}
	public void setHobby_pk(int hobby_pk) {
		this.hobby_pk = hobby_pk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
