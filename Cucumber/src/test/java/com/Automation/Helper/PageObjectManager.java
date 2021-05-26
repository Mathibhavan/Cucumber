package com.Automation.Helper;

import org.openqa.selenium.WebDriver;

import com.Automation.POM.BookingPage;
import com.Automation.POM.LoginPage;
import com.Automation.POM.SearchPage;
import com.Automation.POM.SelectPage;

public class PageObjectManager {

	public static WebDriver driver;
	
	private LoginPage lp;
	private SearchPage s;
	private SelectPage sl;
	private BookingPage bp;
	 
	public PageObjectManager(WebDriver pdriver) {
		this.driver=pdriver;
	}
	public LoginPage getLP() {
		lp = new LoginPage(driver);
		return lp;
	}
	public SearchPage getS() {
		s=new SearchPage(driver);
		return s;
	}
	public SelectPage getSl() {
		sl=new SelectPage(driver);
		return sl;
	}
	public BookingPage getBp() {
		bp=new BookingPage(driver);
		return bp;
	}
}
