package DemoTestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Demo1 {
	
	@BeforeSuite
	public void BS()
	{
		System.out.println("This is first");
	}
	
	@BeforeTest
	public void BT()
	{
		
		//once
		System.out.println("This will execute first before all classess");
	}
	
	@BeforeClass
	public void BC()
	{
		System.out.println("This will execute at the start of the calss1");
	}
	
  @Test
  public void Testcase1() {
	  System.out.println("This is my first test case");
  }
  
 
  @Test
  public void Testcase2()
  {
	  System.out.println("This is my second test case");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This will execute before each Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This will execute after each method");
  }
  
  @AfterClass
  public void AC()
  {
	  System.out.println("This will execute at the end of the class1");
  }
  
  @AfterTest
  public void AT()
  {
	  System.out.println("This will execute after all the classess");
  }
  
  @AfterSuite
  public void AS()
  {
	  System.out.println("This is last");
  }

}
