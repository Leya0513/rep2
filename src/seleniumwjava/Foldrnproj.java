package seleniumwjava;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v128.filesystem.model.File;
import org.openqa.selenium.io.FileHandler;

public class Foldrnproj {
	ChromeDriver driver;

	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		//WebElement dayelemnt=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		//File src=dayelemnt.getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(src1,new File("./screenshot//elmntsrcsht1.png"));
	}
}
