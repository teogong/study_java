package com.teogong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String hello(Model model, @RequestParam(value="name",required = false)String name) {
		// model 사용자 뷰 쪽으로 넘낄때 받음녀됨, @RequestParam name 받아서 String name 전달하면됨, required = false name이 올수도 있고 올수도 있다.
			
			model.addAttribute("greeting","안녀하세요 "+name);
			// 붙인값을 넣음 
			
			return "hello";
			// hello는 뷰 이름 hello.jsp를 보내겠다.
	}
}


