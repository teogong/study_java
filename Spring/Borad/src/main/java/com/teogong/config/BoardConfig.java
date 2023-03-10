package com.teogong.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.teogong.controller.BoardController;
import com.teogong.model.BoardDao;
import com.teogong.model.NoticeBoardVO;
import com.teogong.service.BoardService;

@Configuration
public class BoardConfig {
	
	@Bean
	public NoticeBoardVO noticeBoardVO() {
		return new NoticeBoardVO();
	}
	
	@Bean
	public BoardDao boardDao() {
		return new BoardDao();
	}
	
	@Bean
	public BoardService boardService() {
		return new BoardService();
	}
	
	@Bean
	public BoardController boardController() {
		return new BoardController();
	}
 
}
