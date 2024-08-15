package com.ddy.placproject.board.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddy.placproject.board.mapper.BoardSqlMapper;
import com.ddy.placproject.dto.FreeboardArticleDto;
import com.ddy.placproject.dto.UserDto;
import com.ddy.placproject.user.mapper.UserSqlMapper;

@Service
public class boardServiceImpl {

	@Autowired
	private BoardSqlMapper boardSqlMapper;
	
	@Autowired
	private UserSqlMapper userSqlMapper;
	
	public void writeArticle(FreeboardArticleDto freeboardArticleDto) {
		
		boardSqlMapper.insert(freeboardArticleDto);
		
	}
	
	public List<Map<String, Object>> getArticleList() {
		
		// 리스트를 호출할 때, 1. 비어있는 리스트를 생성 2.selectAll 하고 3. 그리고 selectAll한 것을 반복문을 돌린다(매핑한다.)
		// 
		
		
		
		// Map으로 묶은것들을 리스트로~~~
		List<Map<String, Object>> list = new ArrayList<>();
		
		
		List<FreeboardArticleDto> articleDtolist = boardSqlMapper.selectAll();
		
		// 한바퀴 돌때마다 글에 대한 정보와 해당 글을 쓴 사람의 유저정보를 한 횡으로 엮는다.(원래는 서로 다른 테이블)  
		for(FreeboardArticleDto freeboardArticleDto : articleDtolist) { //freeboardArticleDto 글정보
			int userPk = freeboardArticleDto.getUser_pk(); //글을 쓸때마다 작성자의 pk를 select(뽑아낸다)한다.
			UserDto userDto = userSqlMapper.selectByPk(userPk); //userDto 유저정보
			
			Map<String, Object> map = new HashMap<>(); // 글정보와 유저정보를 Map으로 묶는다.
			map.put("freeboardArticleDto", freeboardArticleDto);
			map.put("userDto", userDto);
			
			// 이렇게 묶은 정보를 리스트(List)로 쭉 뽑아낸다.  위쪽으로 
			
			list.add(map);
			
		}
		
		return list;
	}
	
	public Map<String, Object> getArticle(int articlePk) {
		
		Map<String, Object> map = new HashMap<>();
		
		System.out.println("보드 서비스 오류");
		
		FreeboardArticleDto articleDto = boardSqlMapper.selectByArticlePk(articlePk);
		int userPk = articleDto.getUser_pk();
		UserDto userDto = userSqlMapper.selectByPk(userPk);
		
		
		System.out.println("보드 서비스 오류 아님");
		
		map.put("freeboardArticleDto", articleDto);
		map.put("userDto", userDto);
		
		return map;
		
	}
	
	public void increaseReadCnt (int articlePk) {
		boardSqlMapper.increaseReadCnt(articlePk);
	}

	public void deleteArticle(int articlePk) {
		boardSqlMapper.deleteArticle(articlePk);
		
	}
	
	public void modifyArticle(FreeboardArticleDto freeboardArticleDto) {
		
		boardSqlMapper.modifyArticle(freeboardArticleDto);
	}
	
	
}
