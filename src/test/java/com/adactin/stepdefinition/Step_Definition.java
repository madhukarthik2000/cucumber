package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.Baseclass.Baseclass;
import com.adactin.runnerclass.Runner_Class;
import com.propertyfile.File_Reader_Manager;
import Page_Object_Manager.POM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Baseclass  {
public static WebDriver driver = Runner_Class.driver;
	public static POM p=new POM(driver);
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
	 String url = File_Reader_Manager.getInstanceFRM().grtInstanceCR().get_url();
	 geturl(url);
		
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
	  selectbyvalue(p.getInstanceDriver().getUsername(),"karthikmadhu11");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
	  sendvalues(p.getInstanceDriver().getPassword(), "karthik2000m");
	}

	@Then("^user Click On Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	   clickmethod(p.getInstanceDriver().getLog());
	}

	@When("^user Select The Hotel Location$")
	public void user_Select_The_Hotel_Location() throws Throwable {
	  selectbyindex(p.getInstanceP().getLocation(), 1); 
	}

	@When("^user Select The Hotel Hotels$")
	public void user_Select_The_Hotel_Hotels() throws Throwable {
	  selectbyindex(p.getInstanceP().getHotel(), 1); 
	}

	@When("^user Select The Hotel RoomType$")
	public void user_Select_The_Hotel_RoomType() throws Throwable {
	  selectbyindex(p.getInstanceP().getRoom(), 1);
	}

	@When("^user Select The Hotel Number of Rooms$")
	public void user_Select_The_Hotel_Number_of_Rooms() throws Throwable {
	 selectbyindex(p.getInstanceP().getRoom_nos(), 1);  
	}

	@When("^user Enter The Hotel Check in Date$")
	public void user_Enter_The_Hotel_Check_in_Date() throws Throwable {
	 sendvalues(p.getInstanceP().getcheakin(), "01/02/2022");  
	}

	@When("^user Enter The Hotel Check out Date$")
	public void user_Enter_The_Hotel_Check_out_Date() throws Throwable {
	 sendvalues(p.getInstanceP().getcheakout(),"01/12/2022"); 
	}

	@When("^user Select The Hotel Adults per Room$")
	public void user_Select_The_Hotel_Adults_per_Room() throws Throwable {
	 selectbyindex(p.getInstanceP().getadultno(), 1);
	}

	@When("^user Select The Hotl Children per Room$")
	public void user_Select_The_Hotl_Children_per_Room() throws Throwable {
	  selectbyindex(p.getInstanceP().getchildRoom(), 1);
	}

	@Then("^user Click On Search Button And It Navigates To The Select Hotel Page$")
	public void user_Click_On_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
	   clickmethod(p.getInstanceP().getSubmit());
	}

	@When("^user Click On The Radio Button$")
	public void user_Click_On_The_Radio_Button() throws Throwable {
	  clickmethod(p.getInstanceL().getRadiobutton());
	}

	@Then("^user Click On Continue Button And It Navigates To The Book A Hotel$")
	public void user_Click_On_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel() throws Throwable {
	clickmethod(p.getInstanceL().getClick());
	}

	@When("^user Enter The Book A Hotel First Name$")
	public void user_Enter_The_Book_A_Hotel_First_Name() throws Throwable {
	selectbyvalue(p.getInstanceB().getname(), "karthik");
	}

	@When("^user Enter The Book A Hotel Last Name$")
	public void user_Enter_The_Book_A_Hotel_Last_Name() throws Throwable {
	 sendvalues(p.getInstanceB().getlastname(), "madhu");
	}

	@When("^user Enter The Book A Hotel Billing Address$")
	public void user_Enter_The_Book_A_Hotel_Billing_Address() throws Throwable {
	  sendvalues(p.getInstanceB().getaddress(), "ABCDEF"); 
	}

	@When("^user Enter The Book A Hotel Credit Card No$")
	public void user_Enter_The_Book_A_Hotel_Credit_Card_No() throws Throwable {
	 sendvalues(p.getInstanceB().getcc(), "123654789987456"); 
	}

	@When("^user Select The Book A Hotel Credit Card Type$")
	public void user_Select_The_Book_A_Hotel_Credit_Card_Type() throws Throwable {
	 selectbyindex(p.getInstanceB().getcc_type(), 1); 
	}

	@When("^user Select The Book A Hotel Expiry Month$")
	public void user_Select_The_Book_A_Hotel_Expiry_Month() throws Throwable {
	 selectbyindex(p.getInstanceB().getmonth(), 1);
	}

	@When("^user Select The Book A Hotel Expiry Year$")
	public void user_Select_The_Book_A_Hotel_Expiry_Year() throws Throwable {
	 selectbyindex(p.getInstanceB().getyear(), 12);   
	}

	@When("^user Enter The Book A Hotel CVV Number$")
	public void user_Enter_The_Book_A_Hotel_CVV_Number() throws Throwable {
	   sendvalues(p.getInstanceB().getcc_cvv(), "123");
	}

	@Then("^user Click On Book Now Button And It Navigates To The Booking Confirmation$")
	public void user_Click_On_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation() throws Throwable {
	  clickmethod(p.getInstanceB().getbook());
	}

	@When("^user Click On Logout Button$")
	public void user_Click_On_Logout_Button() throws Throwable {
	 clickmethod(p.getInstanceF().getfinalsteps());  
	}


	
	

}
