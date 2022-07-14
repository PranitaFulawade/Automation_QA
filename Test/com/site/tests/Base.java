package com.site.tests;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

	public WebDriver driver;

	@Before
	public void beforeTest() {
		Properties prop = new Properties();
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		FileReader file;
		try {
			file = new FileReader("E:\\SeleniumProject\\Automaion_QA\\resources\\config.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver", prop.getProperty("path"));
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("website"));
	}
	@After
	public void afterTest()
	{
		driver.quit();
	}

}
