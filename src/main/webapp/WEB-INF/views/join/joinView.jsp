<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function () {
    setDateBox();
  });
function setDateBox() {
    var dt = new Date();
    var year = "";
    var com_year = dt.getFullYear();
    
    for (var y = (com_year - 50); y <= (com_year + 1); y++) {
        $("#year").append("<option value='" + y + "'>" + y + " 년" + "</option>");
      }

    
}
</script>
<meta charset="UTF-8">
<title>AnyTime JoinView</title>
</head>
<body>
<div style="margin-left: 30%" class="joinForm">
<h1>애니타임 회원가입</h1><br>
<h4>언제, 어디서나 학생들과 함께.......</h4><br>
<input type="text" readonly="readonly" value="입학년도"><br>
<span class="select">
<select id="year" title="년도"></select><br>

</span>
<input type="text" readonly="readonly" value="학교 검색하기"><br>
<input type="text"><br>





</div>


</body>
</html>