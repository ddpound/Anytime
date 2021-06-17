<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<link
	href="${pageContext.request.contextPath }/resources/css/bookshop.css"
	rel="stylesheet" type="text/css">
	
<meta charset="UTF-8">

<title>BookShop</title>
</head>
<body>
	<div class="MainBox">
		<div class="searchBook">
			<input type="text" placeholder="찾을 책을 입력해주세요"> 
			&emsp; <input type="button" value="검색">
			 &emsp; <a class="btn sell" href="bookShop/write">책팔기 </a>
		</div>
		<!--  반복문 c태그 넣기 -->
		<div class="BoardList">
			<div id="BoardCard" class="BoardCard">
			
			</div>
		</div>
	</div>
</body>
</html>