<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript"  src="${pageContext.request.contextPath }/resources/BookShopJs/bookShopView.js"></script>
<link
	href="${pageContext.request.contextPath }/resources/css/BookShopView.css"
	rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="MainBox">
		<div class="BoardList">
			<div id="BoardCard" class="BoardCard">
			<!--  bookId로 삭제나 수정해야하니 숨겨놓음 -->
			<input type="hidden" id="bookId" value="${ BookShop.boardId}">
			제목 : ${ BookShop.booktitle} <br>
			bookisbn : ${ BookShop.bookisbn} <br>
			밑줄 : ${ BookShop.underline}<br>
			필기 : ${ BookShop.handwrite}<br>
			책표지 상태 : ${BookShop.cover }<br>
			이름 표기 유무 : ${BookShop.nameWrite }<br>
			페이지 상태  : ${BookShop.page }<br>
			거래 형태 : ${BookShop.meansOftransaction }<br>
			
			
			학교와 위치 : <label>${ BookShop.school}</label><br>
			가격 :  ${BookShop.price} <br>
			
			
			<c:if test="${BookShop.writer ==  userId}">
			<a href="#">수정하기</a>
			<button onclick="salesCompleted()">판매완료</button>
			</c:if>
			<c:if test="${BookShop.writer !=  userId}">
			<button>판매자에게 쪽지보내기</button>
			</c:if>
			
			</div>
		</div>
	</div>
</body>
</html>