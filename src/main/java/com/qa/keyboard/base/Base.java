package com.qa.keyboard.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	public Properties prop;

	public WebDriver init_driver(String browserName) {
	if(browserName.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\punit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	return driver;
	}

	public Properties init_properties() throws FileNotFoundException {
	prop = new Properties();
	try {
	prop = new Properties();
	FileInputStream ip = new FileInputStream("C:\\Users\\punit\\eclipse-workspace\\keyboarddriven\\src\\main\\java\\com\\qa\\keyboard\\config\\configproperties");
	prop.load(ip);
	} catch (FileNotFoundException e) {
	e.printStackTrace();
	} catch (IOException e) {
	e.printStackTrace();
	}
	return prop;
	}

}
