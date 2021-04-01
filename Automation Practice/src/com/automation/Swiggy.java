package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91936\\eclipse-workspace\\Selenium1\\Automation Practice\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		WebElement the = driver.findElement(By.linkText("Sign up"));
		the.click();
		Thread.sleep(3000);
		WebElement findelement = driver.findElement(By.id("mobile"));
		findelement.sendKeys("9361");
		Thread.sleep(3000);

	}

}