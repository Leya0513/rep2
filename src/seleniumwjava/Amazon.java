package seleniumwjava;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	@Before
	public void before()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void test1(){
		String title=driver.getTitle();
		String expecttitle="amazon";
		if(title.equals(expecttitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test
	public void test2()
	{
		String pgsrc=driver.getPageSource();
		if (pgsrc.contains("fashion"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}
	@After
	public void after()
	{
		driver.close();
	}
}
