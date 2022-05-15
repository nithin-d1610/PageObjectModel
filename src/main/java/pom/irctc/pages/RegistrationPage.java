package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public RegistrationPage waitsec() {
		waitProperty(2000);
		return this;
	}
	
	public RegistrationPage enterUserName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.UserName.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Password.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.ConfirmPassword.XPath"), data);
		return this;
	}
	
	public RegistrationPage clickOnPrefferedLanguageDropdown() {
		clickByXpath(prop.getProperty("RegistrationPage.LanguageDropdown.XPath"));
		return this;
	}
	
	public RegistrationPage clickOnLanguage(String value) {
		//clickByXpath(prop.getProperty("RegistrationPage.Language.XPath"));
		clickByXpath("//span[text()='"+value+"']/parent::li");
		return this;
	}
	
	public RegistrationPage clickOnSecQuestionDropdown() {
		clickByXpath(prop.getProperty("RegistrationPage.SecurityQuestionDropdown.XPath"));
		return this;
	}
	
	public RegistrationPage clickOnSecQuestionOption(String option) {
		//clickByXpath(prop.getProperty("RegistrationPage.SecurityQuestion.XPath"));
		clickByXpath("//*[text()='"+option+"']/parent::li");
		return this;
	}
	
	public RegistrationPage enterSecAnswer(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.SecurityAnswer.XPath"), data);
		return this;
	}
	
	public RegistrationPage ClickOnContinue() {
		clickByXpath(prop.getProperty("RegistrationPage.Continue.XPath"));
		return this;
	}
	
	public RegistrationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.FirstName.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Middlename.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterLastName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Lastname.XPath"), data);
		return this;
	}
	
	public RegistrationPage ClickOnOccupationDropdown() {
		clickByXpath(prop.getProperty("RegistrationPage.OccupationDropdown.XPath"));
		return this;
	}
	
	public RegistrationPage ClickOnOccupationOption(String option) {
		//clickByXpath(prop.getProperty("RegistrationPage.Occupation.XPath"));
		clickByXpath("//span[text()='"+option+"']/parent::*");
		return this;
	}
	
	public RegistrationPage ClickOnDateOfBirthDropdown() {
		clickByXpath(prop.getProperty("RegistrationPage.DateofBirthDropdown.XPath"));
		return this;
	}
	
	public RegistrationPage selectYear(String value) {
		selectVisibleTextByXPath(prop.getProperty("RegistrationPage.Year.XPath"), value);
		return this;
	}
	
	public RegistrationPage selectMonth(String value) {
		selectVisibleTextByXPath(prop.getProperty("RegistrationPage.Month.XPath"), value);
		return this;
	}
	
	public RegistrationPage selectDate(String date) {
		//clickByXpath(prop.getProperty("RegistrationPage.Date.XPath"));
		clickByXpath("//a[text()='"+date+"']");
		return this;
	}
	
	public RegistrationPage clickOnMarriageStatus(String value) {
		//clickByXpath(prop.getProperty("RegistrationPage.MarriageStatus.XPath"));
		clickByXpath("//label[text()='"+value+"']");
		return this;
	}
	
	public RegistrationPage selectCountry(String value) {
		selectVisibleTextByXPath(prop.getProperty("RegistrationPage.Country.XPath"), value);
		return this;
	}
	
	public RegistrationPage clickOnGender(String value) {
		//clickByXpath(prop.getProperty("RegistrationPage.Gender.XPath"));
		clickByXpath("//span[text()='"+value+"']");
		return this;
	}
	
	public RegistrationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Email.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Mobile.XPath"), data);
		return this;
	}
	
	public RegistrationPage selectNationality(String value) {
		selectVisibleTextByXPath(prop.getProperty("RegistrationPage.Nationality.XPath"), value);
		return this;
	}
	
	public RegistrationPage enterDoorNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.DoorNumber.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterStreetName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Street.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterAreaName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Area.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterPincode(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Pincode.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterStateName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.State.XPath"), data);
		return this;
	}
	
	public RegistrationPage selectCity(String value) {
		selectVisibleTextByXPath(prop.getProperty("RegistrationPage.City.XPath"), value);
		return this;
	}
	
	public RegistrationPage selectPostOffice(String value) {
		selectVisibleTextByXPath(prop.getProperty("RegistrationPage.PostOffice.XPath"), value);
		return this;
	}
	
	public RegistrationPage enterPhoneNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Phone.XPath"), data);
		return this;
	}
	
	public RegistrationPage clickCopyResAddrressToOffice(String value) {
		//clickByXpath(prop.getProperty("RegistrationPage.ResidentOfficeAddress.XPath"));
		clickByXpath("//label[text()='"+value+"']");
		return this;
	}
	
	public RegistrationPage enterOfficeDoorNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeDoorNumber.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterOfficeStreetName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeStreet.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterOfficeAreaName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficeArea.XPath"), data);
		return this;
	}
	
	public RegistrationPage clickOnOffCountryDropdown() {
		clickByXpath(prop.getProperty("RegistrationPage.OfficeCountryDropdown.XPath"));
		return this;
	}
	 public RegistrationPage clickOnOffCountryoption(String option) {
		 //clickByXpath(prop.getProperty("RegistrationPage.OfficeCountry.XPath"));
		 clickByXpath("//span[text()='"+option+"']/parent::*");
		 return this;
	 }
	
	public RegistrationPage enterOfficePincode(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OfficePincode.XPath"), data);
		return this;
	}
	 
	 public RegistrationPage enterOfficeState(String data) {
		 enterByXpath(prop.getProperty("RegistrationPage.OfficeState.XPath"), data);
		 return this;
	 }
	 
	 public RegistrationPage enterOfficeCity(String data) {
		 enterByXpath(prop.getProperty("RegistrationPage.OfficeCity.XPath"), data);
		 return this;
	 }
	 
	 public RegistrationPage enterOfficePostOffice(String data) {
		 enterByXpath(prop.getProperty("RegistrationPage.OfficePostOffice.XPath"), data);
		 return this;
	 }
	 
	 public RegistrationPage enterOfficePhone(String data) {
		 enterByXpath(prop.getProperty("RegistrationPage.OfficePhone.XPath"), data);
		 return this;
	 }
	 
	 public RegistrationPage scrollDown() {
		 PageDown();
		 return this;
	 }
	
	 public RegistrationPage ClickOnAgreeTerms() {
		 clickByXpath(prop.getProperty("RegistrationPage.AgreeTerms.XPath"));
		 return this;
	 }
	
	
	
	

}
