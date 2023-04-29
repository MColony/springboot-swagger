package com.javainuse.swagger.service.impl;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.javainuse.swagger.model.SchoolInfo;
import com.javainuse.swagger.service.SchoolInfoService;

@Service
public class SchoolInfoServiceImpl implements SchoolInfoService{

	@Override
	public SchoolInfo getSchoolDetais() {
		
		SchoolInfo schoolInfo = new SchoolInfo();
		schoolInfo.setId(189);
		schoolInfo.setSchoolName("Vagdevi");
		
		SchoolInfo schoolInfo2 = new SchoolInfo();
		schoolInfo2.setId(188);
		schoolInfo2.setSchoolName("Sarsvathi");
		
		SchoolInfo schoolInfo3 = new SchoolInfo();
		schoolInfo3.setId(190);
		schoolInfo3.setSchoolName("Vidya");
		
		
		List<SchoolInfo> list = new ArrayList();
		list.add(schoolInfo);
		list.add(schoolInfo2);
		list.add(schoolInfo3);
		
		
		//java 8 features
		List<SchoolInfo> filteredList = list.stream().filter(schoolInfo1 -> schoolInfo1.getId() > 189).collect(Collectors.toList());
		
		
		return schoolInfo;
		
	}

	
	
	
}


