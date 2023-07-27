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

		comActs= new CommonActions();

		comActs.launchFloc();

		comActs.scrollDown();
	}

}
