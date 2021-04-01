package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Up_Down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91936\\eclipse-workspace\\Selenium1\\Automation Practice\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
WebElement amazon_logo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView(true);",amazon_logo);
Thread.sleep(4000);
js.executeScript("Window.scrollBy(0,2000);");
Thread.sleep(4000);
js.executeScript("Window.scrollBy(0,-2000);");

	}

}
