package VITS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","Z:\\arbazjava\\firefox\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.fb.com");
		//Thread.sleep(20000);
		driver.manage().window().maximize();
		
		if (driver.getCurrentUrl()=="https://www.facebook.com/") {
			System.out.println("PASS");
			
		} else {
			
			System.out.println("");

		}
		
		/*
		boolean t = driver.findElement(By.id("u_0_0_2K")).isDisplayed();
	      if (t) {
	         System.out.println("Element is dispalyed");
	      } else {
	         System.out.println("Element is not dispalyed");
	      }  */
		
		
		
		
		
		driver.findElement(By.linkText("Create new account")).click();
		
	
			
			driver.findElement(By.name("firstname")).sendKeys("Test");
			driver.findElement(By.name("lastname")).sendKeys("User");
			driver.findElement(By.name("reg_email__")).sendKeys("testuser@test.com");
			driver.findElement(By.name("reg_passwd__")).sendKeys("testPassword");
			
			Select selDate = new Select(driver.findElement(By.id("day")));
			Select selMonth = new Select(driver.findElement(By.id("month")));
			Select selYear = new Select(driver.findElement(By.id("year")));
			
			selDate.selectByVisibleText("21");
			selMonth.selectByVisibleText("Jun");
			selYear.selectByVisibleText("1989");
			
			driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
			
			driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		
		/* driver.findElement(By.name("firstname")).sendKeys("arbaz");
		//Thread.sleep(20000);
		driver.findElement(By.id("lastname")).sendKeys("flower");
		//Thread.sleep(20000);
		driver.findElement(By.id("reg_email__")).sendKeys("5678679986");
		//Thread.sleep(20000); 
		driver.findElement(By.id("password_step_input")).sendKeys("apple");
		//Thread.sleep(20000);
		
		Select dropdown1 = new Select(driver.findElement(By.id("month")));
        dropdown1.selectByVisibleText("Mar");
        //Thread.sleep(20000);
        
    	Select dropdown2 = new Select(driver.findElement(By.id("day")));
        dropdown2.selectByVisibleText("10");
        //Thread.sleep(20000);
        
    	Select dropdown3 = new Select(driver.findElement(By.id("year")));
        dropdown3.selectByVisibleText("2005");
        //Thread.sleep(20000);
        driver.findElement(By.id(" u_y_5_Np")).click();
        //Thread.sleep(20000);
        driver.findElement(By.id(" u_1g_s_EK")).click(); */
		
        

	}
	
	

	
	}


