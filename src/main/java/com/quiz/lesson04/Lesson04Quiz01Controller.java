package com.quiz.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.lesson04.bo.SellerBO;
import com.quiz.lesson04.model.Seller;


@RequestMapping("/lesson04")
@Controller
public class Lesson04Quiz01Controller {
	
	@Autowired
	private SellerBO sellerBO;
	
//	http://localhost8080/lesson04/quiz01/1
	@GetMapping("/quiz01/1")
	public String inputView() {
		
		return "lesson04/add_seller";
	}
	
	
	@PostMapping("/quiz01/add_seller")
	public String addSeller(
				@RequestParam("nickname")String nickname,
				@RequestParam(value="profileImageUrl",required=false)String profileImageUrl,
				@RequestParam("temperature")String temperature
			) {
		
			sellerBO.addSellerAsField(nickname, profileImageUrl, temperature);
		
		return "lesson04/after_add_seller";
	}
	
//	@GetMapping("/quiz01/seller_info")
//	public String sellerInfo(Model model) {
//		
//		Seller seller = sellerBO.getLastSeller();
//		
//		model.addAttribute("result", seller);
//		
//		model.addAttribute("LastSeller", "판매자정보");
//		
//		return  "lesson04/last_seller";
//	}
	
	// http://localhost:8080/lesson04/quiz01/seller_info
	// http://localhost:8080/lesson04/quiz01/seller_info?id=5
	@GetMapping("/quiz01/seller_info")//required=false db에 널값 허용안되서 씀
	public String sellerInfo(Model model ,
			@RequestParam(value="id", required=false) Integer id) {
		
			Seller seller = null;
			if (id == null) {
				seller = sellerBO.getLastSeller();
			} else {
				seller = sellerBO.getSellerById(id);
			}
			
			model.addAttribute("seller", seller);
			
			model.addAttribute("LastSeller", "판매자정보");
			
			return  "lesson04/last_seller";
	}
	
	
}
