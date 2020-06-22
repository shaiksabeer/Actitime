package com.sunwing.qa.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test4 implements IAutoConstant{
	static WebDriver driver;
	@Test
	public static void main() throws Throwable {
		FileInputStream fis = new FileInputStream(CONFIG_PATH);
		Properties prop = new Properties();
		prop.load(fis);
		String browser = prop.getProperty("br");
		System.out.println(prop.getProperty("key"));
		if(browser.equals("chrome"))
		{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		
		 driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		Test3 test =  new Test3(driver);
		test.setustb(prop.getProperty("username"));
		test.setpwtb(prop.getProperty("password"));
		test.setloginbutton();
	
		}
		else 
			System.out.println("enter valid browser");
	}
	//Test3 test =  new Test3(driver);
	

	
}
