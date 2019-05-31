package DemoTestng;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
		  @Test(priority=2)
		  public void A() {
			  Assert.assertEquals("vinay", "Ghouse");
			  driver.navigate().refresh();
			  driver.navigate().back();
			  driver.navigate().to("");
			  driver.navigate().forward();
		  }
		  @Test(priority=3,dependsOnMethods="A")
		  public void B() {
		  }
		  @Test(priority=4)
		  public void C() {
		  }
		  @Test(priority=1)
		  public void D() {
		  }
		 
		} 

