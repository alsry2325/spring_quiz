package com.quiz.lesson05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RequestMapping("/lesson05")
@Controller
public class Lesson05Quiz05Controller {

	
	@RequestMapping("")
	public String quiz05() {
		
		return "";
	}
}
