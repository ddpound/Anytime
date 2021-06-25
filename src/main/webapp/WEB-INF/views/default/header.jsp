<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style type="text/css">
* {
	margin: 0;
}

#logo {
    float: left;
    margin-left: 24px;
    height: 100%;
}

.wrap {
	width: 960px;
	margin: auto;
}

.header {
	width: 960px;
	background-color: white;
}

.navdiv {
	width: 100%;
	background-color: #FAFAFA;
	font-size : 10px;
}
.name {
	margin-top: 20px;
    margin-left: 3px;
    line-height: 15px;
    font-size: 12px;
    color: #c62917;
    font-weight: bold;
    justify-content: start;
}

nav {
	background-color: white;
	width: 960px;
}

nav ul {
	list-style: none;
	display: flex;
	justify-content: center;
}

nav ul li {
	margin: 0 3px;
	padding: 10px 10px;
}

nav ul li a {
	text-decoration: none;
	color: white;
}

nav ul li a:hover {
	font-size: 15pt;
	font:#ffc045;
	padding-bottom: 3px; 
	border-bottom: 1px solid gray;
	transition: all 0.25s;
}

.logo {
	width: 100%;
	height: 100%;
}

</style>
</head>
<body>

	<c:if test="${loginUser != null }">
		
	</c:if>

	<div class="wrap">
		<c:set var="contextPath" value="<%=request.getContextPath()%>" />
		<div class="header">
			<div id="logo">
				<a href="${contextPath }/index">
				<img src="1.JPG">
				</a>
				<p>
				<span class="name">애니타임</span><br>
				<span class="subname">케이고</span>
				</p>
			</div>
			<nav style= "list-style:none; 5px;">
			<ul style="display:flex;">
			<li class="active"><a>게시판</a></li>
			<li class="timetable"><a>시간표</a></li>
			<li class="calculator"><a>성적계산기</a></li>
			<li class="book"><a href="book" >책방</a></li>
			<li class="active"><a>게시판</a></li>
			</ul>
			</nav>

		</div>
	</div>
	<div class="navdiv">
		<div class="wrap">
			<nav>
				<ul style="background-color: #FAFAFA">
			<li><a>게시판1</a></li><li>|</li>
			<li><a>게시판2</a></li><li>|</li>
			<li><a>게시판3</a></li><li>|</li>
			<li><a>게시판4</a></li><li>|</li>
			<li><a>게시판5</a></li><li>|</li>
			<li><a>게시판6</a></li><li>|</li>
			</ul>

		</nav>
	</div>
</div>
</body> </html>