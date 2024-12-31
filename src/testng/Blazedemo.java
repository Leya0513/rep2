package testng;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Blazedemo {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	driver= new ChromeDriver();

	}
	@BeforeMethod
	public void URLLoading()

	{
	driver.get("https://blazedemo.com/login");

	}
	@Test
	public void test()
	{

	driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("password")).sendKeys("pswrddd");

	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button")).click();
	}

	
}
