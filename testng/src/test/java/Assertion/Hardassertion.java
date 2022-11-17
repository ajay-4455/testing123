package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hardassertion {
	@Test
	public void Assertion() {
		String expectedresult = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String actualresult =driver.getTitle();
	//WebElement actualresult =driver.findElement(By.name("description")).;
	
	
	Assert.assertEquals(actualresult, expectedresult);
	driver.close();
		
		
		
	}
	
	
	
	
	
	
}
