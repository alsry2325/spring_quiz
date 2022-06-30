package com.quiz.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.lesson04.bo.RealtorBO;
import com.quiz.lesson04.model.Realtor;


@RequestMapping("/lesson04")
@Controller
public class Lesson04Quiz02Cotroller {
		
		@Autowired
		RealtorBO realtorBO;
	
		@GetMapping("/quiz02/1")
		public String addRealtorView() {
		
			return "/lesson04/add_realtor";
	}
		
		@PostMapping("/quiz02/add_realtor")
		public String addRealtor(
				@ModelAttribute Realtor realtor, 
				Model model
				) {
			
			 realtorBO.addRealtor(realtor); 
			 
			 realtor = realtorBO.getRealtorById(realtor.getId());
			
			 model.addAttribute("result", realtor);
			 model.addAttribute("test", "공인중개사 정보");
			 
			return "/lesson04/after_add_realtor"; 
		}
	
}
