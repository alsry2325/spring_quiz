package com.quiz.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.quiz.lesson03.model.RealEstate;

@Repository
public interface RealEstateDAO {

	
	
	public RealEstate selectRealEstateById(@Param("id")int id);
	
	public RealEstate selectRealEstateByRentPrice(@Param("rentPrice") int rentPrice);
}
