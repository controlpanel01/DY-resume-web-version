<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<h1> rewrite text</h1>
	
	<!--  수정 시 파라미터 보낼 값은 2개 title과 content 이다. 쿼리에서는 article_pk까지 3개이다. 그러기 때문에 article_pk도 파라미터로 보내줘야 한다. -->
	
	<form action="./modifyArticlePrcs" method="post">
		writer ${sessionUserInfo.nickname }<br>
		title
		<br>
		<input name="title" type="text" value="${qwer.freeboardArticleDto.title}">
		<br>
		content
		<br>
		<textarea name="content" rows="10" cols="60">${qwer.freeboardArticleDto.content}</textarea>
		<br>
		
		<!--  hidden은 사용자에게 보이지 않는다. -->
		<input name="article_pk" type="hidden" value="${qwer.freeboardArticleDto.article_pk}">
		
		<input type="submit" value="complete">
	</form>

</body>
</html>