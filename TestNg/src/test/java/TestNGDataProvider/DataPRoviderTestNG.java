package TestNGDataProvider;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataPRoviderTestNG {

	
	@Test(dataProvider = "searchDataSet",dataProviderClass = DataProviderMethod.class)
	public void TestCaseGoogleSearch(String country, String monument) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("http://www.google.com/");
		WebElement searchbox = driver.findElement(By.name("q"));
		
		//enter key combination of country and monument
		searchbox.sendKeys(country+" "+monument);
		
		driver.findElement(By.name("btnK")).submit();
	}
}
