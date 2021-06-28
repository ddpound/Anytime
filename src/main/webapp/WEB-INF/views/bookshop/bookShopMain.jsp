<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
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
			<c:choose>
			<c:when test="${userId  != null}">
			
			 &emsp; <a class="btn sell" href="bookShop/write">책팔기 </a>
			</c:when>
			<c:otherwise>
			
			</c:otherwise>
			</c:choose>
			
		</div>
		
		
		
		<!--  반복문 c태그 넣기 -->
		<div class="BoardList">
		<c:forEach var="BoardListDTO" items="${PageboardList }">
		    <div id="BoardCard" class="BoardCard">
			
			<img src="${AllBookPhotoList[BoardListDTO.boardId].photo1}" width="200px" height="200px">
			<a href="">${ BoardListDTO.booktitle}</a><br>
			<label>${ BoardListDTO.writer} </label><br>
			<label>${ BoardListDTO.school}</label>
			<!--  중요 반드시 DTO의 변수값을 따지니 대소문자 틀리지않게 하세요 -->
			</div>
		
		</c:forEach>
			
		</div>
	</div>
</body>
</html>