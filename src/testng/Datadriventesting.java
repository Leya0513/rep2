package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventesting {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test() throws IOException
	{
		File f=new File("C:\\Users\\leyat\\OneDrive\\Documents\\datadriventesting.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet s=wb.getSheet("Sheet1");
		System.out.println(s.getLastRowNum());
		
		for(int i=1;i<=s.getLastRowNum();i++)
		{
			String uname=s.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username= "+uname);
			String pswd=s.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password= "+pswd);
			
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(uname);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pswd);
			
			driver.findElement(By.name("login")).click();
		}
		
	}
}
