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

<h1> write text</h1>

<form action="./writeArticlePrcs" method="post">
	writer ${sessionUserInfo.nickname }<br>
	title
	<br>
	<input name="title" type="text">
	<br>
	content
	<br>
	<textarea name="content" rows="10" cols="60"></textarea>
	<br>
	<input type="submit" value="complete" >
</form>


</body>
</html>