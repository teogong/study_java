package com.teogong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.teogong.model.BoardDao;
import com.teogong.model.NoticeBoardVO;

public class BoardService {
	@Autowired
	BoardDao boardDao;
	
	public List<NoticeBoardVO> listArticles() {
		List<NoticeBoardVO> articleList = boardDao.selectgAllArticles();
		return articleList;
	}
	
	public void addArticle(NoticeBoardVO noticeBoardVO) {
		boardDao.insertArticle(noticeBoardVO);
	}
	
	public NoticeBoardVO viewArticle(int articleNo) {
		NoticeBoardVO article = boardDao.selectArticle(articleNo);
		return article;
	}
}
