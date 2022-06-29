package com.quiz.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson04.dao.SellerDAO;
import com.quiz.lesson04.model.Seller;

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
	
	public Seller getLastSeller() {
		 
		return sellerDAO.selectLastSeller();
	}

	public Seller getSellerById(Integer id) {
		
		return sellerDAO.selectSellerById(id);
	}

}
