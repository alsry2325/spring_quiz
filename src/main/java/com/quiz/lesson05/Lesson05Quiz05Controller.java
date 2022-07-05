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
	private WeatherHistoryBO weatherHistoryBO;
	
	@RequestMapping("/weather_history_view")
	public String weatherHistoryView(Model model) {
		List<WeatherHistory> weatherHistoryList = weatherHistoryBO.getWeatherHistoryList();
		model.addAttribute("weatherHistorys", weatherHistoryList);
		return "lesson05/quiz05";
	}
	
//	@RequestMapping("/add_weather_view")
//	public String addWeatherView() {
//		return "lesson05/addWeatherView";
//	}
	
	@PostMapping("/add_weather_view")
	public int addWeatherView(
			 
			) {
		
		return;
	}
	
	
	
}
