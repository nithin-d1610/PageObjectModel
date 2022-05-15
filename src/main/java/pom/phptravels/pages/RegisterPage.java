package pom.phptravels.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegisterPage extends GenericWrappers {
	
	public RegisterPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public RegisterPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("RegisterPage.FirstName.XPath"), data);
		return this;
	}
	
	public RegisterPage enterLastName(String data) {
		enterByXpath(prop.getProperty("RegisterPage.LastName.XPath"), data);
		return this;
	}
	
	public RegisterPage enterEmailId(String data) {
		enterByXpath(prop.getProperty("RegisterPage.EmailId.XPath"), data);
		return this;
	}
	
	public RegisterPage clickOnMobileCodeDropdown() {
		clickByXpath(prop.getProperty("RegisterPage.MobileCodeDropdown.XPath"));
		return this;
	}
	
	public RegisterPage clickOnCode(String value) {
		//clickByXpath(prop.getProperty("RegisterPage.MobileCode.XPath"));
		clickByXpath("//span[starts-with(text(),'"+value+"')]/..");
		return this;
	}
	
	public RegisterPage enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("RegisterPage.MobileNumber.XPath"), data);
		return this;
	}
	
	public RegisterPage enterCompanyName(String data) {
		enterByXpath(prop.getProperty("RegisterPage.CompanyName.XPath"), data);
		return this;
	}
	
	public RegisterPage enterStreet(String data) {
		enterByXpath(prop.getProperty("RegisterPage.Street.XPath"), data);
		return this;
	}
	
	public RegisterPage enterArea(String data) {
		enterByXpath(prop.getProperty("RegisterPage.Area.XPath"), data);
		return this;
	}
	
	public RegisterPage enterCity(String data) {
		enterByXpath(prop.getProperty("RegisterPage.City.XPath"), data);
		return this;
	}
	
	public RegisterPage enterState(String data) {
		enterByXpath(prop.getProperty("RegisterPage.State.XPath"), data);
		return this;
	}
	
	public RegisterPage enterPostCode(String data) {
		enterByXpath(prop.getProperty("RegisterPage.Postcode.XPath"), data);
		return this;
	}
	
	public RegisterPage selectCountry(String value) {
		selectVisibleTextByXPath(prop.getProperty("RegisterPage.Country.XPath"), value);
		return this;
	}
	
	public RegisterPage enterWhatsappMobile(String data) {
		enterByXpath(prop.getProperty("RegisterPage.WhatsappMobile.XPath"), data);
		return this;
	}
	
	public RegisterPage enterPassword(String data) {
		enterByXpath(prop.getProperty("RegisterPage.Password.XPath"), data);
		return this;
	}
	
	public RegisterPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("RegisterPage.ConfirmPassword.XPath"), data);
		return this;
	}

}
