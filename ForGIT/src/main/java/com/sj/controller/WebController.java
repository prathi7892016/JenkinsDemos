package com.sj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@GetMapping("/hello")
public String sayHello() {
	return "Hello world";
}
	//by another developer
	@GetMapping("/hi)
public String sayHello(){
	return "H.. world;
}
