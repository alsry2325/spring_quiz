<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>통나무 펜션</title>
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
	
	<%-- css --%>
<link rel="stylesheet" type="text/css" 
	href="/css/lesson06_booking.css">
</head>
<body>
	 <div id="wrap" class="align-items-center">
            <header class="d-flex justify-content-around pt-4 pb-2">
                <h1>통나무 펜션</h1>
            </header>
            <nav class="color_peru">
                <ul class="nav nav-fill">
                    <li class="nav-item"><a class="nav-link main_link" href="#">펜션소개</a></li>
                    <li class="nav-item"><a class="nav-link main_link" href="#">객실보기</a></li>
                    <li class="nav-item"><a class="nav-link main_link" href="#">예약안내</a></li>
                    <li class="nav-item"><a class="nav-link main_link" href="#">커뮤니티</a></li>
                </ul>
            </nav>
            <article>
            	<div class="text-center m-3">
            		<h2>예약 목록 보기</h2>
            		
            		<table class="table text-center">
					<thead>
						<tr>
							<th>이름</th>
							<th>예약날짜</th>
							<th>숙박일수</th>
							<th>숙박인원</th>
							<th>전화번호</th>
							<th>예약상태</th>
							
						</tr>
					</thead>
						<tbody>
							<c:forEach items="${bookings}" var="booking" varStatus="status">
								<tr>
									<td>${booking.name}</td>
									<td>
										<fmt:formatDate value="${booking.date}" pattern="yyyy년 MM월 dd일"/>								
									</td>
									<td>${booking.day}</td>
									<td>${booking.headcount}</td>
									<td>${booking.phoneNumber}</td>
									<td>${booking.state}</td>
									<c:choose>
										<c:when test="${booking.state eq '확정'}">
											<td>
												<span class='text-success'>${booking.state}</span>
											</td>
										</c:when>
										<c:when test="${booking.state eq '대기중'}">
											<td>
												<span class='text-primary'>${booking.state}</span>
											</td>
										</c:when>
									</c:choose>
									<td><button type="button" class="btn btn-danger del-btn" data-favorite-id="">삭제</button></td>
								</tr>
							</c:forEach>
						</tbody>
            		</table>
            	</div>
            		
            	    
            </article>
            <footer>
            	<div>
            		제주특별차치도 제주시 애월읍<br>
            		사업자등록번호:111-22-255222/ 농어촌민박사업자지정/ 대표:정민교<br>
            		Copyright2025 tongnamu,All right reserved
            	</div>
            
            </footer>
        </div>

        <script>
              
        </script>
</body>
</html>