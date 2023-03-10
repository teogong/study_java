package com.teogong.model;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BoardDao {
	private static SqlSessionFactory sessionFactory = null;

	public static SqlSessionFactory getInstance() {
		if (sessionFactory == null) {
			try {
				String resource = "mybatis-config.xml";
				Reader reader = Resources.getResourceAsReader(resource);
				sessionFactory = new SqlSessionFactoryBuilder().build(reader);
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
	
	public List<NoticeBoardVO> selectgAllArticles() {
		sessionFactory = getInstance();
		SqlSession session = sessionFactory.openSession();
		List<NoticeBoardVO> articleList = session.selectList("mapper.notice.selectAllArticles");
		session.close();
		return articleList;
	}
	
	public void insertArticle(NoticeBoardVO noticeBoardVO) {
		sessionFactory = getInstance();
		SqlSession session = sessionFactory.openSession();
		session.insert("mapper.notice.insertArticle", noticeBoardVO);
		session.commit();
		// 인설트 업데이트 딜리트는 commit에서 close까지 됨 
	}
	
	public NoticeBoardVO selectArticle(int articleNo) {
		sessionFactory = getInstance();
		SqlSession session = sessionFactory.openSession();
		NoticeBoardVO article = session.selectOne("mapper.notice.selectArticle", articleNo);
		session.close();
		return article;
	}
}
