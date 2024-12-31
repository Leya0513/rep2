package seleniumwjava;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplelinkvalid {
	ChromeDriver driver;
	

	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}

	@Test
	public void test() throws Exception {
		String link="";
		List<WebElement>li=driver.findElements(By.tagName("a"));
		for(WebElement w:li) {
		link=w.getAttribute("href");
		URL ob=new URL(link);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		int responsecode=con.getResponseCode();
		System.out.println(responsecode);
		con.connect();
		if(responsecode==200)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
		}
	}
}
