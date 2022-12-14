package SeleniumAutomate.SeleniumAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementInterfaceMethodsAll {
	
	@Test
	public void facebook_pages() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\Selenium_with_java\\SeleniumAutomate\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		
		driver.findElement(By.linkText("Create New Account")).click(); 
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement mobileNo = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement birthDay = driver.findElement(By.xpath("//select[@id='day']"));
	
		//sendKeys()
		firstname.sendKeys("meshah");
		lastname.sendKeys("njasbd");
		mobileNo.sendKeys("093233453478");
		birthDay.sendKeys("14");
		
		
		//getLocation()
		System.out.println("firstname X-Y_Coordinate:" +firstname.getLocation());
		System.out.println("firstname X-Coordinate:" +firstname.getLocation().getX());
		System.out.println("firstname Y-Coordinate:" +firstname.getLocation().getY());
		System.out.println("lastname X-Y_Coordinate:" +lastname.getLocation());
		System.out.println("lastname X-Coordinate:" +lastname.getLocation().getX());
		System.out.println("lastname Y-Coordinate:" +lastname.getLocation().getY());
		System.out.println("birthDay X-Y_Coordinate:" +birthDay.getLocation());
		System.out.println("birthDay X-Coordinate:" +birthDay.getLocation().getX());
		System.out.println("birthDay Y-Coordinate:" +birthDay.getLocation().getY());
		System.out.println("\n");
		Thread.sleep(3000);
		
		//getSize()
		System.out.println("firstname width-height:" +firstname.getSize());
		System.out.println("firstname width:" +firstname.getSize().getWidth());
		System.out.println("firstname height:" +firstname.getSize().getHeight());
		System.out.println("lastname width-height:" +lastname.getSize());
		System.out.println("lastname width:" +lastname.getSize().getWidth());
		System.out.println("lastname height:" +lastname.getSize().getHeight());
		System.out.println("birthDay width-height:" +birthDay.getSize());
		System.out.println("birthDay width:" +birthDay.getSize().getWidth());
		System.out.println("birthDay height:" +birthDay.getSize().getHeight());
		System.out.println("\n");
		Thread.sleep(3000);
		
		//isDisplayed()
		System.out.println("firstname isDisplayed: " +firstname.isDisplayed());
		System.out.println("lastname isDisplayed: " +lastname.isDisplayed());
		System.out.println("birthDay isDisplayed: " +birthDay.isDisplayed());
		System.out.println("\n");

		//isEnabled()
		System.out.println("firstname isEnabled: " +firstname.isEnabled());
		System.out.println("lastname isEnabled: " +lastname.isEnabled());
		System.out.println("birthDay isEnabled: " +birthDay.isEnabled());
		System.out.println("\n");

		//isSelected()
		System.out.println("firstname isSelected: " +firstname.isSelected());
		System.out.println("lastname isSelected: " +lastname.isSelected());
		System.out.println("birthDay isSelected: " +birthDay.isSelected());
		System.out.println("\n");

		//getAttribute
		System.out.println("firstname get attribute name: " +firstname.getAttribute("name"));
		System.out.println("firstname get attribute name: " +firstname.getAttribute(""));
		System.out.println("lastname get attribute name: " +lastname.getAttribute("id"));
		System.out.println("birthDay get attribute name: " +birthDay.getAttribute("type"));
		System.out.println("\n");

		//getText()
		System.out.println("firstname getText: " +firstname.getText());
		System.out.println("lastname getText: " +lastname.getText());
		System.out.println("birthDay getText: " +birthDay.getText());
		System.out.println("\n");

		//getTagName()
		System.out.println("firstname getTagname: " +firstname.getTagName());
		System.out.println("lastname getTagname: " +lastname.getTagName());
		System.out.println("birthDay getTagname: " +birthDay.getTagName());
		
		//getCssValue()
		System.out.println("firstname getCssValue: " +firstname.getCssValue("color"));
		System.out.println("lastname getCssValue: " +lastname.getCssValue("margin"));
		System.out.println("birthDay getCssValue: " +birthDay.getCssValue("padding"));
		System.out.println("\n");

		//getRect()
		System.out.println("firstname getRect: " +firstname.getRect());
		System.out.println("firstname getWidth: " +firstname.getRect().getWidth());
		System.out.println("firstname getHeight: " +firstname.getRect().getHeight());
		System.out.println("firstname getDimension: " +firstname.getRect().getDimension());
		System.out.println("firstname getPoint: " +firstname.getRect().getPoint());
		System.out.println("lastname getRect: " +lastname.getRect());
		System.out.println("lastname getWidth: " +lastname.getRect().getWidth());
		System.out.println("lastname getHeight: " +lastname.getRect().getHeight());
		System.out.println("lastname getDimension: " +lastname.getRect().getDimension());
		System.out.println("lastname getPoint: " +lastname.getRect().getPoint());
		System.out.println("birthDay getRect: " +birthDay.getRect());
		System.out.println("birthDay getWidth: " +birthDay.getRect().getWidth());
		System.out.println("birthDay getHeight: " +birthDay.getRect().getHeight());
		System.out.println("birthDay getDimension: " +birthDay.getRect().getDimension());
		System.out.println("birthDay getPoint: " +birthDay.getRect().getPoint());
		System.out.println("\n");
		Thread.sleep(3000);
		
		//clear()
		firstname.clear();
		Thread.sleep(2000);
		
		
		Thread.sleep(3000);
//		driver.close();
		
	}

}
