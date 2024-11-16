package com.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/sender")
public class HelloController {
	
	@GetMapping(value = "/sayHello")
	public String sayHello() {
		return "Hello World";
	}
	
		
}
