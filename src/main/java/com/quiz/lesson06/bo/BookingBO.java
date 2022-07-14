package com.quiz.lesson06.bo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson06.dao.BookingDAO;
import com.quiz.lesson06.model.Booking;

@Service
public class BookingBO {

	@Autowired
	BookingDAO bookingDAO;

	public List<Booking> bookingList() {

		return bookingDAO.selectbookingList();
	}

	public void addBooking(String name, Date date, int day, int headcount, String phoneNumber) {

		bookingDAO.insertBooking(name, date, day, headcount, phoneNumber);
	}

	public void deleteBookingById(int id) {

		bookingDAO.deleteBookingById(id);
	}

	public Booking mainSelectByNameandPhoenNumber(String name, String phoneNumber) {

		List<Booking> bookingList = bookingDAO.mainSelectByNameandPhoenNumber(name, phoneNumber);;
		
				if (bookingList.isEmpty()) {
					return null;
				}
				
				return bookingList.get(0);
		
	};

}
