package com.SchoolMgmt.schoolPages;

import static com.SchoolMgmt.utils.Sleeper.sleep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.SchoolMgmt.utils.*;

public class MainPage 
{

	private  WebDriver driver;
	
	public MainPage(WebDriver driver) {
		this.driver = driver;

	}

	public void mainPageAfterLogin(String menuName) {
		Selector selector = new Selector(driver);
		Actions act = new Actions(driver);

		if (menuName.equals(menuDashBoard())) {
			act.click(selector.targetLinkText("Dashboard")).build().perform();

		} else {
			System.out.println("Menu not Found!");
		}
	}

	public void mainPageAfterLogin(String menuName, String subMenuName) {

		if (menuName.equals(menuGeneralMaintain())) {

			generalMaintain(subMenuName);
		}

		else if (menuName.equals(menuMappings())) {
			mappings(subMenuName);
		}

		else if (menuName.equals(menuFeeUnits())) {
			feeUnits(subMenuName); 
		}

		/*
		 * else if(menuName == "Events & Holiday") { WebElement event =
		 * menu.findElement(By.linkText("Events & Holiday")); event.click(); }
		 * 
		 * else if(menuName == "Attendance") { WebElement attndnce =
		 * menu.findElement(By.linkText("Attendance")); attndnce.click(); }
		 */

		else {
			System.out.println("Menu Not Found!");

		}

	}
	
	public void generalMaintain(String subMenu) {
		
		Selector selector = new Selector(driver);
		Actions act = new Actions(driver);
				
		act.moveToElement(selector.targetLinkText(menuGeneralMaintain())).perform();

		WebElement target = null;
		if (subMenu.equals(submenuSchSess())) {
			target = menuElement().findElement(By.linkText(submenuSchSess()));
		}
		else if (subMenu.equals(submenuBranch())) {
			target = menuElement().findElement(By.linkText(submenuBranch()));
		}
		else if (subMenu.equals(submenuTeacher())) {
			target = menuElement().findElement(By.linkText(submenuTeacher()));
		}

		else if (subMenu.equals(submenuStudent())) {
			target = menuElement().findElement(By.linkText(submenuStudent()));
		}
		else if (subMenu.equals(submenuParent())) {
			target = menuElement().findElement(By.linkText(submenuParent()));
		}
		else if (subMenu.equals(submenuUsr())) {
			target = menuElement().findElement(By.linkText(submenuUsr()));
		} else {
			System.out.println("Sub Menu for General Maintain not Found!");
		}
		act.click(target).perform();
		sleep();

	}
	
	public void mappings(String subMenuName) {
		Selector selector = new Selector(driver);
		Actions act = new Actions(driver);
		
		act.moveToElement(selector.targetLinkText(menuMappings())).perform();
		WebElement target = null;
		if (subMenuName.equals(submenuStdClassMap())) {
			target = menuElement().findElement(By.linkText(submenuStdClassMap()));
		}
		else if (subMenuName.equals(submenuTchrSbjMap())) {
			target = menuElement().findElement(By.linkText(submenuTchrSbjMap()));
		}
		else if (subMenuName.equals(submenuClassSecMap())) {
			target = menuElement().findElement(By.linkText(submenuClassSecMap()));
		}
		else if (subMenuName.equals(submenuTchrSubClassMap())) {
			target = menuElement().findElement(By.linkText(submenuTchrSubClassMap()));
		}
		else if (subMenuName.equals(submenuTchrClassSecMap())) {
			target = menuElement().findElement(By.linkText(submenuTchrClassSecMap()));
		}
		else if (subMenuName.equals(submenuLecTimeMap())) {
			target = menuElement().findElement(By.linkText(submenuLecTimeMap()));
		}
		else if (subMenuName.equals(submenuTimeTable())) {
			target = menuElement().findElement(By.linkText(submenuTimeTable()));
		}
		else if (subMenuName.equals(submenuSubSyllabus () )) {
			target = menuElement().findElement(By.linkText(submenuSubSyllabus () ));
		} else {
			System.out.println("Sub Menu for Mappings not Found!");
		}

		act.click(target).perform();
		sleep();
	}
	
	
	public void feeUnits(String subMenuName) {
		Selector selector = new Selector(driver);
		Actions act = new Actions(driver);
		
		act.moveToElement(selector.targetLinkText(menuFeeUnits())).perform();

		WebElement target = null;
		if (subMenuName.equals(submenuFeeHead())) {
			target = menuElement().findElement(By.linkText(submenuFeeHead()));
		} else if (subMenuName.equals(submenuFeeTempl())) {
			target = menuElement().findElement(By.linkText(submenuFeeTempl()));
		} else if (subMenuName.equals(submenuFeeClassTempl())) {
			target = menuElement().findElement(By.linkText(submenuFeeClassTempl()));
		} else if (subMenuName.equals(submenuFeeColl())) {
			target = menuElement().findElement(By.linkText(submenuFeeColl()));
		} else {
			System.out.println("Sub Menu for Fee Units not Found!");
		}
		act.click(target).perform();
		sleep();
		
	}
	

	//WbeElement to find the menubar.
	public WebElement menuElement() {
		return driver.findElement(By.id("Menu"));
	}

	//Dashboard Menu code starts here.
	public String menuDashBoard() {
		MainMenu ds = MainMenu.DASHBOARD;
		String menuDashboard = ds.getMainMenu();
		return menuDashboard;
	}
	
	//Main Menu and sub Menus code for "General Maintain" start from here.
	public String menuGeneralMaintain() {
		MainMenu gm = MainMenu.GENERALMAINTAIN;
		String menuGeneralMaintain = gm.getMainMenu();
		return menuGeneralMaintain;
	}
	
	public String submenuSchSess() {
		SubMenu ss = SubMenu.SCHOOLSESSION;
		String schSession = ss.getSubMenu();
		return schSession;
	}

	public String submenuBranch() {
		SubMenu br = SubMenu.BRANCH;
		String brnch = br.getSubMenu();
		return brnch;
	}
	
	public String submenuTeacher( ){
		SubMenu tc = SubMenu.TEACHER;
		String tchr = tc.getSubMenu();
		return tchr;
	}

	public String submenuStudent() {
		SubMenu std = SubMenu.STUDENT;
		String student = std.getSubMenu();
		return student;
	}
	
	public String submenuParent () {
		SubMenu pr = SubMenu.PARENT;
		String prnt = pr.getSubMenu();
		return prnt;
	}
	
	public String submenuUsr() {
		SubMenu usr = SubMenu.USER;
		String user = usr.getSubMenu();
		return user;
	}
	
	//Main Menu and Sub Menus code for "Mappings" start from here.
	public String menuMappings() {
		MainMenu mp = MainMenu.MAPPINGS;
		String menuMappings = mp.getMainMenu();
		return menuMappings;
	}
	
	public String submenuStdClassMap () {
		SubMenu stdClass = SubMenu.STUDENTCLASSMAP;
		String mapstdClass = stdClass.getSubMenu();
		return mapstdClass;
	}
	
	public String submenuTchrSbjMap() {
		SubMenu tchSub = SubMenu.TEACHERSUBJECTMAP;
		String mapstdTSub = tchSub.getSubMenu();
		return mapstdTSub;
	}
	
	public String submenuClassSecMap() {
		SubMenu classSec = SubMenu.CLASSSECTIONMAP;
		String mapstdClassSec = classSec.getSubMenu();
		return mapstdClassSec;
	}
	
	public String submenuTchrClassSecMap() {
		SubMenu tchclass = SubMenu.TEACHERCLASSSECTIONMAP;
		String mapTchrSec = tchclass.getSubMenu();
		return mapTchrSec;
	}
	
	public String submenuTchrSubClassMap() {
		SubMenu tchSubClass = SubMenu.TEACHERSUBJECTCLASSMAP;
		String mapTchrSubClss = tchSubClass.getSubMenu();
		return mapTchrSubClss;
		
	}
	
	public String submenuLecTimeMap() {
		SubMenu lTimeMap = SubMenu.LECTURETIMEMAP;
		String mapLctTime = lTimeMap.getSubMenu();
		return mapLctTime;
	}
	
	public String submenuTimeTable() {
		SubMenu tTble = SubMenu.TIMETABLE;
		String mapTimetable = tTble.getSubMenu();
		return mapTimetable;
	}
	
	public String submenuSubSyllabus () {
		SubMenu subSy = SubMenu.SUBJECTSYLLABUS;
		String mapSubSyl = subSy.getSubMenu();
		return mapSubSyl;	
	}
	
	//Main Menu and Sub Menus code for "Fee units" start from here.
	public String menuFeeUnits() {
		MainMenu fee = MainMenu.FEEUNITS;
		String menuFeeUnits = fee.getMainMenu();
		return menuFeeUnits;
	}
	
	public String submenuFeeHead() {
		SubMenu feeHead = SubMenu.FEEHEAD;
		String fHead = feeHead.getSubMenu();
		return fHead;
	}
	
	public String submenuFeeTempl() {
		SubMenu feeTmpl = SubMenu.FEETEMPLATE;
		String fTemplate = feeTmpl.getSubMenu();
		return fTemplate;
	}
	
	public String submenuFeeClassTempl() {
		SubMenu feeClass = SubMenu.FEECLASSTEMPLATE;
		String fClassTempl = feeClass.getSubMenu();
		return fClassTempl;
	}

	public String submenuFeeColl () {
		SubMenu feeColl = SubMenu.FEECOLLECTION;
		String fCollection = feeColl.getSubMenu();
		return fCollection;
	}
	
}







