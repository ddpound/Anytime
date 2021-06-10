function getContextPath() {
	var hostIndex = location.href.indexOf( location.host ) + location.host.length;
	return location.href.substring( hostIndex, location.href.indexOf('/', hostIndex + 1) );
};
// let form serializeArray 사용하려면 내 기억으로 name으로 접근해야하는걸로 기억함
function SaveUser() {
	console.log("테스트")
	let form = {}

	let arr = $("#joinfrm").serializeArray()

	for (i = 0; i < arr.length; i++) {
		console.log(arr[i].name + " : " + arr[i].value)
		form[arr[i].name] = arr[i].value
	}
	
	// 여기에 ajax 넣어야함
	$.ajax({
		url : getContextPath()+'/saveUser', type : 'POST' , dataType:'json',
		data : JSON.stringify(form),
		contentType: "application/json; charset=utf8",
		success : function(result){
			alert('회원가입 성공')
		}
		
		
	})	
}
