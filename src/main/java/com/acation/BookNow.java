package com.acation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookNow {
public WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement name;

	public WebElement getname() {
		return name;
	}
	public BookNow(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="last_name")
	private WebElement lastname;

	public WebElement getlastname() {
		return lastname;
	}
	@FindBy(id="address")
	private WebElement address;

	public WebElement getaddress() {
		return address;
	}
	
	@FindBy(id="cc_num")
	private WebElement cc;

	public WebElement getcc() {
		return cc;
	}
	@FindBy(id="cc_type")
	private WebElement cc_type;

	public WebElement getcc_type() {
		return cc_type;
	}
	
	@FindBy(id="cc_exp_month")
	private WebElement month;

	public WebElement getmonth() {
		return month;
	}
	@FindBy(id="cc_exp_year")
	private WebElement year;

	public WebElement getyear() {
		return year;
	}
	@FindBy(id="cc_cvv")
	private WebElement cc_cvv;

	public WebElement getcc_cvv() {
		return cc_cvv;
	}
	@FindBy(id="book_now")
	private WebElement book;

	public WebElement getbook() {
		return book;
	}

}
