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

 <h1>login Page</h1>

<form action="./loginPrcs" method="post">
	ID : <input name="user_id" type="text"><br>
	PW : <input name="password" type="password"><br>
	<input type="submit" value="log in!">
</form>


<a href="./registerPage">register</a>

</body>
</html>