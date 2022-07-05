package com.quiz.lesson05;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.lesson05.bo.WeatherHistoryBO;
import com.quiz.lesson05.model.WeatherHistory;

@RequestMapping("/lesson05")
@Controller
public class Lesson05Quiz05Controller {

	@Autowired
	WeatherHistoryBO weatherHistoryBO;

	// 웹사이트 http://localhost:8080/lesson05/quiz05/1
	@RequestMapping("/quiz05/1")
	public String quiz05_1() {

		return "lesson05/quiz05";
	}
	@RequestMapping("/quiz05/2")
	public String quiz05_2() {

		return "lesson05/quiz05_2";
	}
	

	@RequestMapping("/quiz05/allSelectWeatherHistory")
	public String allSelectWeatherHistory(

			Model model) {
 
		List<WeatherHistory> weatherHistory = new ArrayList<>();
		weatherHistory = weatherHistoryBO.getWeatherHistory();

		model.addAttribute("weatherHistorys", weatherHistory);

		return "lesson05/quiz05";
	}
}
