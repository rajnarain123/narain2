package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91936\\eclipse-workspace\\Selenium1\\Automation Practice\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://automationpractice.com/index.php");
		WebElement the = driver.findElement(By.linkText("Sign in"));	
	    the.click();
	    Thread.sleep(3000);
	    WebElement the1 = driver.findElement(By.id("email_create"));
	    the1.sendKeys("raj.narain.94@gmail.com");
	    Thread.sleep(3000);
	    WebElement the2 = driver.findElement(By.id("SubmitCreate"));
	    the2.click();
	    Thread.sleep(3000);
	    WebElement the3 = driver.findElement(By.id("passwd"));
	    the3.sendKeys("narin");
	    Thread.sleep(3000);
	    WebElement the4 = driver.findElement(By.id("id_gender1"));
	    the4.click();
	    Thread.sleep(3000);
	    WebElement the5 = driver.findElement(By.id("customer_firstname"));
	    		the5.sendKeys("Raj");
	    Thread.sleep(3000);
	    WebElement the6 = driver.findElement(By.id("customer_lastname"));
	    the6.sendKeys("rajaram");
	Thread.sleep(3000);
	WebElement the7 = driver.findElement(By.id("passwd"));
	the7.sendKeys("narin");
	Thread.sleep(3000);
  WebElement the8 = driver.findElement(By.xpath("//select[@id='days']"));
  the8.click();
  Thread.sleep(3000);
  WebElement the9 = driver.findElement(By.xpath("//select[@id='months']"));
  the9.click();
  Thread.sleep(3000);

  
  WebElement the10 = driver.findElement(By.xpath("//select[@id='years']"));
  the10.click();
  Thread.sleep(3000);
  WebElement the11 = driver.findElement(By.id("firstname"));
  the11.sendKeys("raj");
  Thread.sleep(3000);
  WebElement the12 = driver.findElement(By.id("lastname"));
  the12.sendKeys("Rajaram");
  Thread.sleep(3000);
  WebElement the13 = driver.findElement(By.id("company"));
  the13.sendKeys("Greens");
  Thread.sleep(3000);
  WebElement the14 = driver.findElement(By.id("address1"));
  the14.sendKeys("LB Road chennai");
  Thread.sleep(3000);
  WebElement the15 = driver.findElement(By.id("address2"));
  the15.sendKeys("adyar road");
  Thread.sleep(3000);
  WebElement the16 = driver.findElement(By.id("city"));
  the16.sendKeys("Chennai");
  Thread.sleep(3000);
  WebElement the17 = driver.findElement(By.id("id_state"));
  the17.click();
  Thread.sleep(3000);
  WebElement the18 = driver.findElement(By.id("postcode"));
  the18.sendKeys("600031");
  Thread.sleep(3000);
  WebElement the19 = driver.findElement(By.id("id_country"));
  the19.click();
  Thread.sleep(3000);
  WebElement the20 = driver.findElement(By.id("other"));
  the20.sendKeys("123445");
  Thread.sleep(3000);
  WebElement the21 = driver.findElement(By.id("phone"));
  the21.sendKeys("12345");
  Thread.sleep(3000);
  WebElement the22 = driver.findElement(By.id("phone_mobile"));
  the22.sendKeys("678910");
  Thread.sleep(3000);
  WebElement the23 = driver.findElement(By.id("alias"));
  the23.sendKeys("LB road");
  Thread.sleep(3000);
  WebElement the24 = driver.findElement(By.id("Register"));
the24.click();
Thread.sleep(3000);
  
  
  
  
  
  
  
  
	}
}
		

	


