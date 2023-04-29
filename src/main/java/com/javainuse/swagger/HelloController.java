package com.javainuse.swagger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	public String sayHello() {
		return "Swagger Hello World";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/getEmployee")
	public String getEmployee(@RequestParam int id) {
		System.out.println("id>>>>>>> " + id);
		return "get employee";
	}
	
}
