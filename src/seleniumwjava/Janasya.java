package seleniumwjava;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasya {
ChromeDriver driver;
@Before
public void before()
{
	driver=new ChromeDriver();
	driver.get("https://janasya.com/");
}
@Test
public void test1() {
	String title=driver.getTitle();
	String expect="Janasya.com-Shop Women's Kurta,Dress,Co-ord Sets,Kurta Sets";
	if(title.equals(expect))
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
	if(pgsrc.contains("New"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}
}
