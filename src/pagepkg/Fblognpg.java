package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fblognpg {
	WebDriver driver;//null
	By fbmail=By.id("email");
	By fbpswd=By.id("pass");
	By fblogin=By.name("login");
	
	public Fblognpg(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setValues(String email,String password)
	{
		driver.findElement(fbmail).clear();
		driver.findElement(fbmail).sendKeys(email);
		driver.findElement(fbpswd).clear();
		driver.findElement(fbpswd).sendKeys(password);
	}
	public void login()
	{
		driver.findElement(fblogin).click();
	}
}
