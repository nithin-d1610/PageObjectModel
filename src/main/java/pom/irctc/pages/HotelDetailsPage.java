package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelDetailsPage extends GenericWrappers {
	
	public static String hotelName;
	public static String hotelPrice;
	
	public HotelDetailsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;	
	}
	
	public HotelDetailsPage getHotelName() {
		
		hotelName=getTextByXpath(prop.getProperty("HotelDetailsPage.GetHotelName.XPath"));
		System.out.println(hotelName);
		return this;
	}
	
	public HotelDetailsPage getHotelPrice() {
		hotelPrice=getTextByXpath(prop.getProperty("HotelDetailsPage.GetHotelPrice.XPath"));
		return this;
	}
	
	public PersonelDetailspage clickOnContinueToBook() {
		clickByXpath(prop.getProperty("HotelDetailsPage.ContinueToBook.XPath"));
		return new PersonelDetailspage(driver,test);
	}
	
	public HotelDetailsPage switchWindow() {
		switchToLastWindow();
		return this;
	}
	
}
