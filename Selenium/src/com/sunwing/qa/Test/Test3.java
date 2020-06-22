package com.sunwing.qa.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test3 {
	@FindBy(id = "email")
	WebElement ustb;
	@FindBy(id = "pass" )
	WebElement pwtb;
	
	
	@FindBy(xpath = "//*[@value = 'Log In']" )
	WebElement loginbutton;
	Test3(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
		}
	public void setustb(String un)
	{
		ustb.sendKeys(un);
	}
	public void setpwtb(String pwd)
	{
		pwtb.sendKeys(pwd);
	}
	public void setloginbutton()
	{
		loginbutton.click();
	}
	}
