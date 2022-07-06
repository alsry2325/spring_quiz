package com.quiz.lesson06;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.lesson06.bo.FavoriteBO;
import com.quiz.lesson06.model.Favorite;

@RequestMapping("/lesson06")
@Controller
public class Lesson06Quiz01Controller {

	@Autowired
	private FavoriteBO favoriteBO;

	// http://localhost:8080/lesson06/quiz01/add_favorite_view
	@RequestMapping("/quiz01/add_favorite_view")
	public String addFavoriteView() {
		return "lesson06/addFavoriteView";
	}

	@PostMapping("/quiz01/add_favorite")
	public String addFavorite(
			@RequestParam("name") String name, 
			@RequestParam("url") String url) {
		System.out.println("name: " + name + ", url: " + url);
		favoriteBO.addFavorite(name, url);

		return "lesson06/addFavoriteView";
	}
	
	@RequestMapping("/quiz01/select_favorite_view")
	public String selcetFavoriteView(Model model){
		
		List<Favorite> favorites = favoriteBO.getFavorite();
		 
		
		model.addAttribute("favorites",favorites);
		
		return "lesson06/selectFavoriteView";
	}
}
