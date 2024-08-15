<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
 <h1>REGISTER</h1>
 <form action="./registerPrcs" method="post">
	 ID: <input name="user_id" type="text"><br>
	 PW: <input name="password" type="password"><br>
	 Nickname: <input name="nickname" type="text"><br>
	 Email: <input name="email" type="text"><br>
	 Gender: 
	 <input name="gender" type="radio" value="M">Male
	 <input name="gender" type="radio" value="F">Female
	 <br>
	 Birthday: <input name="birthday" type="date"><br>
	 Phone: <input name="phone" type="text"><br>
	 
	 <input type="submit" value="COMPLETE">
	 <br>
 </form>
 
</body>
</html>