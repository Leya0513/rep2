package seleniumwjava;


	import java.util.List;

	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Getattribut {

		ChromeDriver driver;
		@Before                                                                                          
		public void setup(){
			driver=new ChromeDriver();
			driver.get("https://www.google.in");
		}
		@Test
		public void test() {
			List<WebElement>li=driver.findElements(By.tagName("a"));
			System.out.println(li.size());
			
				for(WebElement e:li)
				{
					String link=e.getAttribute("href");
					String text=e.getText();
					System.out.println(link+"..."+text);
			}
				
		}

	}

