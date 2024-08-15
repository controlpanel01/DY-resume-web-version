package com.ddy.placproject.user.service;

import com.ddy.placproject.user.mapper.UserSqlMapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddy.placproject.dto.HobbyCategoryDto;
import com.ddy.placproject.dto.UserDto;
import com.ddy.placproject.dto.UserHobbyDto;
import com.ddy.placproject.user.mapper.UserSqlMapper;

@Service
public class UserServiceImpl {

	@Autowired
	private UserSqlMapper userSqlMapper;
	
	public void register(UserDto userDto) {
		// 2차: 암호화, 이메일 인증
		
		// 데이터 베이스에 입력
		
		// 데이터 베이스 연동로직은 Service 에서 하지 않고 Mapper에서 한다!!
	
		//int userPk = userSqlMapper.cre..hobbyPkList.
		
		userSqlMapper.insert(userDto);
	
		//취미 관련
		
		// 예외처리
//		if(hobbyPkList != null) {
//			for(int hobbyPk : hobbyPkList) {
//				UserHobbyDto userHobbyDto = new UserHobbyDto();
//				// userHobbyDto.setHobby_pk(userPk);
//				// 회원가입 시
//				// 오라클모드 전환
//				// 시퀀스와 듀얼 쿼리 작동
//				// 오라클모드 종료
//				// 회원가입 완료?
//				
//				
//				userHobbyDto.setUser_pk(hobbyPk);
//				
//				userSqlMapper.insertUserHobby(userHobbyDto);
//			}
//		}
	}
	
	public UserDto getUserInfoUserByIdAndPassword(UserDto userDto) {
		// 로그인할 때 유저의 id 와 password 값
		
		//여기서 파라미터로서의 UserDto가 있고, 리턴으로서의 UserDto가 있다.
		/* 이 두개의 메모리 수치는 다르다...(받는것은 Id 와 Password 뿐이고,
		 보낼땐 받았던 Id & Password의 UserDto(해당Id의 모든 유저정보)를 보내주기 때문이
		 */
		
		// UserDto result = userSqlMapper.selectByUserIdAndPassword(userDto); 
		// return result;
		// 위같이 만들어도 되지만 이를 단축하기 위해 아래처럼 받아서 바로 리턴해주는 코드를 작성했다.
		
		return userSqlMapper.selectByUserIdAndPassword(userDto);
		
	}
	
	//취미 관련
//	public List<HobbyCategoryDto> getHobbyList(){
//		return userSqlMapper.selectHobbyCategoryAll();
//	}
	
	
}
