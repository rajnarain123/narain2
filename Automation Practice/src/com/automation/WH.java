package com.automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WH {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91936\\eclipse-workspace\\Selenium1\\Automation Practice\\Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(3000);
			WebElement click_bm = driver.findElement(By.xpath("// button [@id='u_0_14_HT']"));
click_bm.click();
Thread.sleep(3000);
String parentWindow = driver.getWindowHandle();
Set<String> windowHandles = driver.getWindowHandles();
for (String string : windowHandles) {
	if(!string.equals(parentWindow)) {
		driver.switchTo().window(string);
		WebElement The = driver.findElement(By.xpath("//Input[@id='u_0_n_AD']"));
		The.sendKeys("EBA");
		driver.close();
	}
	driver.switchTo().window(parentWindow);
	}
	
}

	}


