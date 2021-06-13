<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!--  여기서 중요한점 라이브러리 불러올때 똑같은 코드의 라이브러리라면 불러오는게 다르더라도, 무조건 맨위를 가져온다 -->
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=cf9da9331ed35abab803df6b7845c939&libraries=services,clusterer,drawing"></script>
<meta charset="UTF-8">
<title>Search the School</title>
</head>
<body>
<!-- ajax 통신으로 json값으로 받아오는게 훨씬 나을드 api사용하려면 js가 필요할테니 -->
<input type="text" placeholder="학교이름을 입력해주세요" ><br><br>
<input type="button" onclick="" value="검색하기"><br>
<div id="map" style="width:500px;height:400px;"></div>
<script src="${pageContext.request.contextPath }/resources/js/SearchSchool.js"></script>

</body>
</html>