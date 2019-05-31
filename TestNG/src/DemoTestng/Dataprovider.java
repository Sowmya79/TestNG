package DemoTestng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Dataprovider {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  driver.findElement(By.id("txtUsername")).sendKeys(n);
		driver.findElement(By.id("txtPassword")).sendKeys(s);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "linda.anderson", "linda.anderson" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sunilna\\Desktop\\IBM Data on Desktop\\IBM Upskill Project\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
