package com.qa.commonfunctions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.pageobjects.HomePage;
import com.qa.testcases.HomePageTest;

public class BaseClass {

	//IN-BUILT CLASSES
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected Properties prop;
	protected Dimension size;

	//PAGE OBJECTS
	protected CommonActions comActs;
	protected HomePage homepage;

	//TEST CLASSES
	protected HomePageTest homePT;


	@BeforeClass
	public void setUp() throws IOException {
		comActs = new CommonActions();
		initializeDriver("Chrome");
		System.out.println("Browser Launched..!!");
	}

	private void initializeDriver(String browser) throws IOException {

		System.setProperty(comActs.fetechData("chrome"), comActs.fetechData("chromePath"));

		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			driver = new ChromeDriver(options);
		} else if (browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			driver = new FirefoxDriver(options);
		} else {
			throw new IllegalArgumentException("Invalid browser");
		}
	}


	@AfterClass public void tearDown() { 
		if (driver != null) { 
			driver.quit(); 
		} 
	}

}
