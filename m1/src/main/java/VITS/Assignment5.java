package VITS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment5 {
	private static String register;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","Z:\\arbazjava\\firefox\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://vitshr.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("companyName")).sendKeys("VITS");
		driver.findElement(By.name("companyWebsite")).sendKeys("https://www.vitscc.com");
		driver.findElement(By.name("phoneNo")).sendKeys("(1256778999");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/form/div[4]/div/div/input")).sendKeys("3350 Annapolis Ln N suite a");
		driver.findElement(By.name("zipcode")).sendKeys("55447");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/form/div[8]/div/div/input")).sendKeys("123456789");
		driver.findElement(By.name("employerIdentificationNumber")).sendKeys("987654321");
		driver.findElement(By.name("email")).sendKeys("vits@gmail.com");
		driver.findElement(By.name("password")).sendKeys("vits55447@VITS");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/form/div[13]/div/button/span[1]")).click();
		
	}
}
