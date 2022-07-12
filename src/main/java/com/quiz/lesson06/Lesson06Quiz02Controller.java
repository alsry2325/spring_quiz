package com.quiz.lesson06;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	//예약안내
	@RequestMapping("/reservation_View")
	public String reservationView() {
		
		
		return"lesson06/reservationView";
	}
	@ResponseBody
	@PostMapping("/add_Booking")
	public String addBooking(
				RequestParam("")	
			) {
		return;
	}
	
	// POST / GET       PUT DELETE      RESTFUL API
		// AJAX 통신  삭제
		@ResponseBody
		@DeleteMapping("/delete_booking")
		public Map<String, Object> deleteBooking(
				@RequestParam("id") int id) {
			
			// db delete
			bookingBO.deleteBookingById(id);
			
			// 성공 여부 map -> json
			Map<String, Object> result = new HashMap<>();
			result.put("result", "success");
			return result;
		}
		
		
}
