package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FTRUserRegistrationPage extends GenericWrappers{
	
	public FTRUserRegistrationPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public FTRUserRegistrationPage enterUserId(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.UserId.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Password.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.ConfirmPassword.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage selectSecurityQuestion(int value) {
		selectIndexByXPath(prop.getProperty("FTRUserRegistrationPage.SecurityQuestion.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage enterSecurityAnswer(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.SecurityAnswer.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage clickOnDateOfBirthDropdown() {
		clickByXpath(prop.getProperty("FTRUserRegistrationPage.DobDropdown.XPath"));
		return this;
	}
	
	public FTRUserRegistrationPage selectDOBYear(String value) {
		selectVisibleTextByXPath(prop.getProperty("FTRUserRegistrationPage.DobYear.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage selectDOBMonth(String value) {
		selectVisibleTextByXPath(prop.getProperty("FTRUserRegistrationPage.DobMonth.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage clickOnDObDate(String date) {
		//clickByXpath(prop.getProperty("FTRUserRegistrationPage.DobDate.XPath"));
		clickByXpath("//a[text()='"+date+"']/parent::*");
		return this;
	}
	
	public FTRUserRegistrationPage clickOnGender(String value) {
		//clickByXpath(prop.getProperty("FTRUserRegistrationPage.Gender.XPath"));
		clickByXpath("//input[@name='gender'and@value='"+value+"']");
		return this;
	}
	
	public FTRUserRegistrationPage clickOnMarriageStatus(String value) {
		//clickByXpath(prop.getProperty("FTRUserRegistrationPage.MarriageStatus.XPath"));
		clickByXpath("//input[@name='maritalStatus' and @value='"+value+"']");
		return this;
	}
	
	public FTRUserRegistrationPage enterEmailId(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.EmailId.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage selectOccupation(String value) {
		selectVisibleTextByXPath(prop.getProperty("FTRUserRegistrationPage.Occupation.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.FirstName.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.MiddleName.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterLastName(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.LastName.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage selectNationality(String value) {
		selectVisibleTextByXPath(prop.getProperty("FTRUserRegistrationPage.Nationality.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage enterDoorNumber(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.DoorNumber.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterStreet(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Street.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterArea(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Area.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage selectCountry(int value) {
		selectIndexByXPath(prop.getProperty("FTRUserRegistrationPage.Country.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage enterMobile(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Mobile.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterPincode(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.Pincode.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage selectCity(String value) {
		selectVisibleTextByXPath(prop.getProperty("FTRUserRegistrationPage.City.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage selectState(String value) {
		selectVisibleTextByXPath(prop.getProperty("FTRUserRegistrationPage.State.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage selectPostOffice(int value) {
		selectIndexByXPath(prop.getProperty("FTRUserRegistrationPage.PostOffice.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage waitsec() {
		waitProperty(2000);
		return this;
	}
	
	public FTRUserRegistrationPage clickOnSameAsResAddress(String value) {
		//clickByXpath(prop.getProperty("FTRUserRegistrationPage.ResidentOfficeAddress.XPath"));
		clickByXpath("//input[@name='sameAddresses' and @value='"+value+"']");
		return this;
	}
	
	public FTRUserRegistrationPage enterOfficeDoorNo(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.OfficeDoorNumber.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterOfficeStreet(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.OfficeStreet.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterOfficeArea(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.OfficeArea.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage selectOfficeCountry(int value) {
		selectIndexByXPath(prop.getProperty("FTRUserRegistrationPage.OfficeCountry.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage enterOfficeMobile(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.OfficeMobile.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage enterOfficePincode(String data) {
		enterByXpath(prop.getProperty("FTRUserRegistrationPage.OfficePincode.XPath"), data);
		return this;
	}
	
	public FTRUserRegistrationPage selectOfficeCity(String value) {
		selectVisibleTextByXPath(prop.getProperty("FTRUserRegistrationPage.OfficeCity.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage selectOfficeState(String value) {
		selectVisibleTextByXPath(prop.getProperty("FTRUserRegistrationPage.OfficeState.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage selectOfficePostOffice(int value) {
		selectIndexByXPath(prop.getProperty("FTRUserRegistrationPage.OfficePostOffice.XPath"), value);
		return this;
	}
	
	public FTRUserRegistrationPage scrollDown() {
		PageDown();
		return this;
	}

}
