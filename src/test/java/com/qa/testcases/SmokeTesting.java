package com.qa.testcases;

import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.qa.commonfunctions.BaseClass;
import com.qa.commonfunctions.CommonActions;
import com.qa.pageobjects.HomePage;

public class SmokeTesting extends BaseClass{

	//FULL SCROLL OF THE SITE
	@Test(priority = 1)
	public void smokeTest() throws InterruptedException, FileNotFoundException {

		prop= new Properties();

		comActs= new CommonActions();

		driver.manage().window().setSize(comActs.setScreenResolution(400,850));
		String url= comActs.fetechData("flocUrl");

		driver.get(url);
		System.out.println("Floc Website Launced..!!");

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		long totalScrollHeight = (Long) js.executeScript(""
				+ "return Math.max( document.body.scrollHeight, "
				+ "document.body.offsetHeight, "
				+ "document.documentElement.clientHeight, "
				+ "document.documentElement.scrollHeight, "
				+ "document.documentElement.offsetHeight );");
		int scrollStep = 50;
		int scrollInterval = 10;

		for (int i = 0; i < totalScrollHeight; i += scrollStep) {
			js.executeScript("window.scrollBy(0, " + scrollStep + ");");
			try {
				Thread.sleep(scrollInterval);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	//FLOC LINKED-IN OPENED
	@Test(priority = 2)
	public void openLinkedIn() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homepage = new HomePage(driver);

		homepage.clickLinkedIn();
		System.out.println("PASS..!!");
	}

}
