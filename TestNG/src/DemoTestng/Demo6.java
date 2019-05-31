package DemoTestng;

import org.testng.annotations.Test;

public class Demo6 {
	@Test(priority=1)
	public void Lion()
	{
		System.out.println("lion");
	}
	
	@Test(priority=2)
	public void Elephant()
	{
		System.out.println("Elephant");
	}
	@Test(priority=3)
	public void Tiger()
	{
		System.out.println("tiger");
	}

	@Test
	public void A()
	{
		System.out.println("A");
	}
	
	@Test
	public void B()
	{
		System.out.println("B");
	}
}
