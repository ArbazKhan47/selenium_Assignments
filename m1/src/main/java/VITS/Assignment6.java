package VITS;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment6 {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","Z:\\arbazjava\\firefox\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/webpage");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("	//*[@id=\"logo-events\"]/h2/a")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
		driver.switchTo().frame(0);
		
		WebElement sor = driver.findElement(By.id("draggable"));
		WebElement tar = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		String a = tar.getCssValue("color");
		
		Thread.sleep(10000);
		action.dragAndDrop(sor, tar).build().perform();
		
		String b = tar.getCssValue("color");
		
		System.out.println("color before is : " +a);
		
		System.out.println("color after is : " +b);



		
	}


}
