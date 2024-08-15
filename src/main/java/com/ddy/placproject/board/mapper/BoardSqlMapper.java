package com.ddy.placproject.board.mapper;

import java.util.List;

import com.ddy.placproject.dto.FreeboardArticleDto;

public interface BoardSqlMapper {

	public void insert(FreeboardArticleDto freeboardArticleDto);

	
	public List<FreeboardArticleDto> selectAll();
	
	// 글보기
	public FreeboardArticleDto selectByArticlePk(int articlePk);
	
	// 조회수 증가
	public void increaseReadCnt(int articlePk);

	// 글 삭제
	public void deleteArticle(int articlePk);
	
	// 글 수정
	public void modifyArticle(FreeboardArticleDto freeboardArticleDto);
	
	
	
	
	
}
