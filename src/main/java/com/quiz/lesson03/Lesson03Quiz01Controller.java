package com.quiz.lesson03;

import java.util.List;

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
	public List<RealEstate> ex02(@RequestParam("rentPrice")int rentPrice) {
		
		return realEstateBO.getRealEstateByRentPrice(rentPrice);
	}
	
	@RequestMapping("/lesson03/quiz01/3")
	public List<RealEstate> ex03(
			@RequestParam("area")int area,
			@RequestParam("price")int price
			){
		
		return realEstateBO.getRealEstateByAreaAndPrice(area, price);
	}
	
	
	
//	http://localhost:8080/lesson03/quiz02/1
	@RequestMapping("/lesson03/quiz02/1")
	public String quiz02_1() {
		
		RealEstate realEstate  = new RealEstate();
		
		realEstate.setRealtorId(3);
		realEstate.setAddress("푸르지용 리버 303동 1104호");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(100000);
		
		int row = realEstateBO.addRealEstate(realEstate);
		
		return	"입력성공"+ row;
	}
	/*
	 * http://localhost:8080/lesson03/quiz02/2?realtor_id=5
	 * realtorid: ?
	 * address : 썅떼빌리버 오피스텔 814호
		area : 45
		type : 월세
		price : 100000
		rentPrice : 120
	 */
	@RequestMapping("/lesson03/quiz02/2")
	public String quiz02_2(@RequestParam("realtor_id")int realtorId) {
		
		int row	 = realEstateBO.addRealEstateAsField(realtorId, "썅떼빌리버 오피스텔 814호",45,"월세", 100000,120);
		
		return row +"입력완료";
		
	}
	
	@RequestMapping("/lesson03/quiz03/1")
	public String quiz03(@RequestParam("id")int id ,
						@RequestParam("type")String type,
						@RequestParam("price")int price
						) {
		
		
		 
			int row =	realEstateBO.updateRealEstateById(id, type, price);
				
				return "수정성공: "+ row;
	}
	
	@RequestMapping("/lesson03/quiz04/1")
	public String quiz04(@RequestParam("id")int id) {
		
	int row	= realEstateBO.deleteRealEstateById(id);
		 
		 return "삭제성공:"+ row;
	}

	
}
