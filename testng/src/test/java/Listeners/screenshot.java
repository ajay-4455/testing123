package Listeners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class screenshot extends broswerlaunch{

	@Test
	public void takescreenshot() throws Exception {
	Date currentdate = new Date();
	//System.out.println(currentdate);
	String date= currentdate.toString().replace(" ", "/").replace(":", ";");
	File shot =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	FileUtils.copyFile(shot, new File (".//testscreenshot//"+date+".png"));
	}
}
