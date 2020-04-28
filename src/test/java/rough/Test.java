package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {  
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Driver\\chrome_driver_version81\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
	
		driver.quit();
		
		
		
	
		
		// webdriver is an interface and chromedriver is a class who has implemntation of webdriver method..
		
		
	
		
		
		
		
		
		
	}

}
