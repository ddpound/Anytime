<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* { margin: 0; padding: 0; }
body,div,nav,aside,article,h1,h2,h3,h4,ol,ul,li,dl,dt,dd,p,span,form,th,td,input,textarea,select,pre,address 
<!--아래 css는 에브리타임 css 가져온것-->
{ color: #666; font-family: "맑은 고딕", 돋움, tahoma; _font-family: 돋움, tahoma; font-size: 12px; letter-spacing: -0.5px; }
body { background-color: #f8f8f8; }
body.selectDisabled { -ms-user-select: none; -moz-user-select: none; -webkit-user-select: none; user-select: none; }
img { border: 0; }
div,nav,aside,article,figure { display: block; }
dl,ul,ol,menu,li { list-style:none; }
img,input,select,textarea { vertical-align: middle; }
a { color: #666; text-decoration: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); }
em { font-style: normal; font-weight: bold; }
em.underline { font-style: normal; font-weight: normal; text-decoration: underline; }
address { font-style: normal; }
label.forinsert { display: none; }
input[type="button"],input[type="submit"],input[type="search"] {
	-webkit-appearance: none;
}

.bold { font-weight: bold !important; }
.floatLeft { float: left !important; }
.floatRight { float: right !important; }
.clearBoth { clear: both !important; }
.clearBothOnly { clear: both !important; margin: 0 !important; padding: 0 !important; height: 0 !important; }
.left { text-align: left !important; }
.right { text-align: right !important; }
.center { text-align: center !important; }
.pointer { cursor: pointer !important; }
.hide { display: none !important; }
.show { display: block !important; }
.modal { display: none; position: fixed; z-index: 1000; left: 50%; top: 50%; background-color: #fff; }
.modalwrap { position: fixed; z-index: 999; left: 0; top: 0; width: 100%; height: 100%; background-color: #000; opacity: .5; filter: alpha(opacity=50); }
.modalwrap.lighter { opacity: .2; filter: alpha(opacity=20); }

/* * * * * * * * * * * * * * * * * * * * * * * * *  /  mobile only  /  * * * * * * * * * * * * * * * * * * * * * * * * */

@media only screen and (max-width: 640px) {
	.mobilehide {
		display: none;
	}
}

	.mainTable{ margin: auto; }
	.mainTable td{text-align: center;}
	.name { text-align: right;}

    .divall {
    display:flex;
	width: 960px; height: 500px;
	margin:0 auto; border: 1px solid black;
    }
    .div1 {
    order:1;
    display:flex;
	width: 20%; height: 500px;
	margin:0 auto; border: 1px solid black;
    }
    .div2 {
    order:2;
    display:flex;
	width: 60%; height: 500px;
	margin:0 auto; border: 1px solid black;}
	
     .div3 {
    order:3;
    display:flex;
	width: 20%; height: 500px;
	margin:0 auto; border: 1px solid black;
    }
</style>
</head>
<body>
<div class="divall">
	<div class="div1">
      <p><a href="selectJoin">회원가입</a></p>
      <p><a href="loginView">로그인</a></p>
      <p><a href="https://kauth.kakao.com/oauth/logout?client_id=a924c282a86092b8472e6c2885aafe4a&logout_redirect_uri=http://localhost:8080/root/auth/kakao/logout">로그아웃</a></p>
      ${userId}<br>
      ${userSchool}<br>
      ${userNickname}<br>
	</div>
	<div class="div2">
		<table>
		<tr><td>자유게시판</td></tr>
		<tr><td>최신글1</td></tr>
		<tr><td>최신글2</td></tr>
		<tr><td>최신글3</td></tr>
		<tr><td>최신글4</td></tr>
		</table>
		</div>
	<div class="div3">
		<form class="serch">
		<input type="search" name="keyword" class="text" placeholder="검색하세요">
		</form>
		</div>
	</div>
	</body>

</html>