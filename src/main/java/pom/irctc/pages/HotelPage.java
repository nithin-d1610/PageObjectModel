package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelPage extends GenericWrappers{
	
	public HotelPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public HotelPage switchWindow() {
		switchToLastWindow();
		return this;
		
	}
	public LoginPage clickOnLogin() {
		clickByXpath(prop.getProperty("HotelPage.Login.XPath"));
		return new LoginPage(driver,test);
	}
	
	public HotelPage EnterCityOrHotelName(String data) {
		enterByXpath(prop.getProperty("HotelPage.CityOrHotelName.XPath"), data);
		return this;
	}
	
	public HotelPage clickOnRequiredHotelName(String value) {
		waitProperty(2000);
		//clickByXpath(prop.getProperty("HotelPage.RequiredHotelName.XPath"));
		clickByXpath("//span[text()='"+value+"']/..");
		return this;
	}
	
	public HotelPage clickOnCheckIn() {
		clickByXpath(prop.getProperty("HotelPage.CheckIn.XPath"));
		return this;
	}
	
	public HotelPage clickOnCheckInDateDropdown() {
		waitProperty(1000);
		clickByXpath(prop.getProperty("HotelPage.CheckInDateDropdown.XPath"));
		return this;
	}
	
	public HotelPage clickOnCheckInDateYear(String year) {
		waitProperty(1000);
		//clickByXpath(prop.getProperty("HotelPage.CheckInDateYear.XPath"));
		clickByXpath("//span[text()='"+year+"']");
		return this;
	}
	
	public HotelPage clickOnCheckInDateMonth(String month) {
		//clickByXpath(prop.getProperty("HotelPage.CheckInDateMonth.XPath"));
		clickByXpath("//span[text()='"+month+"']");
		return this;
	}
	
	public HotelPage clickOnCheckInDate(String date) {
		//clickByXpath(prop.getProperty("HotelPage.CheckInDate.XPath"));
		clickByXpath("//span[text()='"+date+"']");
		return this;
	}
	
	public HotelPage clickOnCheckOut() {
	
		clickByXpath(prop.getProperty("HotelPage.CheckOut.XPath"));
		return this;
	}
	
	public HotelPage clickOnCheckOutDropdown() {
		waitProperty(2000);
		clickByXpath(prop.getProperty("HotelPage.CheckOutDateDropdown.XPath"));
		return this;
	}
	
	public HotelPage clickOnCheckOutYear(String year) {
		clickByXpath("//span[text()='"+year+"']");
		//clickByXpath(prop.getProperty("HotelPage.CheckOutDateYear.XPath"));
		return this;
	}
	
	public HotelPage clickOnCheckOutMonth(String month) {
		clickByXpath("//span[text()='"+month+"']");
		//clickByXpath(prop.getProperty("HotelPage.CheckOutDateMonth.XPath"));
		return this;
	}
	
	public HotelPage clickOnCheckOutDate(String date) {
		//clickByXpath(prop.getProperty("HotelPage.CheckOutDate.XPath"));
		clickByXpath("//span[text()='"+date+"']");
		return this;
	}
	
	public HotelPage clickOnNumberOfRoomAndGuest() {
		clickByXpath(prop.getProperty("HotelPage.NumberOfroomAndguest.XPath"));
		return this;
	}
	
	public HotelPage selectNoOfRoom(String value) {
		selectValueByXPath(prop.getProperty("HotelPage.Rooms.Xpath"), value);
		return this;
	}
	
	public HotelPage selectNoOfGuest(String value) {
		selectValueByXPath(prop.getProperty("HotelPage.Guests.XPath"), value);
		return this;
	}
	
	public HotelPage clickOnDone() {
		clickByXpath(prop.getProperty("HotelPage.Done.XPath"));
		return this;
	}
	
	public HotelListPage clickOnFindHotel() {
		clickByXpath(prop.getProperty("HotelPage.FindHotel.XPath"));
		return new HotelListPage(driver,test);
	}
	
}
