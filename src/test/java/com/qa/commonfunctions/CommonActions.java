package com.qa.commonfunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Dimension;

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

}
