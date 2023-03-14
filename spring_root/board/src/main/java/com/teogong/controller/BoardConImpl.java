package com.teogong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.teogong.model.NoticeBoardVO;
import com.teogong.service.BoardService;

@Controller("boardController")
@RequestMapping("/board")
public class BoardConImpl implements BoardController{
	@Autowired
	BoardService boardService;
	
	@Autowired
	NoticeBoardVO noticeBoardVO;
	
	List<NoticeBoardVO> articlelist;

	@Override
	@RequestMapping({"/listarticles","/"})
	public String getArticleList(Model model) throws Exception {
		// TODO Auto-generated method stub
		articlelist = boardService.listArticles();
		model.addAttribute("dataList",articlelist);
		return "list";
	}

	@Override
	@RequestMapping("/add")
	public String writeArticle() throws Exception {
		// TODO Auto-generated method stub
		return "write";
	}

	@Override
	@RequestMapping(value ="/addarticle", method = RequestMethod.POST)
	public String addArticle(String title, String content) throws Exception {
		// TODO Auto-generated method stub
		noticeBoardVO.setTitle(title);
		noticeBoardVO.setContent(content);
		noticeBoardVO.setWrite_id("HUN");
		
		boardService.addArticle(noticeBoardVO);
		
		return "redirect:listarticles";
	}

	@Override
	@RequestMapping(value = "/view",method = RequestMethod.GET)
	public ModelAndView viewArticle(String articleNo) throws Exception {
		// TODO Auto-generated method stub
		noticeBoardVO = boardService.viewArticle(Integer.parseInt(articleNo));
		ModelAndView mv = new ModelAndView();
		mv.setViewName("view");
		mv.addObject("article",noticeBoardVO);

		return mv;
	}

	@Override
	@RequestMapping(value = "/editArticle",method = RequestMethod.POST)
	public String editArticle(String articleNo, String title, String content, RedirectAttributes redirectAttr)
			throws Exception {
		// TODO Auto-generated method stub
		noticeBoardVO.setArticle_no(Integer.parseInt(articleNo));
		noticeBoardVO.setTitle(title);
		noticeBoardVO.setContent(content);
		boardService.editArticle(noticeBoardVO);
		redirectAttr.addAttribute("no",articleNo);
		return "redirect:view";
	}

	@Override
	@RequestMapping(value = "/remove" , method = RequestMethod.POST)
	public String removeArticle(String articleNo) throws Exception {
		// TODO Auto-generated method stub
		boardService.removeArticle(Integer.parseInt(articleNo));
		return "redirect:listarticles";
	}
	
	
}
