package seleniumwjava;

import org.openqa.selenium.chrome.ChromeDriver;

public class Contentget {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String pgsrc=driver.getPageSource();
		if (pgsrc.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		
		

	}

}
