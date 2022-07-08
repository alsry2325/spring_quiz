package com.quiz.lesson06;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

	// AJAX로 들어온 요청은 반드시 @ResponseBody가 붙어있어야 하고, String을 리턴해야 한다.
	// 즐겨찾기 데이터 추가 - AJAX로 들어오는 요청
	// {"name":"신보람"} => JSON String
	@ResponseBody
	@PostMapping("/quiz01/add_favorite")
	public Map<String,Object> addFavorite(
			@RequestParam("name") String name, 
			@RequestParam("url") String url) {
			favoriteBO.addFavorite(name, url);
			
			// 성공 여부를 map에 담는다.
			// {"result":"success"}
			Map<String, Object> result = new HashMap<>();
			result.put("result", "success");
			result.put("result_code", 1);
			
			
			// return map
			return result; 
	}
	//리스트 불러옴
	@RequestMapping("/quiz01/select_favorite_view")
	public String selcetFavoriteView(Model model) {

		// select db
		List<Favorite> favorites = favoriteBO.getFavorite();

		model.addAttribute("favorites", favorites);

		return "lesson06/selectFavoriteView";
	}
	//주소 중복확인
	@GetMapping("/quiz02/is_duplication")
	@ResponseBody
	public Map<String, Boolean> isDuplication(
			@RequestParam("url")String url){
		
			boolean isDuplication = favoriteBO.existFavoriteByUrl(url);
			
			Map<String,Boolean> result = new HashMap<>();
			result.put("is_Duplication", isDuplication); //중복인지 아닌지 true면 중복
			
			return result;
	}
	//게시물 삭제
	@GetMapping("/quiz02/delete_input")
	@ResponseBody
	public Map<String,Object> deleteInput(
			@RequestParam("id")int id) {
			favoriteBO.getFavoriteId(id);
		
			Map<String, Object> result = new HashMap<>();
			result.put("result", "success");
			result.put("result_code", 1);
			
			return result;
	}
	
}
