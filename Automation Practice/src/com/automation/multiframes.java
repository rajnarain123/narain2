package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiframes {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91936\\eclipse-workspace\\Selenium1\\Automation Practice\\Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Frames.html");

	}

}
