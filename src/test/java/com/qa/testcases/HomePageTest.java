package com.qa.testcases;

import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.qa.commonfunctions.BaseClass;
import com.qa.commonfunctions.CommonActions;
import com.qa.pageobjects.HomePage;

public class HomePageTest extends BaseClass{

	//LAUNCHING FLOC URL
	@Test(priority = 1)
	public void launchFloc() throws FileNotFoundException {
		comActs= new CommonActions();
		comActs.launchFloc();
	}

	//MENU OPTION TESTS
	@Test(priority = 2) 
	public void menuTest() throws InterruptedException {
		homepage= new HomePage(driver); 
		homepage.clickMenuBar(); 
		Thread.sleep(1500);
		for(int i=0;i<2;i++) { 
			homepage= new HomePage(driver);
			homepage.elements[i].click(); 
			Thread.sleep(2000); if (i<1) {
				homepage.clickMenuBar(); 
				Thread.sleep(2000); 
			} 
		} 
	}

	//FLOC DOWNLOADIG TEST
	@Test(priority = 3) 
	public void downloadAppTest() throws InterruptedException { 
		homepage= new HomePage(driver); 
		homepage.clickMenuBar();
		Thread.sleep(1500); 
		homepage.clickDownloadFlocUnderMenu();
		System.out.println("Download FLOC First button is started Downloading..!!");
		Thread.sleep(2000); 
		homepage.clickBottomDownLoadFloc();
		System.out.println("Download FLOC Seconf button is started Downloading..!!");
	}

}
