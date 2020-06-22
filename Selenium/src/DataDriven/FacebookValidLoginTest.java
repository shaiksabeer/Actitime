package DataDriven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookValidLoginTest implements AutoConsts {
	public static void main(String[] args) throws Throwable, Throwable {
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String expectedLogintitle = FileLib.getCellData("./data/input.xlsx", "Valid", 1, 2);
		String actualtitle = driver.getTitle();
		//System.out.println(actualtitle);
		if(actualtitle.equals(expectedLogintitle))
		{
			System.out.println("test case is passed");
		}
		else
		{
			System.out.println("test case is failed");
		}
		
	}

}
