package sel.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class selinium {

	

	public static void main(String[] args) {
System.setProperty("webdriver.edge.driver","C:\\Users\\91936\\eclipse-workspace\\Selenium1\\Driver\\msedgedriver.exe");
WebDriver driver = new EdgeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
driver.navigate().to("https://www.amazon.in/");

driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
driver.navigate().back();
	}















}
	}