<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath }/resources/js/JoinView.js"></script>
<script src="${pageContext.request.contextPath }/resources/js/Join.js"></script>
<meta charset="UTF-8">
<title>AnyTime JoinView</title>
</head>
<body>
	<div style="margin-left: 30%" class="joinForm"  >
	<form id="joinfrm" >
	<h1>애니타임 회원가입</h1>
		<br>
		<h4>언제, 어디서나 학생들과 함께.......</h4>
		<br> 
		입학년도 : <input id="enterYear"  name="enterYear"  type="text" readonly="readonly" value="입학년도"><br> 
		<span class="select"> 
			<select id="year" title="년도" onchange="handleOnChange(this)"></select><br>
		</span> <input type="button" readonly="readonly" onclick="showPopup()" value="학교 검색하기"><br>
		
		
		<script type="text/javascript">
		
		</script>
		<script src="${pageContext.request.contextPath }/resources/js/SearchSchool.js"></script>
		
		<input type="text" id="parSchoolName"  name="parSchoolName"  placeholder="학교이름"><br>
		<input type="text"  id="parSchooladd"  name="parSchooladd" placeholder="학교주소"><br>
		 
		이메일 : <input type="text" id="email" name="email" value="${email}"><br>
		이름 : <input type="text" id="nickname" name="nickname" value="${nickname}"><br>
		나이 : <input type="text"  id="age"  name="age"  placeholder="나이를 입력해주세요"><br>
		연령대 : <input type="text"  id="ageGroup"  name="ageGroup"  value="${agerange}" readonly="readonly"><br>
		현재학년 : <input type="text"  id="grade"  name="grade"  placeholder="현재학년"><br>
		<br>
		
		<!--  임시방편 나중에 카카오 로그인 버튼으로 대체할생각 -->
		<input type="button"  style="width: 300px; height: 80px;" src="${pageContext.request.contextPath }/resources/img/KaKaoJoin.png" onclick="SaveUser('${UserJoinAuth}')" ><br>
	</form>
		
	</div>
	
</body>

</html>