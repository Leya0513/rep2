package testng;

import org.testng.annotations.Test;

public class Grupingtestng {
	@Test(groups={"sanity"})
	public void main1()
	{
		System.out.println("main1");
	}
	@Test(groups={"sanity","smoke"})
	public void main2()
	{
		System.out.println("main2");
	}
	@Test(groups={"regression"})
	public void main3()
	{
		System.out.println("main3");
	}
	@Test(groups={"sanity","regression"})
	public void main4()
	{
		System.out.println("main4");
	}
	@Test(groups={"regression"})
	public void main5()
	{
		System.out.println("main5");
	}
}
