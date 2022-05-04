package com.acation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {
	public WebDriver driver;

	@FindBy(id = "location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	public Pom2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "hotels")
	private WebElement hotel;

	public WebElement getHotel() {
		return hotel;
	}

	@FindBy(id = "room_type")
	private WebElement room;

	public WebElement getRoom() {
		return room;
	}

	@FindBy(id = "datepick_in")
	private WebElement cheakin;

	public WebElement getcheakin() {
		return cheakin;
	}

	@FindBy(id = "datepick_out")
	private WebElement cheakout;

	public WebElement getcheakout() {
		return cheakout;
	}

	@FindBy(id = "adult_room")
	private WebElement adultno;

	public WebElement getadultno() {
		return adultno;
	}

	@FindBy(id = "child_room")
	private WebElement childroom;

	public WebElement getchildRoom() {
		return childroom;
	}

	@FindBy(id = "room_nos")
	private WebElement room_nos;

	public WebElement getRoom_nos() {
		return room_nos;
	}

	@FindBy(id = "Submit")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}

}
