package Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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
	
       public class Assignment8 {
		
		WebDriver driver = new ChromeDriver();
		
		@BeforeTest
		public void OpenURL() {
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
      @Test()
      public void TestCase1() {
    	  
    	  String parentWindow = driver.getWindowHandle();
    	  WebElement OpenTab = driver.findElement(By.id("opentab"));
    	  OpenTab.click();
    	  Set<String> allWindows = driver.getWindowHandles();
    	  
    	  for (String windowHandle : allWindows) {
    		  if (!windowHandle.equals(parentWindow)) {
    		  driver.switchTo().window(windowHandle);
    		  break;
    		  }
    		 }
    	  System.out.println("Title of new window: " + driver.getTitle());
    	  driver.switchTo().window(parentWindow);

    		  }
        	  
      }

