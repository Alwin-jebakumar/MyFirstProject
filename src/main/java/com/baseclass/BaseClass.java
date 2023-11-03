package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	static WebDriver driver; // Null

	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();

		return driver;

	}

	public static void urlLaunch(String url) {

		driver.get(url);

	}

	public static void inputValueOnElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void clickOnElement(WebElement element) {

		element.click();

	}

	public static void selectValueFromDropDown(WebElement element, String option, String value) {

		Select sc = new Select(element);

		if (option.equalsIgnoreCase("index")) {

			int indexValue = Integer.parseInt(value);

			sc.selectByIndex(indexValue);

		}

		else if (option.equalsIgnoreCase("value")) {

			sc.selectByValue(value);

		}

		else if (option.equalsIgnoreCase("text")) {
			sc.selectByVisibleText(value);

		}

	}

	public static void implicitWait(String option, long duration) {

		if (option.equalsIgnoreCase("Seconds")) {

			driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
		}

	}
	
	public static void quitBrowser() {

		driver.quit();
		
	}

}
