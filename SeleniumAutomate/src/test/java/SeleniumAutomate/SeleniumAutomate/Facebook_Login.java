package SeleniumAutomate.SeleniumAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_Login {

	@Test
	public void fb_automation() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("santoshthakare5000@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("pass")).sendKeys("santosh@123");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[name = \"login\"]")).click();
		Thread.sleep(2000);  

		
//		driver.findElement(By.name("login")).click();
 
//		driver.findElement(By.id("pass")).clear();
		
//		driver.quit();
	}
}
