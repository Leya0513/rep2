package testng;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RishiHerbals {
WebDriver driver;
String BaseLink = “https://rishiherbalindia.linker.store/”;

@BeforeTest
public void setup()
{
driver= new ChromeDriver();

}
@BeforeMethod
public void URLLoading()
{
driver.get(“https://rishiherbalindia.linker.store/”);

}
@Test

public void login()
{
driver.manage().window().maximize();
driver.findElement(By.xpath(“//*[@id=\”top- links\”]/ul/li[1]/a/span”)).click();

WebElement login = driver.findElement(By.xpath(“//*[@id=\”top-links\”]/ul/li[1]/ul/li[5]/a”));

Actions act = new Actions(driver);
act.moveToElement(login);
act.perform();
login.click();

WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(“//*[@id=\”;cont-login-with-email\”]/form/div[1]/input”)));

driver.findElement(By.xpath(“//*[@id=\”cont-login-with-
email\”]/form/div[1]/input”)).sendKeys(“Rnbb@1234.com”);
driver.findElement(By.xpath(“//*[@id=\&quot;cont-login-with-email\”]/form/div[2]/input”)).sendKeys(“Abcde_1234”);

driver.findElement(By.xpath(“//*[@id=\&quot;cont-login-with email\”]/form/button[1]”)).click();

}

@Test
public void search()
{

driver.findElement(By.xpath(“//*[@id=\”search\”]/input”)).sendKeys(&quot;agrogrowth booster”);

driver.findElement(By.xpath(“//*[@id=\”search\”]/span/button/I”)).click() ;

driver.findElement(By.xpath(“//*[@id=\”content\”]/div[3]/div[2]/div/div/div[1]/div/a/img”)).click();

driver.findElement(By.xpath(“//*[@id=\”prod_cont\&quot;]/div/div[4]/button[1]/span”)).click();

driver.findElement(By.xpath(“//*[@id=\” menu\”]/ul/li[4]/a”)).click();

driver.findElement(By.xpath(“//*[@id=\”content\”]/div[3]/div[1]/div/div/div[1]/div/a/img”)).click();

driver.findElement(By.xpath(“//*[@id=\”prod_cont\”]/div/div[4]/button[1]/span”)).click();

driver.findElement(By.xpath(&quot;//*[@id=\&quot;menu\&quot;]/ul/li[1]/a&quot;)).click();

driver.findElement(By.xpath(&quot;//*[@id=\&quot;menu\&quot;]/ul/li[2]/a&quot;)).click();

driver.findElement(By.xpath(&quot;//*[@id=\&quot;menu\&quot;]/ul/li[3]/a&quot;)).click();

driver.findElement(By.xpath(&quot;//*[@id=\&quot;menu\&quot;]/ul/li[4]/a&quot;)).click();

driver.findElement(By.xpath(“//*[@id=\”menu\”]/ul/li[5]/a”)).click();

driver.findElement(By.xpath(&quot;//*[@id=\”menu\”]/ul/li[6]/a”)).click();

driver.findElement(By.xpath(“//*[@id=\”menu\”]/ul/li[7]/a”)).click();

driver.findElement(By.xpath(“//*[@id=\”menu\”]/ul/li[8]/a”)).click();

driver.findElement(By.xpath(“//*[@id=\”menu\”]/ul/li[9]/a”)).click();

driver.findElement(By.xpath(“//*[@id=\”menu\”]/ul/li[10]/a”)).click();
}
@Test
public void Scroll()
{

JavascriptExecutor Js= (JavascriptExecutor)driver;

Js.executeScript(“window.scrollBy(0,document.body.scrollHeight)”);

driver.findElement(By.xpath(“/html/body/div/footer/div[1]/div/div[2]/div[2]/d
iv/ul/li[2]/a”)).click();

}
@Test
public void Screenshot() throws Exception
{
WebElement privacy=driver.findElement((By.xpath(“/html/body/div/footer/div[1]/div/div[2]/div[4]/
div/ul/li[1]/a”)));

File prv = privacy.getScreenshotAs(OutputType.FILE);
FileHandler.copy(prv, new
File(“./ScreenShot//privacyscreenshot.png”));

}
@Test
public void Responsecode() throws Exception
{
URL ob = new URL(BaseLink);
HttpURLConnection con =(HttpURLConnection)ob.openConnection();

con.connect();
int response = con.getResponseCode();
System.out.println(response);

if(response==200)
{
System.out.println(“valid”);
}

else
{
System.out.println(“invalid”);
}

}

}
