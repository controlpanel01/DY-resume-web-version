package com.ddy.placproject.user.mapper;

import java.util.List;

import com.ddy.placproject.dto.HobbyCategoryDto;
import com.ddy.placproject.dto.UserDto;
import com.ddy.placproject.dto.UserHobbyDto;

public interface UserSqlMapper {
	//Mybatis 활용 시 리턴타입 : insert, update, delete = void or int
	//Mybatis 활용 시 리턴타입 : select = 꼭 지정해야된다.
	
	public void insert(UserDto userDto);
	
	public UserDto selectByUserIdAndPassword(UserDto userDto);
	
	public UserDto selectByPk(int userPk);

	
	// 취미 카테고리 관련
	/*
	 * 취미 카테고리 할 수 없음...
	 * why
	 * : 오라클DB에서만 사용가능한 쿼리문이여서...
	 * 
	 * dual, seq.nextval
	 */
	//오라클db 모드로 전환
//	public void setOracleMode();
//	
//	public List<HobbyCategoryDto> selectHobbyCategoryAll();
//	
//	public void insertUserHobby(UserHobbyDto userHobbyDto);
	
	
}
