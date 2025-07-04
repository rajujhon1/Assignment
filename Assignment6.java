package Assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Assigment6 {
	
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void OpenURL() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void RadioButton() {
		
		WebElement Checkbox = driver.findElement(By.id("checkBoxoption3"));
		Checkbox.click();
	}
	public void Dropdown() {
		WebElement Checkbox = driver.findElement(By.xpath("//input[@value='radio2']"));
		Dropdown.click();
		
	}
     
	@AfterTest
	public void close() {
		driver.close();
	}
}
