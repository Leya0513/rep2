package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagefactry {
	WebDriver driver;
	@FindBy(id="email") 
	WebElement fbemail;
	@FindBy(name="pass")
	WebElement fbpswrd;
	@FindBy(name="login")
	WebElement fblogn;
	
	public Pagefactry (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setValues(String email,String password)
	{
		fbemail.sendKeys(email);
		fbpswrd.sendKeys(password);
	}
	public void login()
	{
		fblogn.click();
	}
}
