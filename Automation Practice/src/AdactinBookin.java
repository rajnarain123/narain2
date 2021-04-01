import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

import Pom.Login;
import pom1.Webele;

public class AdactinBookin extends base1{
    public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException   {
		driver=browserLaunch("Chrome");
		geturl("https://adactinhotelapp.com/HotelAppBuild2/");
		

		
		  Login lp= new Login(driver); 
		  Thread.sleep(4000);
		 sendkeys(lp.getUsername(), "SowmiyaSri");
		sendkeys(lp.getPassword(), "Sowmiya05");
		click2(lp.getLogin());
		Thread.sleep(3000);
		
		Webele we= new Webele(driver);
		dropDown(we.getLocation(),"Value", "Melbourne");
	dropDown(we.getHotels(), "Value", "Hotel SunShine");
		dropDown(we.getRoom_nos(), "Value", "Super Deleuxe");
		dropDown(we.getRoom_nos(), "Value", "2");
		elementClear(we.getDatepick_in());
		sendkeys(we.getDatepick_in(), "25/02/2021");
		elementClear(we.getDatepick_in());
		sendkeyz(we.getDatepick_out(), "28/02/2021");
		dropDown(we.getAdult_room(), "value", "2") ;
		dropDown(we.getChild_room(), "Value", "0");
		elementClear(we.getDriver());
		Thread.sleep(3000);
		
	
		

	

}
	private static void sendkeys(WebElement datepick_in, String string) {
		// TODO Auto-generated method stub
		
	}
	private static void elementClear(WebElement datepick_in) {
		// TODO Auto-generated method stub
		
	}
	private static void elementClear(WebDriver webDriver) {
		// TODO Auto-generated method stub
		
	}
	private static void dropDown(WebElement location, String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	}

	