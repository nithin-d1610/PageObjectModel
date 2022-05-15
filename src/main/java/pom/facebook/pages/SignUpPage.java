package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SignUpPage extends GenericWrappers {
	
	public SignUpPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	
	public SignUpPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("SignUpPage.firstName.XPath"),data);
		return this;
	}
	
	public SignUpPage enterLastName(String data) {
		enterByXpath(prop.getProperty("SignUpPage.lastName.XPath"),data);
		return this;
	}
	
	public SignUpPage enterEmailId(String data) {
		enterByXpath(prop.getProperty("SignUpPage.Email.XPath"), data);
		return this;
	}
	
	public SignUpPage enterEmailIdConfirmation(String data) {
		enterByXpath(prop.getProperty("SignUpPage.ConfirmEmail.XPath"), data);
		return this;
	}
	
	public SignUpPage enterPassword(String data) {
		enterByXpath(prop.getProperty("SignUpPage.password.XPath"), data);
		return this;
	}
	
	public SignUpPage selectDOBDate(String value) {
		selectVisibleTextByXPath(prop.getProperty("SignUpPage.DobDate.XPath"), value);
		return this;
	}
	
	public SignUpPage selectDOBMonth(String value) {
		selectVisibleTextByXPath(prop.getProperty("SignUpPage.DobMonth.XPath"), value);
		return this;
	}
	
	public SignUpPage selectDOBYear(String value) {
		selectVisibleTextByXPath(prop.getProperty("SignUpPage.DobYear.XPath"), value);
		return this;
	}
	
	public SignUpPage clickOnGender(String value) {
		clickByXpath(prop.getProperty("SignUpPage.gender.XPath"));
		//clickByXpath("//label[text()='"+value+"']");
		return this;
	}
	
	
	
	
	

}
