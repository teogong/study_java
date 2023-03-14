package com.teogong.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teogong.model.BoardDao;
import com.teogong.model.NoticeBoardVO;

@Service("boardService")
@Transactional
// @Transactional 사용할려면 써줘어야한다.
public class BoardSvcImpl implements BoardService {
	
	@Autowired
	BoardDao boardDao;
	
	Logger logger = LoggerFactory.getLogger("com.teogong.service.BoardSvcImpl");
	
	@Override
	public List<NoticeBoardVO> listArticles() {
		List<NoticeBoardVO> articleList = boardDao.selectAllArticles();
		return articleList;
	}
	
	@Override
	public void addArticle(NoticeBoardVO noticeBoardVO) throws DataAccessException{
		logger.debug("=====> addArticle: articleNo: "+ noticeBoardVO.getArticle_no());
		boardDao.insertArticle(noticeBoardVO);
	}
	
	@Override
	public NoticeBoardVO viewArticle(int articleNo) {
		logger.debug("=====> viewArticle: articleNo: "+ articleNo);
		NoticeBoardVO article = boardDao.selectArticle(articleNo);
		return article;
	}
	
	@Override
	public void editArticle(NoticeBoardVO noticeBoardVO) {
		boardDao.updateArticle(noticeBoardVO);
	}
	
	@Override
	public void removeArticle(int articleNo) {
		logger.debug("=====> removeArticle: articleNo: "+ articleNo);
		boardDao.deleteArticle(articleNo);
	}
}
