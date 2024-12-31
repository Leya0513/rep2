package testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoIT {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	@Test
	public void test1() throws Exception   
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		System.out.println("sucess");
		Runtime.getRuntime().exec("\"C:\\Users\\leyat\\Documents\\auto1.exe\"");
	}
}
