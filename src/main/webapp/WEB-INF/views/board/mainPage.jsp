<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
	<title>Insert title here</title>
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Abril+Fatface&display=swap" rel="stylesheet">
	
	<style>	
		body {
		  background-color: black;
		  color: #f5f3f0;
		  /* background-size: contain; */
		  /* color: #86fa2d; */
		}
		.nameFont {
			font-family: "Abril Fatface", serif;
			font-style: normal;
		}
		/* .rowmargin{
			margin: 5em 3em;
		} */
		.skills {
			background-color : transparent; /* 배경색 없 */
			border: 0.09em solid white;	/* 테두리 흰색 두께 설정 */
			border-radius: 1.625em; /* 둥근 모서리 */
			display: inline-block; /* 글자 크기에 맞게 박스 크기 설정 */
			padding: 0.313em 0.5em; /* 글자와 테두리 사이 여백 추가 */
			margin: 0.2em;
		}
		/* .gradientMain {
			background-image: linear-gradient(direction|angle, color-stop1, color-stop2)
		} */
		/* 그라디언트 이미지 */

		.my_gradient_4 {
			background-image: linear-gradient(to left, black, white);
			height: 20em;
		} 

		}
		.outer_div {
		    width: 400px;
		    float: left;    
		    border: 1px solid;
		}
	</style>
</head>
<body>
	<div class="container-fluid mx-0">
		<div class="row">
			<div class="col"></div>
		</div>
		<div class="row">
			
			<div class="col" style="text-align:right">
				<c:choose>
				<c:when test="${!empty sessionUserInfo}">
					${sessionUserInfo.nickname } welcome!
					<a href="../user/logoutPrcs">logout</a>
				</c:when>
				<c:otherwise>
					Currently not logged in
					<br>
					<a href="../user/loginPage">login</a>
				</c:otherwise>
			</c:choose>
			</div>
			
		</div>
		<div class="row">
			<div class="col">
				<div class="row" style="line-height: 10em">
					<div class="col" style="text-align:center">
						<div class="row" style="font-size: 2em; line-height: 10em">
							<div class="col">
								Hi I'm
							</div>
						</div>
						<div class="row" style="font-size: 10em; line-height: 0.05em word-break: break-word;">
							<div class="col">
								Web developer
							</div>
						</div>
						<div class="row" style="font-size: 1em; line-height: 15em">
							<div class="col">
								안녕하세요 반갑습니다. 신입 웹개발자 이도율의 포트폴리오에 오신것을 환영합니다.
							</div>
						</div>
					</div>
				</div>
			</div>	
		</div>
		<!-- 이미지 넣을 곳 -->
		<div class="row">
		
			<div>
				<div class="outer_div">
					<div class="my_gradient_4"></div>
				</div>
			</div>
			
		
		</div>
		<div class="row mt-5 pt-5">
			<div class="col">
				<div class="row ps-5 ms-3">
					<!-- <div class="col-md-1">
					</div> -->
					<div class="col" style="text-align:left;">
						INTRO
					</div>
				</div>
				<div class="row ps-5 ms-3">
					<div class="col">
						<div class="row pb-0 pt-3" style="align-items:baseline; line-height: 0.1em;">
							<div class="col">
								이도율
							</div>
						</div>
						<div class="row pb-3 pt-0" style="align-items:baseline; line-height: 3em">
							<div class="col nameFont" style="font-size: 3.5em;">
								Lee
							</div>
						</div>
						<div class="row pb-5" style="line-height: 0.7em">
							<div class="col pb-4 nameFont" style="font-size: 3.5em;">
								Do Yul
							</div>
						</div>
						<div class="row">
							<div class="col">
							내용 바꿀 것<br>
							내용 바1 것<br>
							내용 바꿀 것<br>
							약4년 이상의 비 개발 실무 경험으로 타 부서와의 유연한 소통이 가능한 개발자
							</div>
						</div>
					</div>
					
					<div class="col">
						<div class="row">
							<div class="col">
								EXPERIENCE
							</div>
						</div>
						<div class="row py-4"></div>
						<div class="row">
							<div class="col-md-4">
								2023.08 ~ 2024.03
							</div>
							<div class="col-md-8">
								중앙정보기술인재개발원
								<div class="row">
									<div class="col">데이터융합 자바(JAVA) 응용 SW개발자 취업과정 수료</div>
								</div>
							</div>
						</div>
						<div class="row py-4"></div>
						<div class="row">
							<div class="col-md-4">
								2024.01 ~ 2024.02
							</div>
							<div class="col-md-8">
								팀 프로젝트 - SKREAM
								<div class="row">
									<div class="col">
										종합 축구 웹사이트(모바일 웹)
										<a href="https://skream.null-pointer-exception.com/user/dy/skreamCommMainPage" target="_blank">SKREAM 메인페이지</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<br>
				<!-- 기술스택 -->
				<div class="row pt-5">
					<div class="col">
						<div class="row">
							<div class="col" style="font-weight: 700; font-size: 1.5em">
								Tech Stack
							</div>
						</div>
						<div class="row">
							<div class="col">
								<div class="skills">Java</div>
								<div class="skills">Spring Boot</div>
								<div class="skills">Bootstrap</div>
								<div class="skills">Mybatis</div>
								<div class="skills">Maven</div>
								<div class="skills">Gradle</div>
								<div class="skills">Spring Web</div>
								<div class="skills">MariaDB</div>
								<div class="skills">MySQL</div>
								<div class="skills">Oracle</div>
								<div class="skills">Apache</div>
								<div class="skills">GitHub</div>
								<div class="skills">Eclipse</div>
								<div class="skills">Visual Studio Code</div>
						
							</div>
						</div>	
					</div>
				</div>
				
				<div class="row">
					<div class="col"></div>
					<div class="col">
						✉ oing0206@gmail.com️
					</div>
					<div class="col">
						🗓️ 1992년 2월 6일
					</div>
					<div class="col"></div>
				</div>
				<div class="row">
					<div class="col">
						☎️ 010-7242-9326
					</div>
				</div>
			</div>
		</div>
		<div class="row">
		<h2>table</h2>
				<table border="1">
					<tr>
						<td>no</td>
						<td>title</td>
						<td>writer</td>
						<td>read cnt</td>
						<td>date</td>			
					</tr>	
					<c:forEach items="${list}" var="map"> <!-- jstl -->
						<tr>
							<td>${map.freeboardArticleDto.article_pk}</td>
							<td><a href="./readArticlePage?article_pk=${map.freeboardArticleDto.article_pk}">${map.freeboardArticleDto.title}</a></td>
							<td>${map.userDto.nickname}</td>
							<td>${map.freeboardArticleDto.read_cnt}</td>
							<td>${map.freeboardArticleDto.created_at}</td>			
						</tr>
					
					</c:forEach>	
				</table>
				
				
				<br>
				<br>
				<c:if test="${!empty sessionUserInfo}">
					<a href="./writeArticlePage">write</a>
				</c:if>
		</div>
	</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>	
</body>
</html>






						<!-- <div class="row">
							<div class="col">
								2022.03 ~ 2023.03
							</div>
							<div class="col">
								(주)제이앤브이벤쳐
								<div class="row">
									<div class="col">전시기획 및 대관업무</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col">
								2019.05 ~ 2022.03
							</div>
							<div class="col">
								(주)언블락드블락
								<div class="row">
									<div class="col">전시기획 및 대관업무</div>
								</div>
							</div>
						</div> -->
						