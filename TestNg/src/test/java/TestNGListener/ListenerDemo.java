package TestNGListener;
import org.testng.SkipException;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ListenerDemo {

	@Test
	public void logIn() {
		//Launch Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//Open URL
		driver.get("https://www.saucedemo.com/");
		
		//Find user name
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//find password
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		//click on Login Button
		driver.findElement(By.id("login-button")).submit();
		
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
	}
	
	@Test
	public void testFail() {
		System.out.println("Failed Test case.");
		Assert.assertTrue(false);
	}
	
	@Test
	public void testSkipped() {
		System.out.println("Skipped Test case.");
		throw new SkipException("Skip exception thrown...");
	}
}
