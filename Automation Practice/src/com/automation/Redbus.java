package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91936\\eclipse-workspace\\Selenium1\\Automation Practice\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.xpath("//input[@id='src']"));
		findElement.sendKeys("0302");
		WebElement findElement1 = driver.findElement(By.xpath("//input[@id='dest']"));
		findElement1.sendKeys("1234");

		
		
		
	}

}
