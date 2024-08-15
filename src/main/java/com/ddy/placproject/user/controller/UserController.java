package com.ddy.placproject.user.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ddy.placproject.dto.UserDto;
import com.ddy.placproject.user.service.UserServiceImpl;

@Controller
@RequestMapping("/user/*")
public class UserController {
//컨트롤러 요청 담당
	//1. 어노테이션 확인
	// 400분 오류는 대부분 파라미터 문제...
	// 백엔드쪽은 항상 구조 흐름은 컨트롤러 서비스 매퍼
	// 컨트롤러 리퀘스트 매핑을 한 메소드를 만들어야 한다. 그리고 파라미터를 받는다.
	// 서비스에서 메소드를 만든다. 만들어서 파라미터를 보낸다. 데이터베이스를 select 한다.
	// SqlMapper 인터페이스 추가하면서 서비스에서는 매퍼에 있는 것을 호출하고 쿼리를 실행...
	
	// MyBatis 활용법...
	
	
	
	
	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping("loginPage")
	public String loginPage() {
		
		return "user/loginPage"; //JSP 포워딩
	}
	
	@RequestMapping("registerPage")
	public String registerPage() {
		
		//취미
		//model.addAttribute("hobbyList", userService.getHobbyList());
		// 위 코드 자바 문법적 단축
		
		return "user/registerPage";
	}
	
	@RequestMapping("registerPrcs")
	public String registerPrcs(UserDto params) {
		
		System.out.println("registerPrcs - 실행됨!");
		System.out.println(params.getUser_pk());
		System.out.println(params.getUser_id());
		
		userService.register(params);
		
		
		return "redirect:./loginPage";
		//리다이렉트는 링크로 ~
	}
	
	@RequestMapping("loginPrcs")
	public String loginPrcs(HttpSession session, UserDto params) {
		
		
		UserDto sessionUser = userService.getUserInfoUserByIdAndPassword(params);
		
		if(sessionUser == null) {
		// 로그인 실패 상황(로그인 실패 포워딩)
			return "user/loginFail";
			
		}else {
		// 로그인 성공(정상 인증 성공 리다이렉트)
			session.setAttribute("sessionUserInfo", sessionUser);
			
			return "redirect:../board/mainPage";
			// ../ = 폴더 위로 가기
		}
		
	}
	
	@RequestMapping("logoutPrcs")
	public String logoutPrcs(HttpSession session) {
		
		session.invalidate();// 세션 정보를 날려주는 기능 -> 로그아웃
		
		return "redirect:../board/mainPage";
	}
}
