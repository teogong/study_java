package com.teogong.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	Logger logger = LoggerFactory.getLogger("com.teogong.controller.BoardController");
	
	// "/listarticles" --> listarticles 이걸로 들어오면 ,"/" --> board로 들어오면 
	@RequestMapping({"/listarticles","/"})
	public String getArticleList(Model model) {
		articlelist = boardService.listArticles();
		model.addAttribute("dataList",articlelist);
		logger.debug("이것은 debug레벨 ");
		logger.info("이것은 info레벨 ");
		logger.warn("이것은 warn레벨 ");
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
		logger.debug("이것은 debug레벨 " +articleNo);
		logger.info("이것은 info레벨 "+articleNo);
		logger.warn("이것은 warn레벨 "+articleNo);
		return mv;
	}
	
	@RequestMapping(value = "/editArticle",method = RequestMethod.POST)
	public String editArticle(@RequestParam(value="articleNo") String articleNo, @RequestParam(value="title") String title, 
			@RequestParam(value="content") String content, RedirectAttributes redirectAttr) {
		noticeBoardVO.setArticle_no(Integer.parseInt(articleNo));
		noticeBoardVO.setTitle(title);
		noticeBoardVO.setContent(content);
		boardService.editArticle(noticeBoardVO);
		redirectAttr.addAttribute("no",articleNo);
		return "redirect:view";
		
	}
	
	@RequestMapping(value = "/remove" , method = RequestMethod.POST)
	public String removeArticle(@RequestParam(value="articleNo") String articleNo) {
		boardService.removeArticle(Integer.parseInt(articleNo));
		return "redirect:listarticles";
	}
	
	
	
}
