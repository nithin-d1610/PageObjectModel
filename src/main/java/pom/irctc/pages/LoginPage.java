package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers{
	
	public LoginPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public LoginPage clickOnGuestUserLogin() {
		clickByXpath(prop.getProperty("LoginPage.GuestUserLogin.XPath"));
		return this;
	}
	
	public LoginPage enterEmailId(String data) {
		enterByXpath(prop.getProperty("LoginPage.EmailId.XPath"), data);
		return this;
	}
	
	public LoginPage enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("LoginPage.Mobile.XPath"), data);
		return this;
	}
	
	public HotelPage clickOnLogin() {
		clickByXpath(prop.getProperty("LoginPage.Login.XPath"));
		return new HotelPage(driver,test);
	}
	

}
