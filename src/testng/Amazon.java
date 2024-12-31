package testng;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {

WebDriver driver;
@Before
public void setup()
{
driver = new ChromeDriver();
driver.get("https://www.amazon.in/");

}

@Test
public void test()
{

driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
driver.findElement(By.id("createAccountSubmit")).click();
driver.findElement(By.id("ap_customer_name")).sendKeys("abc");
driver.findElement(By.id("ap_phone_number")).sendKeys("1234");
driver.findElement(By.id("ap_password")).sendKeys("1234");
driver.findElement(By.xpath("//*[@id=\"ap_register_form\"]/div/div"));
driver.navigate().back();
driver.navigate().back();

}

}
