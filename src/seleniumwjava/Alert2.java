package seleniumwjava;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
	ChromeDriver driver;

	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
	}
	@Test
		public void test()
		{
			driver.findElement(By.xpath("//*[@id=\"alertexamples\"]")).click();
			Alert a=driver.switchTo().alert();
			String act=a.getText();
			System.out.println(act);
			String exp="I am an alert box!";
			if(act.equals(exp))
			{
				System.out.println("valid");
			}
			else
			{
				System.out.println("invalid");
			}
			a.accept();
			
			driver.findElement(By.xpath("//*[@id=\"confirmexample\"]")).click();
			Alert b=driver.switchTo().alert();
			String actu=b.getText();
			System.out.println(actu);
			String ext="I am a confirm alert";
			if(actu.equals(ext))
			{
				System.out.println("valid");
			}
			else
			{
				System.out.println("invalid");
			}
			b.dismiss();
			
			driver.findElement(By.xpath("//*[@id=\"promptexample\"]")).click();
			
			Alert c=driver.switchTo().alert();
			String actual=c.getText();
			System.out.println(actual);
			String expect="I prompt you";
			if(actu.equals(expect))
			{
				System.out.println("valid");
			}
			else
			{
				System.out.println("invalid");
			}
			
			
		}
	

}
