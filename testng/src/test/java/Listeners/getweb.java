package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class getweb extends broswerlaunch{

	@Test
	public void getwebsite() {
		driver.get("https://www.amazon.in/");
		Assert.assertTrue(false);
	}
}
