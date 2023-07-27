package com.qa.commonfunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

public class CommonActions extends BaseClass{

	//THIS METHOD WILL FETCH THE DATA
	public String fetechData(String pathName) throws FileNotFoundException {
		FileInputStream fis= new FileInputStream("config.properties");
		prop= new Properties();
		try {
			prop.load(fis);
		} catch (IOException excep) {
			excep.printStackTrace();
		}
		return prop.getProperty(pathName);
	}

	//THIS IS USED TO SET SCREEN RESOLUTION
	public Dimension setScreenResolution(int width, int height) {
		size = new Dimension(width, height);
		return size;
	}
	
	//THIS WILL OPEN FLOC
	public void launchFloc() throws FileNotFoundException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().setSize(setScreenResolution(400,850));
		String url= fetechData("flocUrl");

		driver.get(url);
		System.out.println("Floc Website Launced..!!");
	}
	
	
	//THIS WILL SCROLL DOWN
	public void scrollDown() {
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

}
