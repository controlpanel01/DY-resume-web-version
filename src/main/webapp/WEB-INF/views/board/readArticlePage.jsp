<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>	
		body {
		  background-color: black;
		  color: #86fa2d;
		}
	</style>
</head>
<body>
	<h1>read</h1>

	TITLE: ${qwer.freeboardArticleDto.title} <br>
	VIEW : ${qwer.freeboardArticleDto.read_cnt}<br>
	WRITER: ${qwer.userDto.nickname} <br>
	CONTENT: <br>
	${qwer.freeboardArticleDto.content} <br>
	
	<br><br>
	<!-- 글 마다 작성자 본인만 할 수 있는 기능을 이렇게 조건을 만들어준다. -->
	<!-- 로그인 되어있어야 하고 &&(and) 로그인된 유저의 pk값이 글정보의 유저 pk값이 동일할 때, c:if 블록 안에 있는 기능들을 누를 수 있게 해준다. -->
	<c:if test="${!empty sessionUserInfo && sessionUserInfo.user_pk == qwer.freeboardArticleDto.user_pk}">
	<a href="./modifyArticlePage?article_pk=${qwer.freeboardArticleDto.article_pk}">modify</a>
	&nbsp
	<a href="./deleteArticlePrcs?article_pk=${qwer.freeboardArticleDto.article_pk}">delete</a>
	</c:if>
	<br>
	<a href="./mainPage">go back</a>
	

</body>
</html>