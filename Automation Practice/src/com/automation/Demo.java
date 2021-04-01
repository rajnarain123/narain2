package com.automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91936\\eclipse-workspace\\Selenium1\\Automation Practice\\Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Windows.html");
			String pId = driver.getWindowHandle();
			System.out.println(pId);
			
			WebElement click_btn = driver.findElement(By.xpath("//button[text()='    click   ']"));
click_btn.click();

Set<String> windows = driver.getWindowHandles();
for(String id: windows) {
	
  String title = driver.switchTo().window(id).getTitle();
  System.out.println(title);
  
  if(driver.switchTo().window(id).getTitle().equals("Frames & windows")) {
	  driver.close();
  }
  
}
Thread.sleep(3000);
	}
}


