package com.javainuse.swagger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/javause")
	public String sayHi() {
		return "Swagger Hi";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/getManpower")
	public String getManpower(@RequestParam int id) {
		System.out.println("id>>>>>>> " + id);
		return "get manpower";
	}
	
	
	
	
	
	
	
	
	

}
