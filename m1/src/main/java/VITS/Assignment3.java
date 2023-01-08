package VITS;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","Z:\\arbazjava\\firefox\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		//Thread.sleep(30000);
		driver.manage().window().maximize();
		
		List<WebElement> all = driver.findElements(By.tagName("a"));
		
		System.out.println("all links are : " +all.size());
		
		
		for(WebElement link:all) {
			
			System.out.println("text are : " +link.getText());
			
			System.out.println("link urls are : " +link.getAttribute("href"));
			
		}
		
		
		
		
		
		
			
	
		}
		
		
		
	}

