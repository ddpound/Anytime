<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* { margin: 0; padding: 0; }
body,div,nav,aside,article,h1,h2,h3,h4,ol,ul,li,dl,dt,dd,p,span,form,th,td,input,textarea,select,pre,address 
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

@media only screen and (max-width: 960px) {
	.mobilehide {
		display: none;
	}
}

	.mainTable{ margin: auto; }
	.mainTable td{text-align: center;}
	.name { text-align: right;}

    .divall {
    display:flex;
	width: 960px; height: 1300px;
	margin:0 auto; border: 1px solid black;
    }
    .div1 {
    order:1;
    display:flex;
	width: 150px; height: 1300px;
	margin:0 auto;
    }
    
    .leftside {
    display: block;
	float: left; margin: 10px 10px 10px 10px; 
	width: 150px; border: 1px solid #e3e3e3; 
	overflow: hidden; background-color: #fff;
	padding: 5px;
}

    .rightside {
    display: block;
	float: left; margin: 10px 10px 10px 10px; 
	width: 240px; border: 1px solid #e3e3e3; 
	overflow: hidden; background-color: #fff;
	padding: 5px;
}
    
    .div2 {
    order:2;
    display: block;
	width: 570px; height: 1300px;
	margin:0 auto; }
	
     .div3 {
    order:3;
    display:flex;
	width: 240px; height: 1300px;
	margin:0 auto; ;
    }
    
    .board{
    display: block;
    padding: 5px;
    border-top: 1px solid #e3e3e3;
    }
      .card {
     display: flex;
	float: left; margin: 10px 10px 10px 10px; 
	width: 45%; border: 1px solid #e3e3e3; 
	overflow: hidden; background-color: #fff;
}

	.pconly{
    display: flex; 
    flex-direction: column;
    margin-bottom: 10px;
	float: left; 
	width: 100%; border: 1px solid #e3e3e3; 
	overflow: hidden; background-color: #fff;
}

    .bookstore {
    float: left;  margin: 10px 10px 10px 10px; 
	width: 530px; border: 1px solid #e3e3e3; 
    margin-bottom: 5px;
    white-space: nowrap;
    overflow: hidden;
    overflow-x: auto;
    font-size: 0;
    }
    
    a.item{
    display: inline-block;
    margin-right: 5px;
    width: 125px;
    box-sizing: border-box;
    border: 1px solid #e3e3e3;
    background-color: #fff;}
    
    .image{
    width: 125px;
    height: 192px;
    background-size: cover;
    background-position: center center;
    }
    img.picture{
	display: block;
    margin: 15px auto;
    width: 60px;
    height: 60px;
    border-radius: 6px;
    }
    img.banner{
	display: block;
    margin: 15px auto;
    width: 550px;
    height: 100px;
    border-radius: 6px;
    }
    .h4{
    margin: 10px 10px 5px 10px;
    height: 20px;
    line-height: 20px;
    overflow: hidden;
    white-space: normal;
    color: #444444;
    font-size: 12px;
    font-weight: normal;
    }
    span.price{
    display: block;
    margin: 0 10px 10px 10px;
    color: #c62917;
    font-size: 12px;
    letter-spacing: 0;}

	a.myarticle {
    background-image: url(/images/new/container.community.card.myarticle.png);
}

    form.logged {
    padding: 15px;}
}

	.text {
    width: 100%;
    height: 40px;
    line-height: 20px;
    padding: 10px;
    box-sizing: border-box;
    border: 2px solid #d6d6d6;
    color: #292929;
    font-size: 14px;
    background: transparent url(https://everytime.kr/images/new/aside.search.background.png) no-repeat right center;
    background-size: 40px 40px;
}
    img.picture_2{
	display: block;
    margin: auto;
    width: 110px;
    height: 90px;
    border-radius: 6px;
    }
</style>
</head>
<body>
	<div class="divall">
	<div class="div1">
	<div class="leftside">
	<div class="pconly">
        <form class="logged">
        <img src="https://cf-fpi.everytime.kr/0.png" class="picture">
        <p class="nickname">${userNickname}</p>
        <p class="school">${userId}</p>
        <p class="school">${userschoolname}고</p>
        <ul class="buttons">
        <li><a href="/my">내 정보</a></li>
        <li>
	<c:choose>
      	<c:when test="${loginuserAuth == 'kakaoUser'}">
       	<p><a href="https://kauth.kakao.com/oauth/logout?client_id=a924c282a86092b8472e6c2885aafe4a&logout_redirect_uri=http://localhost:8000/root/auth/kakao/logout">로그아웃</a></p>
      	</c:when>
      	<c:when test="${loginuserAuth == 'generalUser'}">
      	<p><a href="${contextPath}/generalUser/logout">로그아웃</a></p>
      	</c:when>
      	<c:when test="${loginuserAuth == 'admin'}">
      	<p><a href="MemberManagement">회원관리</a></p>
      	<p><a href="${contextPath}/generalUser/logout">어드민로그아웃</a></p>
      	</c:when>
      	<c:otherwise>
      	<p><a href="/root/selectJoin">회원가입</a></p>
      	<p><a href="/root">로그인</a></p>
      	</c:otherwise>
      	</c:choose></li>
        </ul>
        <hr>
        </form>
	</div>
      <hr>
		<div class="pconly">
        <div class="menus">
        <div class="board" align="center"><hr>
          <a class="myarticle">내가 쓴 글</a><hr>
          <a class="mycommentarticle">댓글 단 글</a><hr>
          <hr>
        </div>
        </div>
        </div>
      <div class="pconly">
      <a href="https://blog.naver.com/moeblog/222400109596">
      <img src="https://www.moe.go.kr/upload/onedu/2021/06/BOARD_202106200631497280.jpg"
      class="picture_2" width=100px> </a>
      </div>
      <div class="pconly">
      <a href="http://www.megastudy.net/teacher_v2/t_promotion/202107_pr/0701_woojinmath/main.asp">
      <img src="http://img.megastudy.net/Main/2021/f_210701_hwj1.png"
      class="picture_2"></a>

      </div>
      <div class="pconly">
      <a href="http://www.megastudy.net/lecmain/mains/2021/0512_go3/main.asp?SubMainType=S&mOne=season&mTwo=113">
      <img src="http://img.megastudy.net/main/bnr_2021/bnr_up_210513_go3.jpg"
      class="picture_2"></a>

      </div>
      </div>
      </div>
	<div class="div2">
	      <a href="http://www.megastudy.net/teacher_v2/t_promotion/202105_pr/0517_sunpark1207/main.asp?tec_cd=sunpark1207">
		<img src="http://img.megastudy.net/main/bnr_2021/bnr_event_210628_ps.jpg" class="banner">
		</a><hr>
			<div class="card">
			<div class="board">
			<h3>
			<a>자유게시판 최신글</a><hr>
			</h3>
			<a><p>최신글1</p><hr></a>
			<a><p>최신글2</p><hr></a>
			<a><p>최신글3</p><hr></a>
			<a><p>최신글4</p><hr></a>
			</div>
			</div>
			
			<div class="card">
			<div class="board">
			<h3>
			<a>비밀게시판 최신글</a><hr>
			</h3>
			<a><p>최신글1</p><hr></a>
			<a><p>최신글2</p><hr></a>
			<a><p>최신글3</p><hr></a>
			<a><p>최신글4</p><hr></a>
			</div>
			</div>
			
			<div class="card">
			<div class="board">
			<h3>
			<a>동아리게시판 최신글</a><hr>
			</h3>
			<a><p>최신글1</p><hr></a>
			<a><p>최신글2</p><hr></a>
			<a><p>최신글3</p><hr></a>
			<a><p>최신글4</p><hr></a>
			</div>
			</div>
			
			<div class="card">
			<div class="board">
			<h3>
			<a>정보게시판 최신글</a><hr>
			</h3>
			<a><p>최신글1</p><hr></a>
			<a><p>최신글2</p><hr></a>
			<a><p>최신글3</p><hr></a>
			<a><p>최신글4</p><hr></a>
			</div>
			</div>
			
			<div class="card">
			<div class="board">
			<h3>
			<a>진학*진로 최신글</a><hr>
			</h3>
			<a><p>최신글1</p><hr></a>
			<a><p>최신글2</p><hr></a>
			<a><p>최신글3</p><hr></a>
			<a><p>최신글4</p><hr></a>
			</div>
			</div>
			
			<hr>
		<div class="bookstore">
		<a class="item" href="">
		 <div class="image" 
		 style="background-image: url(&quot;https://cf-cii.everytime.kr/74cb395ea5407aba5c4a65ab0c71e616fe1eea3a19a8e97f6d1711e236364f8b/1623080331831_0_thumb.jpg&quot;);">
		 </div>
		<h6>일반화학(8판)</h6>
		<span class="price">44,000원</span>
		</a>
		<a class="item" href="">
		 <div class="image" style="background-image: url(&quot;https://cf-cii.everytime.kr/265ce252bf2689b8ef4284ea2bc94cd5f4c130561742ac6becbda78926c456d5/1623080207350_0_thumb.jpg&quot;);"></div>
		<h6>위험물기능사</h6>
		<span class="price">25,000원</span>
		</a>
		<a class="item" href="">
		 <div class="image" style="background-image: url(&quot;https://cf-cii.everytime.kr/ad2974f0e3fd1eeacfb1ed176db35feedd03f96bf5d54caa08889be27b8eef7b/1623046473727_0_thumb.jpg&quot;);"></div>
		<h6>대학 글쓰기(신입생을 위한)</h6>
		<span class="price">12,000원</span>
		</a>
		<a class="item" href="">
		 <div class="image" style="background-image: url(&quot;https://cf-cii.everytime.kr/371c9c15b036ce527c132eac314e2efc7363b30e055088960d2a46de10042e47/1623046080121_0_thumb.jpg&quot;);"></div>
		<h6>창의성 교육</h6>
		<span class="price">18,000원</span>
		</a>
		</div>
	</div>
	<div class="div3">
	<div class="rightside">
		<div class="pconly">
		<div class="card_1">
		<div class="board">
		<h3><a>자유게시판 실시간 인기 글</a></h3>
		<hr>
		<a class="article">
		<p class="title">제목</p>
		<hr></a>
		<a class="article">
		<p class="title">제목</p>
		<hr></a>
		<a class="article">
		<p class="title">제목</p>
		<hr></a>
		<a class="article">
		<p class="title">제목</p>
		<hr></a>
		</div>
		</div>
		</div>
		<hr>
		<div class="pconly">
		<div class="card_1">
		<div class="board">
		<h3><a>${userschoolname}고 실시간 인기 글</a></h3>
		<hr>
		<a class="article">
		<p class="title">제목</p>
		<hr></a>
		<a class="article">
		<p class="title">제목</p>
		<hr></a>
		<a class="article">
		<p class="title">제목</p>
		<hr></a>
		<a class="article">
		<p class="title">제목</p>
		<hr></a>
		</div>
		</div>
		</div>
			
			<hr>
	</div>
	</div>

<div style="position: fixed; bottom: 20px; right: 70px; font-size: 30px; border: 1px solid black;">
<a href="#">TOP</a>
</div>
	</body>

</html>