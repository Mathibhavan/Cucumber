package com.Automation.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {

	public static WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement Fname;
	
	@FindBy(id="last_name")
	private WebElement Lname;
	
	@FindBy(id="address")
	private WebElement Addresss;
	
	@FindBy(id="cc_num")
	private WebElement CardNum;
	
	@FindBy(id="cc_type")
	private WebElement CardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement CVVNum;
	
	@FindBy(id="book_now")
	private WebElement Book;
	
	public BookingPage(WebDriver bdriver) {
		this.driver=bdriver;
		PageFactory.initElements(bdriver, this);
	}
	public WebElement getFirstname() {
		return Fname;
		}
	public WebElement getLastname() {
		return Lname;
		}
	public WebElement getAddress() {
		return Addresss;
		}
	public WebElement getCardnum() {
		return CardNum;
		}
	public WebElement getExpmonth() {
		return ExpMonth;
		}
	public WebElement getExpyear() {
		return ExpYear;
		}
	public WebElement getCardtype() {
		return CardType;
		}
	public WebElement getCVV() {
		return CVVNum;
		}
}
