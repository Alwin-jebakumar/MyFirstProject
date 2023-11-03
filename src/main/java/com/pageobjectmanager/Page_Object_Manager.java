package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.Login_Page;

public class Page_Object_Manager {

	static WebDriver driver;

	private Login_Page lp; 						// Class Variable -- null

	public Login_Page getInstanceLP() {

		if (lp == null) {

			lp = new Login_Page(driver); 		// Memory Allocate

		}

		return lp; 								// Return the Login_Page Memory

	}

	public Page_Object_Manager(WebDriver abc) {

		this.driver = abc;

	}

}
