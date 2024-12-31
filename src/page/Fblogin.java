package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fblogin {
	WebDriver driver;//null
	By fbmail=By.id("email");
	By fbpswd=By.id("pass");
	By fblogin=By.name("login");
	
	public Fblogin(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setValues(String email,String password)
	{
		driver.findElement(fbmail).sendKeys(email);
		driver.findElement(fbpswd).sendKeys(password);
	}
	public void login()
	{
		driver.findElement(fblogin).click();
	}
}
