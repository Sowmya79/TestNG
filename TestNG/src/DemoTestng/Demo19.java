package DemoTestng;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Demo19 {
	
	public WebDriver driver;
	
	@Test
	public void testcase1() throws IOException
	{
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL("http://192.168.1.100:4444/wd/hub"),capabilities);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,new File("D:\\screen2.png"));
	}

}
