package com.SchoolMgmt.utils;

public enum SubMenu {
	SCHOOLSESSION("School Session"),
	BRANCH("Branch"),
	TEACHER("Teacher"),
	STUDENT("Student"),
	PARENT("Parent"),
	USER("User"),
	STUDENTCLASSMAP("Student Class Map"),
	TEACHERSUBJECTMAP("Teacher Subject Map"),
	CLASSSECTIONMAP("Class Section Map"),
	TEACHERCLASSSECTIONMAP("Teacher Class Section Map"),
	TEACHERSUBJECTCLASSMAP("Teacher Subject Class Map"),
	LECTURETIMEMAP("Lecture Time Map"),
	TIMETABLE("Time Table"),
	SUBJECTSYLLABUS("Subject Syllabus"),
	FEEHEAD("Fee Head"),
	FEETEMPLATE("Fee Template"),
	FEECLASSTEMPLATE("Fee Class Template"),
	FEECOLLECTION("Fee Collection");
	
	private final String subMenu;

	SubMenu(String subMenu) 
	{
		this.subMenu = subMenu;
	}
	
	public String getSubMenu() 
	{
		return this.subMenu;
	}
	
}
