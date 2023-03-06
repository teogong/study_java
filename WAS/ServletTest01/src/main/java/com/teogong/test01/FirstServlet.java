package com.teogong.test01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
// 객
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet 메서드 ");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destory 메서드 ");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init 메서드 ");
	}

}
//web.xml에 
//<servlet>
//	<servlet-name>aaa</servlet-name>
//	<servlet-class>com.teogong.test01.FirstServlet</servlet-class>
//</servlet>
//<servlet-mapping>
//	<servlet-name>aaa</servlet-name>
//	<url-pattern>/first</url-pattern>
//</servlet-mapping>
// 이거 작성하기 