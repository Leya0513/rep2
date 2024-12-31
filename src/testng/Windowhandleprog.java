package testng;


	import java.time.Duration;
	import java.util.Set;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Windowhandleprog {

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	driver= new ChromeDriver();

	}
	@BeforeMethod

	public void URLLoading()
	{
	driver.get("https://www.amazon.in/");

	}
	@Test
	public void test()
	{
	driver.manage().window().maximize();

	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones");

	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

	String actual = driver.getTitle();
	System.out.println(actual);

	String expected = "Amazon.in : mobile phones ";
	if(actual.equals(expected))
	{
	System.out.println("pass");
	}
	else
	{

	System.out.println("fail");
	}
	//Assert.assertEquals(actual, expected);

	//driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2/span")).click();

	String parentwindow = driver.getWindowHandle();
	// System.out.println("parent window title " + driver.getTitle());// to get title

	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2/span")).click();

	Set<String> allwindowhandles = driver.getWindowHandles();

	for(String handle: allwindowhandles)
	{
	System.out.println(handle);

	if(!handle.equalsIgnoreCase(parentwindow))

	{

	driver.switchTo().window(handle);

	WebDriverWait wait =new
	WebDriverWait(driver,Duration.ofSeconds(30));

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div[5]/div[1]/div[4]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")));

	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[5]/div[1]/div[4]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();

	WebDriverWait W =new
	WebDriverWait(driver,Duration.ofSeconds(30));

	W.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[8]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input")));

	driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input")).click();

	driver.close();

	}

	driver.switchTo().window(parentwindow);

	}

	}
	
}
