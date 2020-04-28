package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void dolaunchBrowser() {
		
   System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Driver\\chrome_driver_version81\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		
		System.out.println("title is :"+title);
		
		driver.quit();
		
		
		
	}

}
