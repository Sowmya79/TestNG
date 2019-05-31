package DemoTestng;

import org.testng.annotations.Test;

public class Demo7 {
	@Test(groups={"smoke"},priority=1)
	public void Test1()
	{
		System.out.println("Executing test1 of smoke testing");
	}
	@Test(groups={"smoke"},priority=2)
	public void Test2()
	{
		System.out.println("Executing test2 of smoke testing");
	}
	@Test(groups={"regression"},priority=3)
	public void Test3()
	{
		System.out.println("Executing test1 of regression testing");
	}
}
