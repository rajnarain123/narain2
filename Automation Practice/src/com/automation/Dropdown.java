package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91936\\eclipse-workspace\\Selenium1\\Automation Practice\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Narain");
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("123");
		Thread.sleep(3000);
		WebElement account = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		account.click();
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.id("day"));
		dropdown.click();
		Thread.sleep(3000);
	Select s= new Select (dropdown);
	s.selectByValue("3");
	s.selectByIndex(1);
	}



		
		
	
		
		
	}

}
