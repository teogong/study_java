package com.teogong.model;

import org.springframework.stereotype.Component;

@Component("noticeBoardVO")
public class NoticeBoardVO {
	private int article_no;
	private String title;
	private String content;
	private String writedate;
	private String write_id;
	public int getArticle_no() {
		return article_no;
	}
	public void setArticle_no(int article_no) {
		this.article_no = article_no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWritedate() {
		return writedate;
	}
	public void setWritedate(String writedate) {
		this.writedate = writedate;
	}
	public String getWrite_id() {
		return write_id;
	}
	public void setWrite_id(String write_id) {
		this.write_id = write_id;
	}
	
	
	
	
}
