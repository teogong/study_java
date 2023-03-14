package com.teogong.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("boardDao")
public interface BoardDao {
	public List<NoticeBoardVO> selectAllArticles() throws DataAccessException;
	public void insertArticle(NoticeBoardVO noticeBoardVO) throws DataAccessException;
	public NoticeBoardVO selectArticle(int articleNo) throws DataAccessException;
	public void updateArticle(NoticeBoardVO noticeBoardVO) throws DataAccessException;
	public void deleteArticle(int articleNo) throws DataAccessException;
}
