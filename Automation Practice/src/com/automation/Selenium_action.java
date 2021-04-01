package com.automation;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElements;

public class Selenium_action {

	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91936\\eclipse-workspace\\Selenium1\\Automation Practice\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//WebElement tagrhdb = driver.findElement(By.linkText("Gmail"));
		WebElement Source_ele = driver.findElement(By.id("draggable"));
	    WebElement Target_ele = driver.findElement(By.id("draggable"));		
		Actions ac = new Actions(driver);	
		//Thread.sleep(5000);
		//ac.contextClick(tagrhdb).build().perform();
		
		//ac.moveToElement(tagrhdb).click().build().perform();
		//Thread.sleep(5000);
		//driver.quit();
		
		ac.dragAndDrop(Source_ele,Target_ele).build().perform();
		
		
		
		
	}
}
