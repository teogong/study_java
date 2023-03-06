package com.teogong.test01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Second doGet 메서드 ");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Second destory 메서드 ");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Second init 메서드 ");
	}

	
// wed.xml에 아래코드 작성하기 
//  <servlet>
//  	<servlet-name>bbb</servlet-name>
//  	<servlet-class>com.teogong.test01.SecondServlet</servlet-class>
//  </servlet>
//  <servlet-mapping>
//  	<servlet-name>bbb</servlet-name>
//  	<url-pattern>/second</url-pattern>
//  </servlet-mapping>

}
