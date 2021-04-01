package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91936\\eclipse-workspace\\Selenium1\\Automation Practice\\Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.google.com/");
			Thread.sleep(3000);
			WebElement password = driver.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi')]"));
			password.sendKeys("greenstechnology");
			

	}

}
