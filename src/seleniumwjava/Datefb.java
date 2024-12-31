package seleniumwjava;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datefb {
ChromeDriver driver;
@Before
public void setup(){
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/r.php");
}
@Test
public void test(){
	WebElement dayele = driver.findElement(By.xpath("//*[@id=\"day\"]"));
	Select day=new Select(dayele);
	day.selectByValue("28");
	
	WebElement monele = driver.findElement(By.xpath("//*[@id=\"month\"]"));
	Select month=new Select(monele);
	month.selectByIndex(8);
	
	WebElement yrele = driver.findElement(By.xpath("//*[@id=\"year\"]"));
	Select year=new Select(yrele);
	year.selectByVisibleText("2018");
}
}
