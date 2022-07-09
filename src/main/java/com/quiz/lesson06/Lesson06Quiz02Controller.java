package com.quiz.lesson06;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quiz.lesson06.bo.BookingBO;
import com.quiz.lesson06.model.Booking;

@RequestMapping("/lesson06")
@Controller
public class Lesson06Quiz02Controller {

	@Autowired
	BookingBO bookingBO;
	
	
	@GetMapping("/booking_view")
	public String bookingView() {
		
		return	"lesson06/bookingView";
	}
	
	//리스트 뷰
	@RequestMapping("/booking_list_view")
	public String bookingListView(Model model){
		
		List<Booking> booking = bookingBO.bookingList();
		
		System.out.println(booking);
		model.addAttribute("bookings", booking);
		
		return"lesson06/bookingView";
	}
}
