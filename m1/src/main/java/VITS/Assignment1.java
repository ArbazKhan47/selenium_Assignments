package VITS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Z:\\arbazjava\\firefox\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vitshr.com/");
	
		driver.manage().window().maximize();
		if(driver.getTitle()=="VITS HR") {
		System.out.println("PASS");
		}
		else {
			
			System.out.println("FAIL");
		}
		
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(20000);
		driver.navigate().back();
		Thread.sleep(20000);
		driver.getCurrentUrl();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		Thread.sleep(20000);
		driver.close();
		
	}

}
