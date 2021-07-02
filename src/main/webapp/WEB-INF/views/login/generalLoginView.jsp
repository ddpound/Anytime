<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript"  src="${pageContext.request.contextPath }/resources/js/login.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="GeneralLogin" method="get">
이메일 : <input type="email" id="email" name="email" placeholder="email"><br>
비밀번호 : <input type="password" id="pwd"  name="pwd" placeholder="password"><br>
<input type="submit" value="로그인">
</form>

</body>
</html>