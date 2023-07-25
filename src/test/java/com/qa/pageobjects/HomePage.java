package com.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	private WebDriver driver;
	protected WebDriverWait wait;

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='center-box']/img")
	private static WebElement menuBar;
	
	public void clickMenuBar() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(menuBar)).click();
	}
	
	@FindBy(xpath = "//div[text()='How To Play']")
	private static WebElement howToPlay;
	
	public void clickHowToPlay() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(howToPlay)).click();
	}
	
	@FindBy(xpath = "//div[text()='Testimonials']")
	private static WebElement testimonials;
	
	public void clickTestimonials() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(testimonials)).click();
	}
	
	@FindBy(xpath = "//a[text()='Download FLOC']")
	private static WebElement downloadFlocUnderMenu;
	
	public void clickDownloadFlocUnderMenu() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(downloadFlocUnderMenu)).click();
	}
	
	public WebElement[] elements= {howToPlay,testimonials};
	
	@FindBy(xpath = "//div[text()='Download FLOC']")
	private static WebElement bottomDownLoadFloc;
	
	public void clickBottomDownLoadFloc() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(bottomDownLoadFloc)).click();
	}	
	
	@FindBy(xpath = "//a[text()='Privacy Policies']")
	private static WebElement privacyPolicies;
	
	public void clickPrivacyPolicies() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(privacyPolicies)).click();
	}	
	
	@FindBy(xpath = "//a[text()='Terms & Conditions']")
	private static WebElement termsAndConditions;
	
	public void clickTermsAndConditions() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(termsAndConditions)).click();
	}	
	
	@FindBy(xpath = "//a[text()='About Us']")
	private static WebElement aboutUs;
	
	public void clickAboutUs() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(aboutUs)).click();
	}	
	
	@FindBy(xpath = "//a[text()='Contact Us']")
	private static WebElement contactUs;
	
	public void clickContactUs() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(contactUs)).click();
	}	
	
	@FindBy(xpath = "//div[@class='footer-social-block-two']/a/img")
	private static WebElement linkedIn;
	
	public void clickLinkedIn() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(linkedIn)).click();
	}	
	
	@FindBy(xpath = "//a[@aria-current='page']/img")
	private static WebElement flocIcon;
	
	public void clickFlocIcon() {
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(flocIcon)).click();
	}	
}
