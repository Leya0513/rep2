package testng;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.time.Duration;

	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	import junit.framework.Assert;
	

	public class Saucedemo {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	driver = new ChromeDriver();
	}
	@BeforeMethod
	public void Urlloading()
	{
	driver.get("https://www.saucedemo.com/v1/");
	}
	@Test
	public void test() throws IOException

	{

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	File f= new File("D:\\TestingApache\\saucedemo.xlsx");
	FileInputStream f1 = new FileInputStream(f); // to read that file
	XSSFWorkbook wb = new XSSFWorkbook(f1); //to read the workbook

	XSSFSheet sh = wb.getSheet("Sheet1");// to identify the sheet to read

	System.out.println(sh.getLastRowNum()); // to get the last row number

	for(int i =1; i<=sh.getLastRowNum();i++)
	{
	String Username = sh .getRow(i).getCell(0).getStringCellValue(); //to read the 1st value in username

	System.out.println("Username =" + Username);
	String Password = sh.getRow(i).getCell(1).getStringCellValue();
	System.out.println(Password);

	driver.findElement(By.id("user-name")).clear();
	driver.findElement(By.id("user-name")).sendKeys(Username);
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys(Password);
	driver.findElement(By.id("login-button")).click();
	String actual = driver.getTitle();
	System.out.println(actual);

	String Expected = "Swag Labs&";
	Assert.assertEquals(Expected,actual);
	System.out.println("pass");

	}
	}
}
