package com.sunwing.qa.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public static void main() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
	String windowHandle = driver.getWindowHandle();
		WebDriver window = driver.switchTo().window(windowHandle);
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		int size = allWindowHandles.size();
		System.out.println(size);
		for (String windowHandles : allWindowHandles) {
			 driver.switchTo().window(windowHandle);
			String title = driver.getTitle();

			System.out.println(title);
			if(!windowHandles.equals(windowHandle))
			{
				driver.close();
			}
			
			
		}
		
		//using size(), get the count of total number of browser windows
		/*Set<String> allWindowHandles = driver.getWindowHandles();
				int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : "+ count);
				for (String windowHandle : allWindowHandles) {
					//switch to each browser window
					driver.switchTo().window(windowHandle);
					String title = driver.getTitle();
					//print the window handle id of each browser window
		System.out.println("Window handle id of page -->"+ title +" -->  is : "+windowHandle);
		//close all the browsers one by one
		driver.close();
				}*/
	}

}
