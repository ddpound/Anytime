<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LoginView</title>
</head>
<body>
<div>
<% int a =0; %>
	<a href="https://kauth.kakao.com/oauth/authorize?client_id=a924c282a86092b8472e6c2885aafe4a&redirect_uri=http://localhost:8000/root/auth/kakao/login/callback&response_type=code">카카오로 로그인하기</a>
	<a href="">일반회원으로 로그인하기</a><br>
	  ${userId}<br>
      ${userSchool}<br>
      ${userNickname}<br>
      
	
	</div>
</body>
</html>