package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class softassertion {
	@Test
	public void sofAssertion() {
		SoftAssert soft = new SoftAssert();
		String expectedresult = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String actualresult =driver.getTitle();
		soft.assertEquals(actualresult, expectedresult);
	//System.out.println("title verification failed");
		
		String actualtext ="Login";
	String expectedtext = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[1]/div[2]/div[3]/div/div/div/a")).getAttribute("class");
		soft.assertEquals(actualtext, expectedtext, "passed");
		soft.assertAll();
		
		
}
	
}
