package com.quiz.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.lesson03.bo.RealEstateBO;
import com.quiz.lesson03.model.RealEstate;

@RestController
public class Lesson03Quiz01Controller {
	
	@Autowired
	private RealEstateBO realEstateBO;
	
	
	@RequestMapping("/lesson03/quiz01/1")
	public RealEstate ex01(@RequestParam("id")int id) {
		
		
		return realEstateBO.getRealEstateById(id);
		
	}
	@RequestMapping("/lesson03/quiz01/2")
	public RealEstate ex02() {
		
	}
	
	
	
}