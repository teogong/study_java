package com.teogong.test01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/input")
public class inputServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String user_id=req.getParameter("user_id");
		String user_pw=req.getParameter("user_pw"); 
		System.out.println("아이디:"+user_id);
		System.out.println("비밀번호:"+user_pw);
		String[] subject=req.getParameterValues("subject"); 
		for(String str:subject){
			System.out.println("선택한 과목:"+str);
		}
	}

	

}
