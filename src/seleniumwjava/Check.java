package seleniumwjava;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Check {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		
		String expectedtitle="google";
		
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
