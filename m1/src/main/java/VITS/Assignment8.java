package VITS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","Z:\\arbazjava\\firefox\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("");
		driver.manage().window().maximize();
		


	}

}
