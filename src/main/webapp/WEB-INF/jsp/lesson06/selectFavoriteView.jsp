<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기목록</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script> 

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
	<h1>즐겨찾기목록</h1>
		<table class="table text-center">
			<thead>
				<tr>
					<th>no.</th>
					<th>이름</th>
					<th>주소</th>
				</tr>
				
			</thead>
			<tbody>
				<c:forEach items="${favorites}" var="favorite" varStatus="status">
					<tr>
						<td>${favorite.id}</td>
						<td>${favorite.name}</td>
						<td>${favorite.url}</td>
						<td>
							<!--(1) name 속성과 value 속성을 이용해서 동적으로 삭제 감지(권장 안함)  -->
							<%-- <button type="button" name="delBtn" value="${favorite.id}" class="btn btn-info deleteBtn">삭제</button> --%>
							
							<!--(2) data를 이용해서 태그에 data를 임시 저장해놓기  -->
							<button type="button" class="btn btn-info deleteBtn">삭제</button>
						</td>
					</tr>
				</c:forEach>
	</table>
	
	</div>
<script>
$(document).ready(function(){
	<!--(1) name 속성과 value 속성을 이용해서 동적으로 삭제 감지(권장 안함)  -->
	$('button[name=delBtn]').on('click',function(e){
			/* let id = $(this).attr('value'); */
			
					e.target.value;
	   
			alert(id);
		/* if (confirm("정말 삭제하시겠습니까 ?")) {
			console.log(confirm())
		} */
		
	});
	
});


</script>
		
</body>
</html>