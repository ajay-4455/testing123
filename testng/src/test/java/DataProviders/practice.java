package DataProviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	@Test(dataProvider = "sacedata",dataProviderClass = dataprovidesdatahere.class)
	
	public void dataprovidersprac(String username ,String Password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);
	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	driver.close();
	
	}
	public void three(String username ,String Password , String number) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);
	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	driver.close();
	}

//	Object[][] dataset = new Object[3][2];            //first method of creating multi d array and insitalizing values
//	dataset[0][0] ="standard_user"; 
//	dataset[0][1]="secret_sauce";
//	return dataset;

	
	
	
		
		
		
		
		
	

	
	
	
	
	
	
	
	}

