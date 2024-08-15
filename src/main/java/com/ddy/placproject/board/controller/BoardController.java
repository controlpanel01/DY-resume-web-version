package com.ddy.placproject.board.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ddy.placproject.board.service.boardServiceImpl;
import com.ddy.placproject.dto.FreeboardArticleDto;
import com.ddy.placproject.dto.UserDto;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	private boardServiceImpl boardService; 
	
	@RequestMapping("mainPage")
	public String mainPage(Model model) {
		// 이제 코드가 많이 들어가는 구간
		
		// 샵(#)을 보낸곳은 3곳인데 값을 보내는 쪽은 2개이다...
		// 글쓰기 쿼리에서 데이터가 입력되는 곳은 제목(title)과 내용(content)이다. 
		
		// 작성한 사람의 유저pk와 같은 정보는 세션에서 끌고 오는 것이다.
		
		List<Map<String, Object>> list = boardService.getArticleList();
		
		model.addAttribute("list", list);//el문 달러표시
		
		
		return "board/mainPage";
	}
	
	@RequestMapping("writeArticlePage")
	public String writeArticlePage() {
		
		return "board/writeArticlePage";
	}
	
	@RequestMapping("writeArticlePrcs")
	public String writeArticlePrcs(HttpSession session, FreeboardArticleDto params) {
		
		UserDto sessionUserInfo = (UserDto)session.getAttribute("sessionUserInfo");
		//(UserDto) 타입캐스팅..
		int userPk = sessionUserInfo.getUser_pk();
		params.setUser_pk(userPk);

		// 위 코드는 데이터베이스에 입력하기 위한 정보구성 완료
		
		boardService.writeArticle(params);
	
		
		return "redirect:./mainPage";
	}
	
	@RequestMapping("readArticlePage")
	public String readArticlePage(Model model, int article_pk) {
		
		boardService.increaseReadCnt(article_pk);
		
		
		// 여기에서 파라미터명을 변수명과 같게 해줘야 한다. 그 이유는 그래야 스프링 프레임워크가 세팅해준다. 
		System.out.println("----------------------------------------");
		System.out.println("글 pk");
		System.out.println(article_pk);
		
		Map<String, Object> map = boardService.getArticle(article_pk);
		
		
		
		model.addAttribute("qwer", map);
		
		return "board/readArticlePage";
	}
	
	@RequestMapping("deleteArticlePrcs")
	public String deleteArticlePrcs(int article_pk) {
		
		boardService.deleteArticle(article_pk);
		
		return "redirect:./mainPage";
	}
	
	@RequestMapping("modifyArticlePage")
	public String modifyArticlePage(Model model, int article_pk) {
		
		Map<String, Object> map = boardService.getArticle(article_pk);
		model.addAttribute("qwer", map);
		
		return "board/modifyArticlePage";
	}
	
	@RequestMapping("modifyArticlePrcs")
	public String modifyArticlePrcs(FreeboardArticleDto params) {
	
		boardService.modifyArticle(params);
		
		return "redirect:./readArticlePage?article_pk=" + params.getArticle_pk();
	}

}

