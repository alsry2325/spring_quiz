package com.quiz.lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/quiz02")
@RestController
public class Quiz02Controller {

	
	@RequestMapping("/1")
	public List<Map<String, Object>> quiz02_1(){
		
		List<Map<String,Object>> movies = new ArrayList<>();
		Map<String,Object> movie1 = new HashMap<>();
		movie1.put("rate", 15);
		movie1.put("director", "봉준호");
		movie1.put("time",131);
		movie1.put("title", "기생충");
		movies.add(movie1);
		/*
		 * 이런식으로 가능
		 * 	movie1 = new HashMap<>();
		 * 	movie1.put("rate", 0);
			movie1.put("director", "로베르토 베니니");
			movie1.put("time", 116);
			movie1.put("title", "인생은 아름다워");
			movie1.add(movie1);
		 */
		
		Map<String,Object> movie2 = new HashMap<>();
		movie2.put("rate", 0);
		movie2.put("director", "로베르토 베니니");
		movie2.put("time", 116);
		movie2.put("title", "인생은 아름다워");
		movies.add(movie2);
		
		Map<String,Object> movie3 = new HashMap<>();
		movie3.put("rate", 12);
		movie3.put("director", "크리스토퍼 놀란");
		movie3.put("time", 147);
		movie3.put("title", "인셉션");
		movies.add(movie3);
		
		Map<String,Object> movie4 = new HashMap<>();
		movie4.put("rate", 19);
		movie4.put("director", "윤종빈");
		movie4.put("time", 133);
		movie4.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
		movies.add(movie4);
		
		Map<String , Object> movie5 = new HashMap<>();
		movie5.put("rate",15);
		movie5.put("director","프란시스 로렌스");
		movie5.put("time",137);
		movie5.put("title","헝거게임");
		movies.add(movie5);
		
		return movies;
			
		}
		@RequestMapping("/2")
		public List<Notice> ex02_2() {
			List<Notice> list = new ArrayList<>();
			
			Notice notice = new Notice();

			notice.setTitle("안녕하세요 가입인사드립니다");
			notice.setUser("hagulu");
			notice.setContent("안녕 가입했어요.");
			list.add(notice);
			
			notice = new Notice();
			notice.setTitle("헐 대박");
			notice.setUser("bada");
			notice.setContent(" 기모리이이잏히.");
			list.add(notice);
			
			notice = new Notice();
			notice.setTitle("오늘 데이터 한이야기 해드릴게요");
			notice.setUser("dulumary");
			notice.setContent("....");
			list.add(notice);
			
			
			return list;
		
 	}
		@RequestMapping("/3")
		public ResponseEntity<Notice> quiz02_3(){
			Notice notice = new Notice();
			notice.setTitle("헐 대박");
			notice.setUser("bada");
			notice.setContent(" 기모리이이잏히.");
			
			return new ResponseEntity<>(notice,HttpStatus.INTERNAL_SERVER_ERROR);
		}
}
