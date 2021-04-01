package com.maven.org.TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
	@Test
	private void Google() {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\91936\\eclipse-workspace\\Selenium1\\TestNg\\src\\test\\java\\com\\maven\\org\\TestNg");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		

	}
	@Test
	private void Instagram() {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\91936\\eclipse-workspace\\Selenium1\\TestNg\\src\\test\\java\\com\\maven\\org\\TestNg");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");

	}
	@Test
	private void Facebook() {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\91936\\eclipse-workspace\\Selenium1\\TestNg\\src\\test\\java\\com\\maven\\org\\TestNg");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

}
