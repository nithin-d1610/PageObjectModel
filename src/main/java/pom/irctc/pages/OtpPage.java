package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class OtpPage extends GenericWrappers{
	
	public OtpPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public OtpPage enterOtp(String data) {
		enterByXpath(prop.getProperty("OtpPage.Otp.XPath"), data);
		return this;
	}
	
	public OtpPage clickOnVerify() {
		clickByXpath(prop.getProperty("OtpPage.verify.XPath"));
		return this;
	}
	
	public OtpPage verifyOtpRequiredOrNot(String text) {
		verifyTextByXpath(prop.getProperty("OtpPage.VerifyOtprequiredOrNot.XPath"), text);
		return this;
	}
	
	
	
	

}
