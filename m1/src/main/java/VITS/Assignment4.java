package VITS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {

	private static String category;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","Z:\\arbazjava\\firefox\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("gh-ac")).sendKeys("Apple Watch");
//		WebElement categoryDropdownElement =driver.findElement(By.id("gh-cat"));
//		Select categorySelect = new Select(categoryDropdownElement);
//		categorySelect.deselectByVisibleText(category);
		driver.findElement(By.id("gh-btn")).click();
		
	}

}
