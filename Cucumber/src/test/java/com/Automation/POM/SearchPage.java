package com.Automation.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement Location;
	
	@FindBy(id="hotels")
	private WebElement Hotels;
	
	@FindBy(id="room_type")
	private WebElement RoomType;
	
	@FindBy(id="room_nos")
	private WebElement RoomNumber;
	
	@FindBy(id="adult_room")
	private WebElement Adultroom;
	
	@FindBy(id="Submit")
	private WebElement Search;

	public SearchPage(WebDriver Sdriver) {
		this.driver=Sdriver;
		PageFactory.initElements(Sdriver, this);
	}
	public WebElement getLocation() {
		return Location;
	}
	public WebElement getHotel() {
		return Hotels;
	}
	public WebElement getRoomType() {
		return RoomType;
	}
	public WebElement getRoomNumber() {
		return RoomNumber;
	}
	public WebElement getAdultRoom() {
		return Adultroom;
	}
	
}