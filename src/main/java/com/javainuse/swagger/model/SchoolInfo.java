package com.javainuse.swagger.model;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SchoolInfo {
	
private int id;
private String schoolName;

//private Address address;
//private List<Students> students;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSchoolName() {
	return schoolName;
}
public void setSchoolName(String schoolName) {
	this.schoolName = schoolName;
}


	



}






