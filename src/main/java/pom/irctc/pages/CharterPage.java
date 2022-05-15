package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{
	
	public CharterPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public CharterPage clickOnCloseMenu() {
		clickByXpath(prop.getProperty("CharterPage.CloseMenu.XPath"));
		return this;
	}
	
	public EnquiryFormPage clickOnEnquiryForm() {
		clickByXpath(prop.getProperty("CharterPage.EnquiryForm.XPath"));
		return new EnquiryFormPage(driver,test);
	}
	
	
}
