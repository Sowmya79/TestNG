package DemoTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo5 {
	WebDriver driver;
	@Test(priority=1)
	public void launch()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String Actualtitle = driver.getTitle();
		String Expectedtitle = "OrangeHRM";
		Assert.assertEquals(Actualtitle, Expectedtitle);
	}
	
	@Test(dependsOnMethods={"launch"},alwaysRun=true,priority=2)
	public void testcase() throws InterruptedException
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		
	}

	@Test(dependsOnMethods={"testcase"},alwaysRun=true,priority=3)
	public void end()
	{
		 driver.close();
	}
}
