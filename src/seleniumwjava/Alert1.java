package seleniumwjava;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	ChromeDriver driver;

	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/leyat/Desktop/test.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		//driver.switchTo().alert().accept();   -->when only accept
		
		Alert a=driver.switchTo().alert();
		String act=a.getText();
		System.out.println(act);
		String exp="Hello! I am an alert box!!";
		if(act.equals(exp))
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
		a.accept();
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("name1");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("name2");
	}
	


}
