package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class EnquiryFormPage extends GenericWrappers{
	
	public EnquiryFormPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public EnquiryFormPage enterApplicantName(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.ApplicantName.XPath"), data);
		return this;
	}
	
	public EnquiryFormPage enterOrganizationName(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Organization.XPath"), data);
		return this;
	}
	
	public EnquiryFormPage enterAddress(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Address.XPath"), data);
		return this;
	}
	
	public EnquiryFormPage enterMobile(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Mobile.XPath"), data);
		return this;
	}
	
	public EnquiryFormPage enterEmail(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.EmailId.XPath"), data);
		return this;
	}
	
	public EnquiryFormPage selectSaloonCharter(int value) {
		selectIndexByXPath(prop.getProperty("EnquiryFormPage.SaloonCharter.XPath"), value);
		return this;
	}
	
	public EnquiryFormPage enterOriginatingStation(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.OriginatingStation.XPath"), data);
		return this;
	}
	
	public EnquiryFormPage enterDestinationStation(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.DestinationStation.XPath"), data);
		return this;
	}
	
	public EnquiryFormPage clickOnDateOfDepartureDropdown() {
		clickByXpath(prop.getProperty("EnquiryFormPage.DepartureDropdown.XPath"));
		return this;
	}
	
	public EnquiryFormPage selectOnDepartureYear(String year) {
		selectVisibleTextByXPath(prop.getProperty("EnquiryFormPage.DepartureYear.XPath"), year);
		return this;
	}
	public EnquiryFormPage clickOnDepartureMonth(String month) {
		
		whileLoop(prop.getProperty("EnquiryFormPage.DepartureMonth.XPath"), prop.getProperty("EnquiryFormPage.GetTextDepartureMonth.XPath"), month);
		return this;
	}
	
	public EnquiryFormPage clickOnDepartureDate(String date) {
		//clickByXpath(prop.getProperty("EnquiryFormPage.DepartureDate.XPath"));
		clickByXpath("(//span[text()='"+date+"'])[1]");
		return this;
	}
	
	public EnquiryFormPage clickOnDateOfArrivalDropdown() {
		clickByXpath(prop.getProperty("EnquiryFormPage.ArrivalDropdown.XPath"));
		return this;
	}
	
	public EnquiryFormPage selectOnArrivalYear(String value) {
		selectVisibleTextByXPath(prop.getProperty("EnquiryFormPage.ArrivalYear.XPath"), value);
		return this;
	}
	
	public EnquiryFormPage clickOnArrivalMonth(String month) {
		whileLoop(prop.getProperty("EnquiryFormPage.ArrivalMonth.XPath"), prop.getProperty("EnquiryFormPage.GetTextArrivalMonth.XPath"), month);
		//clickByXpath("(//*[@class='fa fa-angle-right']/parent::span)[2]");
		return this;
	}
	
	public EnquiryFormPage clickOnArrivalDate(String date) {
		//clickByXpath(prop.getProperty("EnquiryFormPage.ArrivalDate.XPath"));
		clickByXpath("(//span[text()='"+date+"'])[2]");
		return this;
	}
	
	public EnquiryFormPage enterDurationOfTour(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Duration.XPath"), data);
		return this;
	}
	
	public EnquiryFormPage enterCoachDetails(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Coachdetails.XPath"), data);
		return this;
	}
	
	public EnquiryFormPage enterNumberOfPassengers(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.NumberOfPassengers.XPath"), data);
		return this;
	}
	
	public EnquiryFormPage enterPurposeOfCharter(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.Purpose.XPath"), data);
		return this;
	}
	
	public EnquiryFormPage enterServicesRequired(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.ServiceRequired.XPath"), data);
		return this;
	}
	
	public EnquiryFormPage clickOnSubmit() {
		clickByXpath(prop.getProperty("EnquiryFormPage.Submit.XPath"));
		return this;
	}
	
	public EnquiryFormPage verifyMobileNo(String text) {
		verifyTextContainsByXpath(prop.getProperty("EnquiryFormPage.verifyMobileNumber.XPath"), text);
		return this;
	}
	

}
