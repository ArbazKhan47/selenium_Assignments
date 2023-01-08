package VITS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","Z:\\arbazjava\\firefox\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.navigate().to("https://accounts.google.com/");
        driver.findElement(By.id("identifierId")).sendKeys("dummy@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
        Thread.sleep(500000);

        driver.findElement(By.name("password")).sendKeys("dummy");
        driver.findElement(By.className("VfPpkd-vQzf8d")).click();
        driver.findElement(By.className("T-I T-I-KE L3"));
        driver.findElement(By.linkText("Recipients")).sendKeys("qatesting@vitsconsulting.com");
        driver.findElement(By.name("subjectbox")).sendKeys("QA Automation Test Mail");
        driver.findElement(By.className("Am Al editable LW-avf tS-tW:")).sendKeys("I'm tester testing email");
        driver.findElement(By.xpath("//*[@id=\":pi\"]")).click();

	}

}
