<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath }/score"/>
<!DOCTYPE html>
<html>
<head>
<title>애니타임</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro:wght@200&display=swap" rel="stylesheet">
<script src="https://kit.fontawesome.com/46c1a740db.js" crossorigin="anonymous"></script>
<style type="text/css">
ol{
	display: flex;
}
li{
	display: block;
}
</style>
<script type="text/javascript">
	$(function() {
		$(".navdiv").hide();
	})
</script>
</head>
<body>
<div class="contentBox">
<nav>
	<ol>
		<li><a class="w3-button" href="${contextPath }/1">1학년 1학기</a></li>
		<li><a class="w3-button" href="${contextPath }/2">1학년 2학기</a></li>
		<li><a class="w3-button" href="${contextPath }/3">2학년 1학기</a></li>
		<li><a class="w3-button" href="${contextPath }/4">2학년 2학기</a></li>
		<li><a class="w3-button" href="${contextPath }/5">3학년 1학기</a></li>
		<li><a class="w3-button" href="${contextPath }/6">3학년 2학기</a></li>
		<li><a class="w3-button">그래프</a></li>
	</ol>
</nav>
<div>
<div class="w3-container w3-border">
	<span>
		<strong style="font-size:40px; color: orange;">1학년 1학기</strong><br>
		<em>총점</em>&nbsp;<strong>0</strong>&nbsp;&nbsp;&nbsp;
		<em>평점</em>&nbsp;<strong>0</strong>
	</span>
	<div class="w3-right">
		<input type="button" class="w3-button" value="시간표 불러오기 +">
	</div>
</div>
<table class="table table-bordered">
	<thead>
		<tr>
			<th style="width:80%">과목명</th>
			<th style="width:20%">점수</th>
      </tr>
	</thead>
	<tbody>
		<tr>
			<td><input type="text" class="form-control"></td>
			<td><input type="text" class="form-control" placeholder="0"></td>
		</tr>
		<tr>
			<td><input type="text" class="form-control"></td>
			<td><input type="text" class="form-control" placeholder="0"></td>
		</tr>
		<tr>
			<td><input type="text" class="form-control"></td>
			<td><input type="text" class="form-control" placeholder="0"></td>
		</tr>
		<tr>
			<td><input type="text" class="form-control"></td>
			<td><input type="text" class="form-control" placeholder="0"></td>
		</tr>
		<tr>
			<td><input type="text" class="form-control"></td>
			<td><input type="text" class="form-control" placeholder="0"></td>
		</tr>
		<tr>
			<td><input type="text" class="form-control"></td>
			<td><input type="text" class="form-control" placeholder="0"></td>
		</tr>
		<tr>
			<td><input type="text" class="form-control"></td>
			<td><input type="text" class="form-control" placeholder="0"></td>
		</tr>
		<tr>
			<td><input type="text" class="form-control"></td>
			<td><input type="text" class="form-control" placeholder="0"></td>
		</tr>
	</tbody>
</table>
</div>
</div>
</body>
</html>