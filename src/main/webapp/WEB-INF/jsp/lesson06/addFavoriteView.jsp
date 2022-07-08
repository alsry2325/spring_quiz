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
					name="name" class="form-control col-10" placeholder="제목을 입력하셈">
			</div>

			<div class="from-group">
				<label for="url">주소</label> 
				<div class="form-inline">
					<input type="text" id="url" name="url"
					class="form-control col-10" placeholder="주소를 입력">
					<button type="button" class="btn btn-info" id="checkBtn">중복확인</button>
					
				</div>
				<!--<small id="warningBox"></small>  -->
				<small id="dulicationText" class="text-danger d-none">중복된 url입니다</small>
				<small id="avaliableUrlText" class="text-success d-none">저장가능한 url입니다</small>
				
				
			</div>

			<input type="button" class="btn btn-success btn-block" value="추가" id="addBtn">

		</form>



	</div>
	<script>
$(document).ready(function(){
	
	$('#checkBtn').on('click',function(){
		
		let url = $('#url').val().trim();
		$('#warningBox').empty(); //자식 태그들을 모두 비움  매번버튼 누를때마다 초기화
		
		if(url == ""){
			alert("url를 입력하세요.")
			$('#warningBox').append('<span class="text-danger">url이 비어있습니다</span>');
			return;
		}
		// 이름이 중복되는지 확인 (DB 조회) AJAX 통신
		$.ajax({
			//request
			type:"GET"
			, url:"/lesson06/quiz02/is_duplication?url="+url
			
			//response
			,success:function(data){
			
				if(data.is_Duplication){
					/*중복일때  */
					/* $('#warningBox').append('<span class="text-danger">url이 중복됨</span>'); */
					$('#dulicationText').removeClass('d-none');
					$('#avaliableUrlText').addClass('d-none');
				}else{
					/*아닐때  */
					/* $('#warningBox').append('<span class="text-danger">저장 가능한url입니다!</span>'); */
					$('#avaliableUrlText').removeClass('d-none');
					$('#dulicationText').addClass('d-none');
				}
				
			}
			,error: function(e){
			alert("중복 확인에 실패함");
		}
		});
		
		
	});
	
	
	
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
		
		
		/* console.log(url.indexOf("http"));
		if(url.indexOf('http') == -1 && url.indexOf('https') == -1){
			alert("http를 입력해주셈");
			return;
		} */
		
		//http 도 아니고(그리고) https도 아닐때 => alert
		if(url.startsWith("http") === false && url.startsWith("https")){
			alert("주소 형식이 잘못됨");
			return;
		}
		//url 중복확인 체크
		//d-none이 있을 때
		if($('#avaliableUrlText').hasClass('d-none')){
			alert("url 종복확인을 다시 해주세요"); 
		}
		
		alert("추가버튼 완료");
		
		//ajax 통신 insert
		$.ajax({
			//request
			type:"POST"		//Request Method  
			, url:"/lesson06/quiz01/add_favorite"	//Action URL
			, data:{"name":name, "url":url}  //키 ,변수이름
			//response    "{"result":"success"}"
			,success: function(data){ // json str을 object로 변환해줌
				if(data.result == "success"){
					alert("입력 성공했습니다.");
					location.href = "/lesson06/quiz01/select_favorite_view";
				}
				
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