import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class busred {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91936\\eclipse-workspace\\Selenium1\\Automation Practice\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		Thread.sleep(3000);
		WebElement click_btn = driver.findElement(By.xpath("li[@id='signInLink'])"));
		click_btn.click();
		WebElement mobile = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		mobile.sendKeys("12345");
		
		

	}

}
