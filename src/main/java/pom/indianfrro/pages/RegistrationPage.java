package pom.indianfrro.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {
	
	public RegistrationPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public RegistrationPage enterUserId(String data) {
		enterByXpath(prop.getProperty("RegistrationPageind.UserId.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPageind.Password.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPageind.ConfirmPassword.XPath"), data);
		return this;
	}
	
	public RegistrationPage selectSecurityQuestion(int value) {
		selectIndexByXPath(prop.getProperty("RegistrationPageind.SecurityQuestion.XPath"), value);
		return this;
	}
	
	public RegistrationPage enterSecurityAnswer(String data) {
		enterByXpath(prop.getProperty("RegistrationPageind.SecurityAnswer.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterName(String data) {
		enterByXpath(prop.getProperty("RegistrationPageind.Name.XPath"), data);
		return this;
	}
	
	public RegistrationPage selectGender(String value) {
		selectVisibleTextByXPath(prop.getProperty("RegistrationPageind.gender.XPath"), value);
		return this;
	}
	
	public RegistrationPage enterDateOfBirth(String data) {
		enterByXpath(prop.getProperty("RegistrationPageind.DateOfBirth.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterDesignation(String data) {
		enterByXpath(prop.getProperty("RegistrationPageind.Destination.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterEmailId(String data) {
		enterByXpath(prop.getProperty("RegistrationPageind.EmailId.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterMobile(String data) {
		enterByXpath(prop.getProperty("RegistrationPageind.Mobile.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterPhone(String data) {
		enterByXpath(prop.getProperty("RegistrationPageind.Phone.XPath"), data);
		return this;
	}
	
	public RegistrationPage selectNationality(String value) {
		selectValueByXPath(prop.getProperty("RegistrationPageind.Nationality.XPath"), value);
		return this;
	}
	
	
	public RegistrationPage enterName1(String data) {
		enterByXpath(prop.getProperty("RegistrationPageind.EnterName.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterCapacity(String data) {
		enterByXpath(prop.getProperty("RegistrationPageind.Capacity.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterAddress(String data) {
		enterByXpath(prop.getProperty("RegistrationPageind.Address.XPath"), data);
		return this;
	}
	
	public RegistrationPage selectState(String value) {
		selectVisibleTextByXPath(prop.getProperty("RegistrationPageind.State.XPath"), value);
		return this;
	}
	
	public RegistrationPage selectCity(String value) {
		//waitProperty(1000);
		selectVisibleTextByXPath(prop.getProperty("RegistrationPageind.City.XPath"), value);
		return this;
	}
	
	public RegistrationPage selectAccommodationType(String value) {
		selectValueByXPath(prop.getProperty("RegistrationPageind.AccommodationType.XPath"), value);
		return this;
	}
	
	public RegistrationPage selectAccommodationRate(String value) {
		selectValueByXPath(prop.getProperty("RegistrationPageind.AccommodationRate.XPath"), value);
		return this;
	}
	
	public RegistrationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("RegistrationPageind.Email.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationPageind.MobileNumber.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterPhoneNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationPageind.PhoneNumber.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterPassengerName(String data) {
		//waitProperty(1000);
		enterByXpath(prop.getProperty("RegistrationPageind.PassengerName.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterPassengerAddress(String data) {
		enterByXpath(prop.getProperty("RegistrationPageind.PassengerAddress.Xpath"), data);
		return this;
	}
	
	public RegistrationPage selectPassengerState(String value) {
		selectValueByXPath(prop.getProperty("RegistrationPageind.PassengerState.XPath"), value);
		return this;
	}
	
	public RegistrationPage selectPassengerCity(String value) {
		//waitProperty(1000);
		selectValueByXPath(prop.getProperty("RegistrationPageind.PassengerCity.XPath"), value);
		return this;
	}
	
	public RegistrationPage enterPassengerEmailId(String data) {
		enterByXpath(prop.getProperty("RegistrationPageind.PassengerEmailId.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterPassengerPhone(String data) {
		enterByXpath(prop.getProperty("RegistrationPageind.PassengerPhone.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterPassengerMobile(String data) {
		enterByXpath(prop.getProperty("RegistrationPageind.PassengerMobile.XPath"), data);
		return this;
	}
	
	public RegistrationPage clickOnAdd() {
		clickByXpath(prop.getProperty("RegistrationPageind.ClickOnAdd.XPath"));
		return this;
	}
	
	
	
	
	
	
	
	

}
