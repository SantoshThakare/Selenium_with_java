package SeleniumAutomate.SeleniumAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyhomepageUsingTitle {
	@Test
	public void home_page_title() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("9623500474");
		Thread.sleep(2000);

		driver.findElement(By.id("pass")).sendKeys("Santosh@9623");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[name = \"login\"]")).click();
		Thread.sleep(2000);
		
		String expectedTitle = "Facebook";
		String actualTitle = driver.getTitle();
		//If actual title contains "Enter Time" text then home page is displayed.
		if (actualTitle.contains(expectedTitle))
		{
		System.out.println("Home page is displayed");
		} else
		{
		System.out.println("Home page is NOT displayed");
		}
//		driver.close();
		
	}
	
}


