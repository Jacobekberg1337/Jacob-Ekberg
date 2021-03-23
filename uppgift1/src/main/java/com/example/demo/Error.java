package com.example.demo;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Error implements ErrorController{

	@RequestMapping("/error")
	@ResponseBody
	public String error() {		
		return "Error, not a valid request!";
				
	}
	
	@Override
	public String getErrorPath() {
	    return "/error";
	}
	
}