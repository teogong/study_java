package com.teogong.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.teogong.model.NoticeBoardVO;

public interface BoardService {
	public List<NoticeBoardVO> listArticles() throws DataAccessException;
	public void addArticle(NoticeBoardVO noticeBoardVO) throws DataAccessException; 	
	public NoticeBoardVO viewArticle(int articleNo) throws DataAccessException;	
	public void editArticle(NoticeBoardVO noticeBoardVO) throws DataAccessException;	
	public void removeArticle(int articleNo) throws DataAccessException;
}
