package com.quiz.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson04.dao.SellerDAO;

@Service
public class SellerBO {

	@Autowired
	private SellerDAO sellerDAO;
	
	
	public int addSellerAsField(
			String nickname,
			String profileImageUrl,
			String temperature) {

		return sellerDAO.insertSellerAsField(nickname, profileImageUrl, temperature);
	}
	
	public int getLastSeller() {
		 
		return ;
	}

}
