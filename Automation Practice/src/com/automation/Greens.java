package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91936\\eclipse-workspace\\Selenium1\\Automation Practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement create= driver.findElement(By.linkText("CONTACT US"));
		create.click();
		Thread.sleep(3000);
		WebElement findelements = driver.findElement(By.xpath ("//Input[@id='InputName']"));
			findelements.sendKeys("Narain");
		Thread.sleep(3000);
		WebElement findelements1 = driver.findElement(By.xpath("(//Input[@id='InputEmail1'])"));
		findelements1.sendKeys("nar@123");
		Thread.sleep(3000);
		

	}

}
