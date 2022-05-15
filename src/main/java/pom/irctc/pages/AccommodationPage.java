package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers{
	
	
	public AccommodationPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	
	public AccommodationPage switchWindow() {
		switchToLastWindow();
		return this;
	}
	
	public AccommodationPage clickOnMenuIcon() {
		clickByXpath(prop.getProperty("AccommodationPage.MenuIcon.XPath"));
		return this;
	}
	
	public FTRServicePage clickOnBookYourCoach() {
		clickByXpath(prop.getProperty("AccommodationPage.BookYourCoach.XPath"));
		return new FTRServicePage(driver,test);
	}
	
	public CharterPage ClickOnCharter() {
		clickByXpath(prop.getProperty("AccommodationPage.Charter.XPath"));
		return new CharterPage(driver,test);
		
	}
	public HotelPage clickOnHotelIcon() {
		clickByXpath(prop.getProperty("AccommodationPage.HotelIcon.XPath"));
		
		return new HotelPage(driver,test);
	}
}
