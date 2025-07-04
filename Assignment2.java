package Assignment;
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

public class Assignment2 {
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void OpenURL() {
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
     @Test
     public void Locators() {
     
     WebElement AccountAndListsButton = driver.findElement(By.xpath("//*[@id=\"nav-link-accountlist\"]/button"));
     AccountAndListsButton.click();
     
     WebElement List1=driver.findElement(By.xpath("//*[@id=\"nav-al-wishlist\"]/ul/li[1]/a/span"));
     List1.click();
     driver.navigate().back();
     
     WebElement AccountAndListsButtons = driver.findElement(By.xpath("//*[@id=\"nav-link-accountlist\"]/button"));
     AccountAndListsButton.click();
     
     
     WebElement List2=driver.findElement(By.xpath("//span[text()='wish from Any Website']/ancestor::a[contains @class,'nav-link')]"));
     List2.click(); 
     driver.navigate().back();
     
     WebElement List3=driver.findElement(By.xpath("////span[text()='Baby wishlist']/ancestor::a[contains @class,'nav-link')]"));
     List3.click();
     driver.navigate().back();
     
     WebElement List4=driver.findElement(By.xpath("////span[text()='Discover your style']/ancestor::a[contains @class,'nav-link')]"));
     List4.click();
     driver.navigate().back();
     
     WebElement List5=driver.findElement(By.xpath("////span[text()='Explore showroom']/ancestor::a[contains @class,'nav-link')]"));
     List5.click();
     driver.navigate().back();
     
     }
     
     
     @AfterTest
     public void closedURL() {
    	 driver.close();
     }    
}
