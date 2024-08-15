package com.ddy.placproject.dto;

import java.util.Date;

public class FreeboardArticleDto {

	private int article_pk;
	private int user_pk;
	private String title;
	private String content;
	private int read_cnt;
	private Date created_at;
	
	public FreeboardArticleDto() {
		super();
	}

	public FreeboardArticleDto(int article_pk, int user_pk, String title, String content, int read_cnt,
			Date created_at) {
		super();
		this.article_pk = article_pk;
		this.user_pk = user_pk;
		this.title = title;
		this.content = content;
		this.read_cnt = read_cnt;
		this.created_at = created_at;
	}

	public int getArticle_pk() {
		return article_pk;
	}

	public void setArticle_pk(int article_pk) {
		this.article_pk = article_pk;
	}

	public int getUser_pk() {
		return user_pk;
	}

	public void setUser_pk(int user_pk) {
		this.user_pk = user_pk;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getRead_cnt() {
		return read_cnt;
	}

	public void setRead_cnt(int read_cnt) {
		this.read_cnt = read_cnt;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	
	
	
	
	
}
