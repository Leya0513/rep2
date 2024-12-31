package seleniumwjava;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qu1 {
ChromeDriver driver;
@Before
public void before()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
}
@Test
public void test()
{
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");	
	driver.findElement(By.xpath("//div[@id='nav-cart-count-container']/span[2]")).click();
	driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]")).click();
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("abc.gmail.com");
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	driver.navigate().back();
	driver.navigate().back();
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[9]")).click();
	driver.findElement(By.xpath("//div[@id='nav-main']/div[1]/a[1]")).click();
	}
}
