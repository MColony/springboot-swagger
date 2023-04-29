package com.javainuse.swagger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.swagger.model.SchoolInfo;
import com.javainuse.swagger.service.SchoolInfoService;

@RestController
@RequestMapping("/api")
public class SchoolInfoController {
	

	private String GET_SCHOOL_INFO = "/getSchoolInfo";
	
	@Autowired
	SchoolInfoService schoolInfoService;
	
	
	@GetMapping("/getSchoolInfo")
	public SchoolInfo getSchoolInfo() {
		
	 return schoolInfoService.getSchoolDetais() ;
		
	}

}
