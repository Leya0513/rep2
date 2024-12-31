package seleniumwjava;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {
ChromeDriver driver;
	
	@Before
	public void setup(){
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test(){
		WebElement e=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		String actual=e.getAttribute("value");
		
		System.out.println(actual);
		String expected="Create my account >>";
		
		if(actual.equals(expected))
		{
			System.out.println("content verified");
		}
		else
		{
			System.out.println("content not verified");
		}
		
		
	}
}
