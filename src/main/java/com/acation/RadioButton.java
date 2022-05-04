package com.acation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButton {
	public WebDriver driver;
	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public RadioButton(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "continue")
	private WebElement click;

	public WebElement getClick() {
		return click;
	}

}
