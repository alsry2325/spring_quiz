<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax 통신하기 퀴즈 1번</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</head>
<body>

	<div class="container">
		<h1>즐겨찾기 추가하기</h1>

		<form method="post" action="/lesson06/quiz01/add_favorite">
			<div class="from-group">
				<label for="name">제목</label> <input type="text" id="name"
					name="name" class="form-control col-3" placeholder="제목을 입력하셈">
			</div>

			<div class="from-group">
				<label for="url">주소</label> <input type="text" id="url" name="url"
					class="form-control col-3" placeholder="주소를 입력">
			</div>

			<input type="button" class="btn btn-success" value="추가" id="addBtn">

		</form>



	</div>
	<script>
$(document).ready(function(){
	$('#addBtn').on('click',function(){
		let name = $('#name').val().trim();
		
		if(name ==""){
			alert("제목을 입력하셈");
			return;
		}
		
		let url = $('#url').val().trim();
		if(url ==""){
			alert("주소를 입력하셈");
			return;
		}
		
		console.log(url.indexOf("http"));
		if(url.indexOf('http') == -1 && url.indexOf('https') == -1){
			alert("http를 입력해주셈");
			return;
		}
		
		alert("추가버튼 완료");
		
		$.ajax({
			//request
			type:"POST"		//Request Method
			, url:"/lesson06/quiz01/add_favorite"	//Action URL
			, data:{"name":name, "url":url}  //키 ,변수이름
			//response
			,success: function(data){
				alert(data);
				location.href = "/lesson06/quiz01/select_favorite_view";
			}
			, complete: function(data){
				alert("완료");
			}
			, error: function(e){
				alert("error:"+ e);
			}			
		});
	});
});
</script>

</body>
</html>