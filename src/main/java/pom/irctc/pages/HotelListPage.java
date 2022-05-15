package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelListPage extends GenericWrappers{
	
	public HotelListPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public HotelListPage switchWindow() {
		switchToLastWindow();
		return this;
	}
	
	public HotelListPage waitsec(int time) {
		waitProperty(time);
		return this;
	}
	
	
	public HotelDetailsPage clickOnFirstHotel()  {
		//waitProperty(3000);
		clickByXpath(prop.getProperty("HotelListPage.FirstHotel.XPath"));
		return new HotelDetailsPage(driver,test);
	}

}
