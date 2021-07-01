<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
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
			제목 : ${ BookShop.booktitle} <br>
			bookisbn : ${ BookShop.bookisbn} <br>
			밑줄 : ${ BookShop.underline}<br>
			
			
			</div>
		</div>
	</div>
</body>
</html>