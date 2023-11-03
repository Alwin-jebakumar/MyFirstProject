package com.adactin.testrunner;

import org.junit.AfterClass;

import org.junit.BeforeClass;

import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src//test//java//com//adactin//featurefile",
glue = "com.adactin.stepdefinition",
monochrome = false,
dryRun = false,
strict = false,
plugin = {"html:HtmlReport/Adactin_login",
		"pretty",
		"json:JsonReport/Demo.json",
		"com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/Adactin_login.html"
		})

public class Test_Runner extends BaseClass{
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() {

		driver = browserLaunch("chrome");
		
	}
	
	@AfterClass
	public static void tear_Down() {

		quitBrowser();
		
	}

}
