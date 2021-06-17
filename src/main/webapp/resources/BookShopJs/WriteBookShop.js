// bookshop/bookshopwrite/user
// 적어도 누가 쓰는지는 알아야하니까


function GowriteBook(){
	// console.log('잘돌아가는지 확인')
	let SearchCode =  $("#SearchCode").val()
	console.log(SearchCode)
	
	// 서버단으로 유저 세션 값 전달, 그럴필요가 있나? 세션은 서버단에 저장했으니깐 가져오면대자나?
	// 일단 해보자 RESTFUL하게 만들어보자
	
	$.ajax({
		url: 'search/'+ SearchCode,
		type : 'GET',
		contentType: "application/json;charset=utf-8",
		success: function(result){
			console.log('ajax통신확인' + result)
		}
		
	})
	
}
