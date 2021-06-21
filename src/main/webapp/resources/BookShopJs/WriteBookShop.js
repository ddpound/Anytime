// bookshop/bookshopwrite/user
// 적어도 누가 쓰는지는 알아야하니까
// bookList 는 꼭 남겨놓기

// 밑줄, 손글씨, 표지상태 , 이름 유무, 페이지 상태, 거래 상태

var resultLength
var Bookresult // 책의 결과값을 넣는 전역변수 입니다


function clickBook(i) {
	console.log('책 결과값은 : ' + Bookresult.documents[i].title)
	console.log('책 isbn : ' + Bookresult.documents[i].isbn)
	// 꼭 다 삭제 전에 값을 만들어 놓고 삭제해야한다
	//한줄 즉 그 제목만 남겨놓고 전부 다 삭제해주는거임
	// 자바스크립트는 매개변수를 지정해놔도 받는 매개변수가 없어도 작동한다


	


	allDelElement('SearchCode', 'SearchCodeBtn')
	//bookList 는 꼭 남겨놓기
	// 여기서 새로 다음으로 넘어갈 로직짜야함 함수 생성 요망
	// 제목 isbn 저장 ( label 형식으로)
	var BookListDiv = document.getElementById('bookList')
	BookListDiv.innerHTML += "<div style=\"margin-top: 10px;\">" +
		"<label id=\"booktitle\">제목 : " + Bookresult.documents[i].title + "</label><br>" +
		"<label id=\"bookisbn\">isbn : " + Bookresult.documents[i].isbn + "</label><br></div>"

	document.body.appendChild(BookListDiv);


}


function ResultlistBook(result) {
	allDelElement()

	// 얘 무조건 10개씩 준다
	if (result.documents[0] != null) {


		//console.log('ajax통신확인' + result.documents[0].authors)
		// 반복문으로 모두 출력
		console.log(result.documents.length)
		for (i = 0; i < result.documents.length; i++) {
			var BookListDiv = document.getElementById('bookList')
			Bookresult = result
			resultLength = result.documents.length
			BookListDiv.removeChild(BookListDiv.firstChild)
			BookListDiv.innerHTML += "<div name=\"BookDiv\" id=\"BookDiv\"> <img src=\"" + result.documents[i].thumbnail+ "\"><br>" +
				"<label>제목 : " + result.documents[i].title + "</label><br>" + "<label>isbn : " + result.documents[i].isbn + "</label><br>" + "<label>작가 : " + result.documents[i].authors + "</label><br>"
				+ "<input type=\"radio\" onclick=\"clickBook(" + i + ")\" id=\"book\" name=\"book\" value=\"" + result.documents[i].title + "\">" + "</div><br>"
			document.body.appendChild(BookListDiv);
		}
		// 자바스크립트로 페이징 처리해야함 현재 10개씩만 받아오게 해놓음
	} else {
		alert('검색된 책이 없습니다.')
	}
}

function GowriteBook() {
	// console.log('잘돌아가는지 확인')
	let SearchCode = $("#SearchCode").val()
	//console.log(SearchCode)

	// 서버단으로 유저 세션 값 전달, 그럴필요가 있나? 세션은 서버단에 저장했으니깐 가져오면대자나?
	// 일단 해보자 RESTFUL하게 만들어보자

	$.ajax({
		url: 'search/' + SearchCode,
		type: 'GET',
		contentType: "application/json;charset=utf-8",
		success: function(result) {
			ResultlistBook(result)
		}

	})

}
// 모든 element를 삭제해주는 함수
function allDelElement(elemid1, elemid2) {
	$('label').remove();
	$('img').remove();
	$('input[type=radio][name=book]').remove();
	$('#' + elemid1).remove();
	$('#' + elemid2).remove();
	for (i = 0; i < resultLength; i++) {
		$('br').remove();
		$('#BookDiv').remove();
		// 반복문으로 넣어줘야함, BookDiv 아이디가 하나만 삭제하는 거같음

	}
}




