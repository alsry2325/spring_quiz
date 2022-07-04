package com.quiz.lesson05.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson05.dao.WeatherHistoryDAO;
import com.quiz.lesson05.model.WeatherHistory;

@Service
public class WeatherHistoryBO {

	@Autowired
	WeatherHistoryDAO weatatherHistoryDAO;
	
	public List<WeatherHistory> getWeatherHistory(){
	
		return weatatherHistoryDAO.selectWeatherHistory();
	}
}
