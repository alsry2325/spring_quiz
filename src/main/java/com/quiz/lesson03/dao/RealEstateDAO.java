package com.quiz.lesson03.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.quiz.lesson03.model.RealEstate;

@Repository
public interface RealEstateDAO {

	
	
	public RealEstate selectRealEstateById(@Param("id")int id);
	
	public List<RealEstate> selectRealEstateByRentPrice(@Param("rentPrice") int rentPrice);
	
	public int insertRealEstate(RealEstate realEstate);
	
	
	public int insertRealEstateAsField(
			@Param("realtorId")int realtorId,
			@Param("address")String address, 
			@Param("area")int area,
			@Param("type")String type,
			@Param("price")int price, 
			@Param("rentPrice")Integer rentPrice);
}
