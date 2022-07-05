<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날씨 정보</title>

<%-- bootstrap, jquery 원본 --%>
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
	
<%-- datepicker --%>

<%-- css --%>
<link rel="stylesheet" type="text/css" 
	href="/css/lesson05_quiz05.css">

</head>
<body>
	<div id="wrap">
		<div class="contents d-flex">
			<nav>
				<%-- 로고 영역 --%>
				<div class="d-flex justify-content-center pt-4">
					<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/3/3f/Emblem_of_the_Government_of_the_Republic_of_Korea.svg/800px-Emblem_of_the_Government_of_the_Republic_of_Korea.svg.png"	width="25">
					<span class="text-white font-weight-bold ml-2">기상청</span>
				</div>
				
				<%-- 메뉴 영역 ul(nav), li(nav-item), a(nav-link) 
					flex-column: 세로메뉴
				--%>
				<ul class="nav flex-column mt-4">
					<li class="nav-item"><a href="/lesson05/weather_history"
						class="nav-link menu-font">날씨</a></li>
					<li class="nav-item"><a href="/lesson05/add_weather_view"
						class="nav-link menu-font">날씨입력</a></li>
					<li class="nav-item"><a href="#" class="nav-link menu-font">테마날씨</a></li>
					<li class="nav-item"><a href="#" class="nav-link menu-font">관측
							기후</a></li>
				</ul>
			</nav>
			<section class="right">
				<h1>과거 날씨</h1>
				
				<table class="table text-center">
					<thead>
						<tr>
							<th>날짜</th>
							<th>날씨</th>
							<th>기온</th>
							<th>강수량</th>
							<th>미세먼지</th>
							<th>풍속</th>
						</tr>
					</thead>
					<tbody>
								 <c:forEach  items="${weatherHistorys}" var="weatherHistory" varStatus="status">
									
									<tr>
							<td><fmt:formatDate value="${weatherHistory.date}" pattern="yyyy년 MM월 dd일"/></td>
										
									<c:choose>
										<c:when test="${weatherHistory.weather eq '맑음'}">
											<td>
												<img src="/img/sunny.jpg">
											</td>
										</c:when>
										<c:when test="${weatherHistory.weather eq '비'}">
											<td>
												<img src="/img/rainy.jpg">
											</td>
										</c:when>
										<c:when test="${weatherHistory.weather eq '구름조금'}">
											<td>
												<img src="/img/partlyCloudy.jpg">
											</td>	
										</c:when>
										<c:when test="${weatherHistory.weather eq '흐림'}">
											<td>
												<img src="/img/cloudy.jpg">
											</td>	
										</c:when>
									</c:choose>	
										<td>${weatherHistory.temperatures}ºC</td>
										<td>${weatherHistory.precipitation}mm</td>
										<td>${weatherHistory.microDust}</td>
										<td>${weatherHistory.windSpeed}km/h</td>
									</tr>
								
								
								</c:forEach>
							
							
							</tbody>
				</table>
			</section>
		</div>
		<footer class="d-flex align-items-center">
			<div class="ml-4">
				<img class="foot-logo-image"
					src="https://www.weather.go.kr/w/resources/image/foot_logo.png"
					width="120">
			</div>
			<div class="ml-4">
				<small class="text-secondary"> (07062) 서울시 동작구 여의대방로16길 61 <br>
					Copyright@2020 KMA. All Rights RESERVED.
				</small>
			</div>
		</footer>
	</div>
</body>
</html>