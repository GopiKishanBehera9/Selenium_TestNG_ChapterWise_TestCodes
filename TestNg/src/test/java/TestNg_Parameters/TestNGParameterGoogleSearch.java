package TestNg_Parameters;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestNGParameterGoogleSearch {
	@Test
	@Parameters({"keyword"})
	public void googleSeach(String searchdata) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		
		driver.get("http://www.google.com/");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(searchdata);
		
		Assert.assertEquals(searchdata, searchbox.getAttribute("value"));
		
		driver.quit();
	}

}
