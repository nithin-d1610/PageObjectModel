package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PersonelDetailspage extends GenericWrappers{
	
	public PersonelDetailspage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
	}
	
	public PersonelDetailspage switchWindow() {
		switchToLastWindow();
		return this;
	}
	
	public PersonelDetailspage selectTitle(int value) {
		selectIndexByXPath(prop.getProperty("PersonelDetailsPage.Title.XPath"), value);
		return this;
	}
	
	public PersonelDetailspage enterFirstName(String data) {
		enterByXpath(prop.getProperty("PersonelDetailsPage.FirstName.XPath"), data);
		return this;
	}
	
	public PersonelDetailspage enterLastName(String data) {
		enterByXpath(prop.getProperty("PersonelDetailsPage.LastName.XPath"), data);
		return this;
	}
	
	public PersonelDetailspage selectCountry(String value) {
		selectVisibleTextByXPath(prop.getProperty("PersonelDetailsPage.Country.XPath"), value);
		return this;
	}
	
	public PersonelDetailspage selectState(String value) {
		selectVisibleTextByXPath(prop.getProperty("PersonelDetailsPage.State.XPath"), value);
		return this;
	}
	
	public PersonelDetailspage enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("PersonelDetailsPage.Mobile.XPath"), data);
		return this;
	}
	
	public PersonelDetailspage enterEmailId(String data) {
		enterByXpath(prop.getProperty("PersonelDetailsPage.EmailId.XPath"), data);
		return this;
	}
	
	public PersonelDetailspage selectGst(String value) {
		selectValueByXPath(prop.getProperty("PersonelDetailsPage.Gst.XPath"), value);
		return this;
	}
	
	public PersonelDetailspage enterGstNumber(String data) {
		enterByXpath(prop.getProperty("PersonelDetailsPage.GstNumber.XPath"), data);
		return this;
	}
	
	public PersonelDetailspage enterCompanyName(String data) {
		enterByXpath(prop.getProperty("PersonelDetailsPage.CompanyName.XPath"), data);
		return this;
	}
	
	public PersonelDetailspage enterCompanyAddress(String data) {
		enterByXpath(prop.getProperty("PersonelDetailsPage.CompanyAddress.XPath"), data);
		return this;
	}
	
	public PersonelDetailspage verifyHotelName() {
		String expectedHotelName = HotelDetailsPage.hotelName;
		verifyTextByXpath(prop.getProperty("PersonelDetailsPage.VerifyHotelName.XPath"), expectedHotelName );
		return this;
	}
	
	public PersonelDetailspage verifyHotelPrice() {
		
		verifyTextByXpath(prop.getProperty("PersonelDetailsPage.VerifyHotelPrice.XPath"), HotelDetailsPage.hotelPrice);
		return this;
	}
	
	public PersonelDetailspage clickOnContinue() {
		
		clickByXpath(prop.getProperty("PersonelDetailsPage.Continue.XPath"));
		return this;
	}
	public PersonelDetailspage clickOnAgreeTerms() {
		clickByXpath(prop.getProperty("PersonelDetailsPage.AgreeTerms.XPath"));
		return this;
	}
	
	public OtpPage clickOnMakePayment() {
		clickByXpath(prop.getProperty("PersonelDetailsPage.MakePayment.XPath"));
		return new OtpPage(driver,test);
	}
	
	public PersonelDetailspage verifyGstRequired(String text) {
		verifyTextByXpath(prop.getProperty("PersonelDetailsPage.VerifyGstRequired.XPath"), text);
		return this;
	}

	public PersonelDetailspage scrollDown() {
		PageDown();
		return this;
	}
	
	public PersonelDetailspage waitsec(int time) {
		waitProperty(time);
		return this;
	}
}
