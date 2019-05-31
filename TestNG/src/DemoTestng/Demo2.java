package DemoTestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo2 {
	
	@BeforeClass
	public void BC()
	{
		System.out.println("This will execute at the start of the class2");
	}

		@Test
		public void testcase3()
		{
			System.out.println("This is third test case");
		}
		
		@AfterClass
		public void AC()
		{
			System.out.println("This will execute at the end of the class2");
		}
	
}
