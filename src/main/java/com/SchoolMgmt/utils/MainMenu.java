package com.SchoolMgmt.utils;

public enum MainMenu {
	DASHBOARD("Dashboard"),
	GENERALMAINTAIN("General Maintain"),
	FEEUNITS("Fee Units"),
	MAPPINGS("Mappings");
	
	private final String menu;

	MainMenu(String menu) 
	{
		this.menu = menu;
	}
	
	public String getMainMenu() 
	{
		return this.menu;
	}
	
}
