package com.producao.javablog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

	@RequestMapping("/index")
	public String index(){
		return "/WEB-INF/jsp/index.jsp";
	}
	
}
