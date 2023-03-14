package com.teogong.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teogong.model.NoticeBoardVO;
import com.teogong.service.BoardService;

@RestController
@RequestMapping("/public")
public class RestSvcController {
	@Autowired
	BoardService boardService;
	
	@Autowired
	NoticeBoardVO noticeBoardVO;
	
	List<NoticeBoardVO> articlelist;
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello! Welcome to REST";
	}
	
	@RequestMapping("/hello2")
	public Map<String, String> hello2() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "홍길동");
		map.put("age", "30");
		return map;
	}
	
//	@RequestMapping(value ="/article/{num}",method = RequestMethod.GET)
//	public NoticeBoardVO getArticle(@PathVariable("num") int articleNo) {
//		noticeBoardVO = boardService.viewArticle(articleNo);
//		return noticeBoardVO;
//	}
	
	@RequestMapping(value ="/article/{num}",method = RequestMethod.GET)
	public ResponseEntity<NoticeBoardVO> getArticle(@PathVariable("num") int articleNo) {
		noticeBoardVO = boardService.viewArticle(articleNo);
		return new ResponseEntity<NoticeBoardVO>(noticeBoardVO, HttpStatus.BAD_REQUEST);
	}
	
	
	@RequestMapping("/list")
	public Map<String, List<NoticeBoardVO>>getArticleList() {
		List<NoticeBoardVO> articles = boardService.listArticles();
		Map<String, List<NoticeBoardVO>> map = new HashMap<String,  List<NoticeBoardVO>>();
		map.put("list", articles);
		return map;
	}
	
}
