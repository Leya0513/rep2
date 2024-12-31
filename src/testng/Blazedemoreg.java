package testng;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;

	import org.testng.annotations.Test;

	import Page.BlazeRegisterPage;

	public class Blazedemoreg {
	WebDriver driver;

	@BeforeTest
	public void setup()
	{
	driver = new ChromeDriver();

	}

	@BeforeMethod
	public void URLLoadind()
	{
	driver.get(&quot;https://blazedemo.com/register&quot;);
	}
	@Test
	public void test()
	{
	BlazeRegisterPage ob = new BlazeRegisterPage(driver);
	ob.setvalue(&quot;Resmi&quot;, &quot;Lumi&quot;, &quot;abc@gmail&quot;, &quot;bmbm&quot;, &quot;jh&quot;);
	ob.login();

	}

	}
}
