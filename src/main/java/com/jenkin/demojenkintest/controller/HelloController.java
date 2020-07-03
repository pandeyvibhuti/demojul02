package com.jenkin.demojenkintest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("hello")
	public String testhello() {
		System.out.println("HelloWorld");
		return "success";
	}
}
