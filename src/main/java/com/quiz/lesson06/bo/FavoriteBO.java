package com.quiz.lesson06.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson06.dao.FavoriteDAO;
import com.quiz.lesson06.model.Favorite;

@Service
public class FavoriteBO {

	@Autowired
	private	FavoriteDAO favoritDAO;
	
	public void addFavorite(String name, String url) {
		 favoritDAO.insertFavorite(name,url);
	}
	
	public List<Favorite> getFavorite(){
		
		return favoritDAO.selectFavorite();
	}
	
	public boolean existFavoriteByUrl(String url) {
		
		return favoritDAO.selectFavoriteByUrl(url);
	}
	
	public void getFavoriteId(int id){
		
		 favoritDAO.deleteFavoriteId(id);
	}
	
}
