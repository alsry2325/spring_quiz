package com.quiz.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson03.dao.RealEstateDAO;
import com.quiz.lesson03.model.RealEstate;


@Service
public class RealEstateBO {

	@Autowired
	private	RealEstateDAO realEstateDAO;
	
	
	//input output인지 반드시 id
	public RealEstate getRealEstateById(int id) {
		
		return realEstateDAO.selectRealEstateById(id);
	}
	
	public RealEstate getRealEstateByRentPrice(int rentPrice) {
		
		return;
	}
	
}
