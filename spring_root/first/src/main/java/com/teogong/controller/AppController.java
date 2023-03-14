package com.teogong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		String hello = "Hello Boot!";
		System.out.println(hello);
		return hello;
	}
	
	@RequestMapping("/intro")
	public String hello(Model model) {
		model.addAttribute("message","hello.jsp 입니다.");
		return "hello";
	}
}