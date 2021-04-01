package com.automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SS1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91936\\eclipse-workspace\\Selenium1\\Automation Practice\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		TakesScreenshot ts= (TakesScreenshot) driver;
		File Sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C:\\Users\\91936\\eclipse-workspace\\Selenium1\\Automation Practice\\ScreenShot\\Prakash.png");
FileUtils.copyFile(Sourcefile, destFile);
	}

}
