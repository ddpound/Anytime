<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript"  src="${pageContext.request.contextPath }/resources/BookShopJs/WriteBookShop.js"></script>
<link href="${pageContext.request.contextPath }/resources/css/WriteBookShop.css" rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>BookWrite</title>
</head>
<body>
<input id="SearchCode" type="text"  placeholder="책 제목,isbn,작가를 입력해주세요"><button id="SearchCodeBtn" onclick="GowriteBook()">검색</button><br> <!--  책 검색 API 사용 -->
<div id="bookList" >

</div>
<input type="file" name="uploadFile"  id="uploadFile"  multiple>
<div id="preview" ></div>


</body>
<script type="text/javascript"  src="${pageContext.request.contextPath }/resources/BookShopJs/WriteBookShopCallBack.js"></script>
</html>