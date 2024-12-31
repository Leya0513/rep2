package seleniumwjava;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
ChromeDriver driver;
	
	@Before
	public void setup(){
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test(){
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select day=new Select(dayelement);
		day.selectByValue("13");
		List<WebElement>l1=day.getOptions();
		System.out.println(l1.size());
		
		WebElement monthelement=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select month=new Select(monthelement);
		month.selectByIndex(07);
		List<WebElement>l2=month.getOptions();
		System.out.println(l2.size());
		
		WebElement yearelement=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		Select year=new Select(yearelement);
		year.selectByVisibleText("2017");
		List<WebElement>l3=year.getOptions();
		System.out.println(l3.size());
		
		WebElement radio=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		if(radio.isSelected())
		 {
			System.out.println("selected");
		}
		else {
			System.out.println("not selected");
		}
			
		WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
		if(checkbox.isSelected())
		{
			System.out.println("selected");
		}
		else {
			System.out.println("not selected");
		}
		
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		if(logo.isDisplayed())
		{
			System.out.println("displayed");
		}
		else{
			System.out.println("not displayed");
		}
		
	}

}
