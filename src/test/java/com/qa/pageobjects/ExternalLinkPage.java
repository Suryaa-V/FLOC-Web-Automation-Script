package com.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExternalLinkPage {
	
	private WebDriver driver;

	public ExternalLinkPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Privacy Policies']")
	private static WebElement privacyPolicies;
	
	public WebElement clickPrivacyPolicies() {
		return privacyPolicies;
	}	
	
	@FindBy(xpath = "//a[text()='Terms & Conditions']")
	private static WebElement termsAndConditions;
	
	public WebElement clickTermsAndConditions() {
		return termsAndConditions;
	}	
	
	@FindBy(xpath = "//a[text()='About Us']")
	private static WebElement aboutUs;
	
	public WebElement clickAboutUs() {
		return aboutUs;
	}	
	
	@FindBy(xpath = "//a[text()='Contact Us']")
	private static WebElement contactUs;
	
	public WebElement clickContactUs() {
		return contactUs;
	}	
	
	@FindBy(xpath = "//div[@class='footer-social-block-two']/a/img")
	private static WebElement linkedIn;
	
	public WebElement clickLinkedIn() {
		return linkedIn;
	}
	
	public WebElement [] elements = {privacyPolicies,termsAndConditions,aboutUs,contactUs,linkedIn};
}
