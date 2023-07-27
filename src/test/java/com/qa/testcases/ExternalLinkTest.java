package com.qa.testcases;

import java.io.FileNotFoundException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.commonfunctions.BaseClass;
import com.qa.commonfunctions.CommonActions;
import com.qa.pageobjects.ExternalLinkPage;

public class ExternalLinkTest extends BaseClass{

	@Test(priority = 1)
	public void privacyPolicies() throws FileNotFoundException, InterruptedException {
		comActs= new CommonActions();
		externalPage= new ExternalLinkPage(driver);
		


		comActs.launchFloc();
		comActs.scrollDown();
		Thread.sleep(3000);
		int element = externalPage.elements.length;

		for(int i=0;i<element;i++) {
			externalPage= new ExternalLinkPage(driver);
			PageFactory.initElements(driver,ExternalLinkPage.class );
			externalPage.elements[i].click();
			Thread.sleep(3000);
			driver.navigate().back();
		}


	}



}
