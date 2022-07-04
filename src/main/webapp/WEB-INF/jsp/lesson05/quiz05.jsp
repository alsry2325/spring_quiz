<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <link rel="stylesheet" href="/css/style_p01.css" type="text/css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>

	 	<div class="container bg-primary">
           <section class= "d-flex">
          		<div class="bg-success w-25 ">
          			 <nav class="color_peru">
			                <ul class="nav nav-fill flex-column">
			                    <li class="nav-item"><a class="nav-link main_link" href="#">날씨</a></li>
			                    <li class="nav-item"><a class="nav-link main_link" href="#">날씨입력</a></li>
			                    <li class="nav-item"><a class="nav-link main_link" href="#">테마날씨</a></li>
			                    <li class="nav-item"><a class="nav-link main_link" href="#">관측기후</a></li>
			                </ul>
           			</nav>
          
          		</div>
          		<div class="bg-warning w-75 ">
          			
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
								 <c:forEach  items="#{weatherHistorys}" var="weatherHistory" varStatus="status">
									
									<tr>
										<td>${weatherHistory.date}</td>
									</tr>
								
								
								</c:forEach>
							
							
							</tbody>
          				</table>
          			
          		</div>
            </section>
            <footer class="d-flex">
            	<div class="bg-info  col-2">
            		<img class="w-100 h-100" alt="test" src="https://www.weather.go.kr/w/resources/image/foot_logo2.png">
            	</div>
            	<div class="bg-light  col-10">
            		(07062)서울시 동작구 여의대방로16길 61<br>
            		Copyright@2022 KMA. All Rights RESERVED. 
             	</div>
            </footer>

        </div>

</body>
</html>