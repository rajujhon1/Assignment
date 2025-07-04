package Assigment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.awt.Desktop.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment7 {
	
	public class TestPage{
		
		WebDriver driver = new ChromeDriver();
		
		@BeforeTest
		public void OpenURL() {
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		@Test(priority = 2)
		
		public void Test2() {
			
			Actions actions = new Actions(driver);
			
			WebElement MouseOver = driver.findElement(By.id("mousehover"));
			actions.moveToElement(MouseOver).build().perform();
			
			WebElement ReloadOption = driver.findElement(By.id("Reload"));
			ReloadOption.click();
			
		}
		
		   @AfterTest
		   public void close() {
			   driver.close();
			
		}
		
	}
	
}
