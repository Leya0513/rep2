package seleniumwjava;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;



public class Annotate {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//System.out.println("browser open");
	}
	@Test
	public void test() {
		String title=driver.getTitle();
		String expectedtitle="google";
		
		if(title.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		//System.out.println("test activity");
	}
	@After
	public void browserclose()
	{
		driver.close();
		//driver.quit();
	
		//System.out.println("browser close");
	}

}
