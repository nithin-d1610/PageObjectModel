package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public HomePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public RegistrationPage clickOnRegister() {
		clickByXpath(prop.getProperty("HomePage.Register.XPath"));
		return new RegistrationPage(driver,test);
	}
	
	public HomePage waitsec(int time) {
		waitProperty(time);
		return this;
	}
	
	public HomePage MouseHoverholidays() {
		mouseHoverByXPath(prop.getProperty("HomePage.Holiday.XPath"));
		return this;
	}
	
	public HomePage MouseHoverstay() {
		mouseHoverByXPath(prop.getProperty("HomePage.Stay.XPath"));
		return this;
	}
	
	public AccommodationPage ClickOnlounge() {
		clickByXpath(prop.getProperty("HomePage.Lounge.XPath"));
		return new AccommodationPage(driver,test);
	}

}
