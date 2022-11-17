package Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class broswerlaunch {

	public static WebDriver driver =null;
	
	
	@BeforeSuite
	public void browserlau() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		
	}
	@AfterSuite
	public void closwbroswe() {
		driver.close();
	}
}
