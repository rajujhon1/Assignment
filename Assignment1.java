package Assigment;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class Assigment1 {

	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void OpenURL() throws InterruptedException {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	}
			
	@Test(priority = 1)
	public void TestOne() throws InterruptedException {
    WebElement UserNameTextBox = driver.findElement(By.name("username"));
	UserNameTextBox.click();
    UserNameTextBox.sendKeys("Admin");

    WebElement PasswordTextBox = driver.findElement(By.name("password"));
    PasswordTextBox.click();
    PasswordTextBox.sendKeys("admin123");

	 WebElement LoginBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	 LoginBtn.submit();
     Thread.sleep(3000);
	 }
	
	@Test(priority = 2)                                
   	public void TestCaseTwoAdminPAge() throws InterruptedException {
	WebElement AdminPageLink = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"));
	AdminPageLink.click();
	Thread.sleep(3000);
	}
		
	@Test(priority = 3)
			
	public void TestThree() throws Exception {
	Thread.sleep(3000);
	WebElement UserAddBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
	UserAddBtn.click();
	Thread.sleep(3000);
				
	WebElement UserRoleDropDownOption = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]"));
	UserRoleDropDownOption.click();
	Thread.sleep(3000);
				
	WebElement ListItem = driver.findElement(By.xpath("//div[@role='listbox']//span[text()='Admin']"));
	ListItem.click();
	Thread.sleep(3000);
				
	WebElement EmployeeNameTxtBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input"));
	EmployeeNameTxtBox.click();
	EmployeeNameTxtBox.sendKeys("jhon");
	Thread.sleep(2000);

	WebElement StatusDropDown = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]"));
	StatusDropDown.click();
	Thread.sleep(2000);
				 
			
	WebElement ListItems = driver.findElement(By.xpath("//div[@role='listbox']//span[text()='Enabled']"));
	String SelectedStatus = ListItems.getText();
	ListItems.click();
	Thread.sleep(3000);
						
	WebElement UserNameTextBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input"));
	UserNameTextBox.click();
	UserNameTextBox.sendKeys("Rajujhon");
	Thread.sleep(3000);
				
	WebElement PAsswordTextBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"));
	PAsswordTextBox.click();
	PAsswordTextBox.sendKeys("R@ju123");
	Thread.sleep(3000);
				
	WebElement ConfirmPAsswordTextBox  = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input"));
	ConfirmPAsswordTextBox.click();
	ConfirmPAsswordTextBox.sendKeys("R@ju123");
	Thread.sleep(3000);
				
    WebElement SaveBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
				SaveBtn.click();
				
	Assert.assertEquals(SelectedStatus, "Enabled", "Does not match");
	System.out.println("enabled");
	Thread.sleep(2000);
	WebElement CancelBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[1]"));
	CancelBtn.click();
			}
			
	
			@Test(priority = 4)
			public void TestFour() throws InterruptedException {
				
			Thread.sleep(3000);
			WebElement UserAddButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
			UserAddButton.click();
			Thread.sleep(3000);
			
			WebElement UserRoleDropDownOption = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]"));
			UserRoleDropDownOption.click();
			Thread.sleep(2000);
			
			WebElement ListItem = driver.findElement(By.xpath("//div[@role='listbox']//span[text()='Admin']"));
			ListItem.click();
			Thread.sleep(2000);
			
			WebElement EmployeeNameTxtBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input"));
			EmployeeNameTxtBox.click();
			EmployeeNameTxtBox.sendKeys("jhon");
			
			Thread.sleep(2000);
			
			
			
			
			WebElement StatusDropDown = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]"));
			StatusDropDown.click();
			Thread.sleep(2000);
			 
			
			WebElement ListItems = driver.findElement(By.xpath("//div[@role='listbox']//span[text()='Disabled']"));
			String SelectedStatus = ListItems.getText();
			ListItems.click();
			Thread.sleep(2000);
			
			
			WebElement UserNameTextBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input"));
			UserNameTextBox.click();
			UserNameTextBox.sendKeys("Rajujhon");
			
			Thread.sleep(2000);
			
			WebElement PasswordTextBox = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"));
			PasswordTextBox.click();
			PasswordTextBox.sendKeys("R@ju123");
			
			Thread.sleep(2000);
			
			WebElement ConfirmPasswordTextBox  = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input"));
			ConfirmPasswordTextBox.click();
			ConfirmPasswordTextBox.sendKeys("R@ju123");
			
			Thread.sleep(2000);
			
			WebElement SaveButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
			SaveButton.click();
			Assert.assertEquals(SelectedStatus, "Disabled", "Does not match");
			System.out.println("disabled");
		     
		}

	@AfterTest
	public void CloseURL() {
	driver.close();
		}	
	}