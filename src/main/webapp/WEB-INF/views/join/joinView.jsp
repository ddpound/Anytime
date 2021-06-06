<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		setDateBox();
	});
	function setDateBox() {
		var dt = new Date();
		var year = "";
		var com_year = dt.getFullYear();

		for (var y = (com_year - 50); y <= (com_year + 1); y++) {
			$("#year").append(
					"<option value='" + y + "'>" + y + " 년" + "</option>");
		}
	}
	function handleOnChange(e) {
		// 선택된 데이터의 텍스트값 가져오기
		const text = e.options[e.selectedIndex].text;

		console.log(e.options);

		// 선택한 텍스트 출력
		document.getElementById('resultYear').innerText = text;
	}
</script>
<meta charset="UTF-8">
<title>AnyTime JoinView</title>
</head>
<body>
	<div style="margin-left: 30%" class="joinForm">
		<h1>애니타임 회원가입</h1>
		<br>
		<h4>언제, 어디서나 학생들과 함께.......</h4>
		<br> <input name="resultYear" id="resultYear" type="text" readonly="readonly"
			value="입학년도"><br> <span class="select"> <select
			id="year" title="년도" onchange="handleOnChange(this)"></select><br>
		</span> <input type="text" readonly="readonly" value="학교 검색하기"><br>
		<input type="text"><br>
		<!--  임시방편 나중에 카카오 로그인 버튼으로 대체할생각 -->
		<button onclick="">카카오로 회원가입하기</button>
	</div>




</body>
</html>