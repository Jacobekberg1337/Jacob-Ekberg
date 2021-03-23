package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Nummer {
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(String numbers[]) {
		return Matte.calcutale(numbers, "add");
	}
	
	@RequestMapping(value = "/sub", method = RequestMethod.GET)
	public String subtract(String numbers[]) {
		return Matte.calcutale(numbers, "sub");
	}

	@RequestMapping(value = "/multi", method = RequestMethod.GET)
	public String multiply(String numbers[]) {
		return Matte.calcutale(numbers, "multi");
	}
	
	@RequestMapping(value = "/div", method = RequestMethod.GET)
	public String divide(String numbers[]) {
		return Matte.calcutale(numbers, "div");
	}
}