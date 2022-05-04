package com.adactin.runnerclass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Baseclass.Baseclass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "\\src\\test\\java\\com\\feature",
                 glue = "com.adactin.stepdefinition")
public class Runner_Class {

	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {
		driver = Baseclass.broswerLanuch("chrome");

	}

	@AfterClass
	public static void tear_Down() {
	Baseclass.driverquit();
	}
}
