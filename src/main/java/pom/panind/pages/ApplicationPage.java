package pom.panind.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class ApplicationPage extends GenericWrappers{
	
	public ApplicationPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public ApplicationPage selectTitle(int value) {
		selectIndexByXPath(prop.getProperty("ApplicationPage.title.XPath"), value);
		return this;
	}
	
	public ApplicationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("ApplicationPage.FirstName.XPath"), data);
		return this;
	}
	
	public ApplicationPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("ApplicationPage.MiddleName.XPath"), data);
		return this;
	}
	
	public ApplicationPage enterLastName(String data) {
		enterByXpath(prop.getProperty("ApplicationPage.LastName.XPath"), data);
		return this;
	}
	
	public ApplicationPage enterFatherFirstName(String data) {
		enterByXpath(prop.getProperty("ApplicationPage.FatherFirstName.XPath"), data);
		return this;
	}
	
	public ApplicationPage enterFatherMiddleName(String data) {
		enterByXpath(prop.getProperty("ApplicationPage.FatherMiddleName.XPath"), data);
		return this;
	}
	
	public ApplicationPage enterFatherLastName(String data) {
		enterByXpath(prop.getProperty("ApplicationPage.FatherLastName.XPath"), data);
		return this;
	}
	
	
	public ApplicationPage enterMobile(String data) {
		enterByXpath(prop.getProperty("ApplicationPage.Mobile.XPath"), data);
		return this;
	}
	
	
	public ApplicationPage enterEmaiId(String data) {
		enterByXpath(prop.getProperty("ApplicationPage.EmailId.XPath"), data);
		return this;
	}
	
	public ApplicationPage selectSourceOfIncome(String value) {
		selectVisibleTextByXPath(prop.getProperty("ApplicationPage.Income.XPath"), value);
		return this;
	}
	
	public ApplicationPage clickOnAddressForCommunication(String value) {
		//clickByXpath(prop.getProperty("ApplicationPage.AddressForCommunication.XPath"));
		clickByXpath("//input[@id='"+value+"']");
		return this;
	}
	
	public ApplicationPage enterDateOfBirth(String data) {
		enterByXpath(prop.getProperty("ApplicationPage.DateOfBirth.XPath"), data);
		return this;
	}
	
	public ApplicationPage scrollDown() {
		PageDown();
		return this;
	}
	
	public ApplicationPage enterResDoorNo(String data) {
		enterByXpath(prop.getProperty("ApplicationPage.ResDoorNumber.XPath"), data);
		return this;
	}
	
	public ApplicationPage enterResAreaStreet(String data) {
		enterByXpath(prop.getProperty("ApplicationPage.ResArea.XPath"), data);
		return this;
	}
	
	public ApplicationPage enterResCity(String data) {
		enterByXpath(prop.getProperty("ApplicationPage.ResCity.XPath"), data);
		return this;
	}
	
	public ApplicationPage selectResState(String value) {
		selectVisibleTextByXPath(prop.getProperty("ApplicationPage.ResState.XPath"), value);
		return this;
	}
	
	public ApplicationPage enterResPincode(String data) {
		enterByXpath(prop.getProperty("ApplicationPage.ResPincode.XPath"), data);
		return this;
	}
	
	public ApplicationPage selectResCountry(String value) {
		selectVisibleTextByXPath(prop.getProperty("ApplicationPage.ResCountry.XPath"), value);
		return this;
	}
	
	public ApplicationPage enterOffName(String data) {
		enterByXpath(prop.getProperty("ApplicationPage.OfficeName.XPath"), data);
		return this;
	}
	
	public ApplicationPage enterOffDoorNo(String data) {
		enterByXpath(prop.getProperty("ApplicationPage.OffDoorNumber.XPath"), data);
		return this;
	}
	
	public ApplicationPage enterOffAreaStreet(String data) {
		enterByXpath(prop.getProperty("ApplicationPage.OffArea.XPath"), data);
		return this;
	}
	
	public ApplicationPage enterOffCity(String data) {
		enterByXpath(prop.getProperty("ApplicationPage.OffCity.XPath"), data);
		return this;
	}
	
	public ApplicationPage selectOffState(String value) {
		selectVisibleTextByXPath(prop.getProperty("ApplicationPage.OffState.XPath"), value);
		return this;
	}
	
	public ApplicationPage enterOffPincode(String data) {
		enterByXpath(prop.getProperty("ApplicationPage.OffPincode.XPath"), data);
		return this;
	}
	
	public ApplicationPage selectOffCountry(String value) {
		selectVisibleTextByXPath(prop.getProperty("ApplicationPage.OffCountry.XPath"), value);
		return this;
	}
	

	
	public ApplicationPage SelectIdentityProof(int value) {
		selectIndexByXPath(prop.getProperty("ApplicationPage.IdentityProof.XPath"), value);
		return this;
	}
	
	public ApplicationPage SelectAddressProof(int value) {
		selectIndexByXPath(prop.getProperty("ApplicationPage.AddressProof.XPath"), value);
		return this;
	}
	
	public ApplicationPage SelectDOBProof(int value) {
		selectIndexByXPath(prop.getProperty("ApplicationPage.DobProof.XPath"), value);
		return this;
	}
	
	public ApplicationPage SelectAadharProof(int value) {
		selectIndexByXPath(prop.getProperty("ApplicationPage.AadharProof.XPath"), value);
		return this;
	}
	
	public ApplicationPage SelectOfficeAddressProof(int value) {
		selectIndexByXPath(prop.getProperty("ApplicationPage.OffAddressProof.XPath"), value);
		return this;
	}
	
	public ApplicationPage clickOnAgreeTerms() {
		clickByXpath(prop.getProperty("ApplicationPage.AgreeTerms.XPath"));
		return this;
	}

}
