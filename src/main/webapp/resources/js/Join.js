function getContextPath() {
	var hostIndex = location.href.indexOf(location.host) + location.host.length;
	return location.href.substring(hostIndex, location.href.indexOf('/', hostIndex + 1));
};
// let form serializeArray 사용하려면 내 기억으로 name으로 접근해야하는걸로 기억함
function SaveUser(general) {
	
	let form = {}
	let arr = $("#joinfrm").serializeArray()
	
	
	
	
	
	for (i = 0; i < arr.length; i++) {
		console.log(arr[i].name + " : " + arr[i].value)
		form[arr[i].name] = arr[i].value
	}
	
	

	// 여기에 ajax 넣어야함
	$.ajax({
		url: getContextPath() + '/saveUser', type: 'POST', dataType: 'json',
		data: JSON.stringify(form),
		contentType: 'application/json',
		success: function(result) {
			if (result.test == true) {
				alert('회원가입에 성공하였습니다')
				console.log(getContextPath())
				location.href = getContextPath();
			} else {
				alert('회원가입 실패 이미 있는 아이디입니다')
				location.href = getContextPath();
			}

		},
		error: function() {
			alert('회원가입 실패')
			location.href = getContextPath();
		}


	})
}
