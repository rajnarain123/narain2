package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LVB {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91936\\eclipse-workspace\\Selenium1\\Automation Practice\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.lvbankonline.in/index.html?module=login");
		Thread.sleep(3000);
		WebElement findelements = driver.findElement(By.xpath("input[@id='login_username|input']"));
findelements.sendKeys("narain");
Thread.sleep(3000);
}
}