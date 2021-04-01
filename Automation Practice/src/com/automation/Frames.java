package com.automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91936\\eclipse-workspace\\Selenium1\\Automation Practice\\Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
			
			driver.findElement(By.xpath("(//li[contains(@class,'h-c-header__cta-li h-c-header__cta-li--primary')])[2]/a")).click();
			String parentWindow = driver.getWindowHandle();
			Set<String> windowHandles = driver.getWindowHandles();
			for (String string : windowHandles) {
				if(!string.equals(parentWindow)) {
					driver.switchTo().window(string);
					driver.findElement(By.name("firstName")).sendKeys("naren");
					Thread.sleep(4000);
					driver.close();
				}
				driver.switchTo().window(parentWindow);
			}
	}

}