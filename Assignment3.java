package Assigment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

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

public class Assigment3 {
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void OpenURL() {
		driver.get("https://testpages.eviltester.com/styled/tag/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test
	public void TestCase1() {
		List<WebElement> data = (List<WebElement>) driver.findElement(By.xpath("//table[@id='mytable']//tr[position()>1]/td"));
	    List<String> completedata = new ArrayList<>();
	    System.out.println("Table Data is:");
	    for (WebElement DATA : data) {
	    	completedata.add(DATA.getText());
	    }
	    for (String COMPLETEDATA : completedata) {
	    	
	    	System.out.println(COMPLETEDATA);
	    }
	}
	@AfterTest
	public void closeURL() {
	
	driver.close();
}
}
