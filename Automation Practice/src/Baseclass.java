import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	
		public static WebDriver driver;
		
		public static WebElement element;
		//browserlaunch 
		public static WebDriver browserLaunch(String browserName) {
			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
				driver=new ChromeDriver();
			}else if(browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir")+"\\driver\\gecko.exe");
				driver=new FirefoxDriver();
			}else if(browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir")+"\\driver\\IEDriver.exe");	
			}else {
				System.out.println("Invalid browser");
			}
			return driver;
			public static void max() {
				driver.manage().window().maximize();
			}
			public static void wAit() {
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
			public static void dropDown(WebElement element,String option,String value, String attribute) {
				
				element=driver.findElement(By.id(attribute));
				
				Select s=new Select(element);
				if(option.equalsIgnoreCase("index")) {
					s.selectByIndex(Integer.parseInt(value));
				}else if(option.equalsIgnoreCase("value")) {
					s.selectByValue(value);
				}else if(option.equalsIgnoreCase("text")) {
					s.selectByVisibleText(value);
				}
				//return element;
			}
			public static WebElement elementt(String option,String attribute) {
				if(option.equalsIgnoreCase("id")) {
				 element=driver.findElement(By.id(attribute));
				 
				}else if(option.equalsIgnoreCase("name")){
				element=driver.findElement(By.name(attribute));
				
				}else if(option.equalsIgnoreCase("xpath")) {
				element=driver.findElement(By.xpath(attribute));
				
				}else if(option.equalsIgnoreCase("linkText")) {
				element=driver.findElement(By.linkText(attribute));
				 
				}
				return element;
			}
			public static void scrollDown() {
				
			}
			public static void url(String Url) {
				driver.get(Url);
				}
			public static void sendKeys(String input, String attribute, String at_value) {
				if(input.equalsIgnoreCase("id")) {
					driver.findElement(By.id(attribute)).sendKeys(at_value);
				}else if(input.equalsIgnoreCase("name")) {
				 driver.findElement(By.name(attribute)).sendKeys(at_value);
				}else if(input.equalsIgnoreCase("xpath")) {
					driver.findElement(By.xpath(attribute)).sendKeys(at_value);
				}else if(input.equalsIgnoreCase("linkText")) {
					driver.findElement(By.linkText(attribute)).sendKeys(at_value);
				}else {
					System.out.println("No locator found");
				}
				
			}
			public static void click(String input, String attribute) {
				if(input.equalsIgnoreCase("id")) {
					driver.findElement(By.id(attribute)).click();
				}else if(input.equalsIgnoreCase("name")) {
				 driver.findElement(By.name(attribute)).click();
				}else if(input.equalsIgnoreCase("xpath")) {
					driver.findElement(By.xpath(attribute)).click();
				}else if(input.equalsIgnoreCase("linkText")) {
					driver.findElement(By.linkText(attribute)).click();
				}else {
					System.out.println("No locator found");
				}
			}
			public static void navagation(String input, String url) {
				if(input.equalsIgnoreCase("to")) {
					driver.navigate().to(url);
				}else if(input.equalsIgnoreCase("back")) {
					driver.navigate().back();
				}else if(input.equalsIgnoreCase("forward")) {
					driver.navigate().forward();
				}else if(input.equalsIgnoreCase("refresh"))	{
					driver.navigate().refresh();
				}
			}
			public static void close(String input) {
				if(input.equalsIgnoreCase("close")) {
					driver.close();
				}else if (input.equalsIgnoreCase("quit")) {
					driver.quit();
				}
			}
			public static void alert(String input, String sent_val) {
				Alert alert = driver.switchTo().alert();
				if(input.equalsIgnoreCase("accept")) {
						alert.accept();
				}
				else {
					alert.dismiss();
				}
				if(input.equalsIgnoreCase("sendkey")) {
					alert.sendKeys("sent_val");
				}
			}
			public static void frame(String input1, String attribute1) {
				if(input1.equalsIgnoreCase("xpath")) {
				driver.switchTo().frame(driver.findElement(By.xpath(attribute1)));	
			    }else if(input1.equalsIgnoreCase("id")) {
					driver.switchTo().frame(driver.findElement(By.id(attribute1)));	
			    }else if(input1.equalsIgnoreCase("name")) {
					driver.switchTo().frame(driver.findElement(By.name(attribute1)));	
			    }else if(input1.equalsIgnoreCase("linkText")) {
					driver.switchTo().frame(driver.findElement(By.linkText(attribute1)));	
			    }else {
			    	System.out.println("Invalid element");
				}
				}
			}
				
				
			
			
		

	

}
