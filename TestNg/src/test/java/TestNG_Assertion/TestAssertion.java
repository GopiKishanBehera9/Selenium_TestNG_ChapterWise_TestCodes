package TestNG_Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestAssertion {
	@Test
	public void testMethod() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		SoftAssert softVerify = new SoftAssert();
		
		//Open URL
		driver.get("https://testautomationpractice.blogspot.com/");
		
		System.out.println("Verifying title...");
		String expectedTitle = "Automation Testing Practice1";
		String actualTitle = driver.getTitle();
		//Assert.assertEquals(expectedTitle, actualTitle,"Title Verify Passed.");
		softVerify.assertEquals(expectedTitle, actualTitle,"Title Verify Passed.");
		
		System.out.println("Verifying presence of Wikipedia-icon");
		WebElement icon = driver.findElement(By.className("wikipedia-icon"));
		//Assert.assertTrue(icon.isDisplayed());
		softVerify.assertTrue(icon.isDisplayed());
		
		//wikipedia-search-button
		System.out.println("Verifying presence of Wikipedia_Search-BTN");
		WebElement searchBtn = driver.findElement(By.className("wikipedia-search-button"));
		//Assert.assertTrue(searchBtn.isDisplayed());
		softVerify.assertTrue(searchBtn.isDisplayed());
		
		driver.close();
		
		//report all failure messages
		softVerify.assertAll();
	}

}
