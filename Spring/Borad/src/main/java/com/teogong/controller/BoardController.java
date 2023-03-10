package com.teogong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.teogong.model.NoticeBoardVO;
import com.teogong.service.BoardService;

@Controller
@RequestMapping("/board")
// board만 받고 다른것은 안옴 
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@Autowired
	NoticeBoardVO noticeBoardVO;
	
	List<NoticeBoardVO> articlelist;
	
	// "/listarticles" --> listarticles 이걸로 들어오면 ,"/" --> board로 들어오면 
	@RequestMapping({"/listarticles","/"})
	public String getArticleList(Model model) {
		articlelist = boardService.listArticles();
		model.addAttribute("dataList",articlelist);
		return "list";
	}
	
	@RequestMapping("/add")
	public String writeArticle() {
		return "write";
	}
	
	
	//방법 1
	@RequestMapping(value ="/addarticle", method = RequestMethod.POST)
	public String addArticle(@RequestParam(value="i_title") String title, 
			@RequestParam(value="i_content") String content) {
		noticeBoardVO.setTitle(title);
		noticeBoardVO.setContent(content);
		noticeBoardVO.setWrite_id("HUN");
		
		boardService.addArticle(noticeBoardVO);
		
		return "redirect:listarticles";
		
	}
	
	//방법 2
	@RequestMapping(value = "/view",method = RequestMethod.GET)
	//무조건 문자 타입을 넘어온다. 
	public ModelAndView viewArticle(@RequestParam(value="no") String articleNo) {
		noticeBoardVO = boardService.viewArticle(Integer.parseInt(articleNo));
		ModelAndView mv = new ModelAndView();
		mv.setViewName("view");
		mv.addObject("article",noticeBoardVO);
		return mv;
	}
	
	
}
