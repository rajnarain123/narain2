package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trains {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91936\\eclipse-workspace\\Selenium1\\Automation Practice\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		WebElement from = driver.findElement(By.xpath("//input[contains(@class,'autocomplete required keyValue span span24 ui-autocomplete-input selflabel')]"));
from.sendKeys("Chennai");
Thread.sleep(3000);
}
}