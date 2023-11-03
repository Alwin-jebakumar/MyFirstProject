package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.testrunner.Test_Runner;

import com.baseclass.BaseClass;
import com.helper.Data_Reader;
import com.helper.Data_Reader_Manager;
import com.pageobjectmanager.Page_Object_Manager;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass{
	
	public static WebDriver driver = Test_Runner.driver;
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("^user Launch The Url$")
	public void user_Launch_The_Url() throws Throwable {
		
		String propUrl = Data_Reader_Manager.getInstanceDRM().getInstanceDR().getPropUrl();
		
	    urlLaunch(propUrl);
	    
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		
	    inputValueOnElement(pom.getInstanceLP().getUsername(), 
	    		
	    		Data_Reader_Manager.getInstanceDRM().getInstanceDR().getPropUsername());
	    
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		
	    inputValueOnElement(pom.getInstanceLP().getPassword(), 
	    		
	    		Data_Reader_Manager.getInstanceDRM().getInstanceDR().getPropPassword());
	    
	}

	@Then("^user Click On The Login Button And It Navigate To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigate_To_The_Search_Hotel_Page() throws Throwable {
		
	    clickOnElement(pom.getInstanceLP().getLoginButton());
	    
	}
	
	

	

}
