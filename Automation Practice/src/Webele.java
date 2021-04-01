import org.openqa.selenium.WebDriver;

public class Webele {
	public static WebDriver driver;

}
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