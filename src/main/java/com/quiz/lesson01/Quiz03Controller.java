package com.quiz.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Quiz03Controller {
	
	@RequestMapping("/lesson01/quiz03/1")
	public String ex02_1() {
		//@ResponseBody가 아닌상태로 string을 리턴을 하면
		//리턴된 string 이름의 jsp view를 찾고  화면이 구성된다.
		
		
//		return "/WEB_INF/jsp/lesson01/ex02.jsp";
		return "/lesson01/quiz03";	//prefix,suffix 제외 jsp view 경로와 이름
	}
}
