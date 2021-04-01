package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91936\\eclipse-workspace\\Selenium1\\Automation Practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement the = driver.findElement(By.id("email"));
		the.sendKeys("gkjgjhfgku");
		Thread.sleep(3000);
		
		WebElement findElement = driver.findElement(By.xpath ("//input[@id='pass']"));
		findElement.sendKeys("1234");
		Thread.sleep(3000);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
