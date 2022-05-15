package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FTRServicePage extends GenericWrappers{
	
	
	public FTRServicePage(RemoteWebDriver driver,ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public FTRServicePage switchWindow() {
		switchToLastWindow();
		return this;
	}
	
	
	public FTRUserRegistrationPage clickOnSighUp() {
		clickByXpath(prop.getProperty("FTRServicePage.SignUp.XPath"));
		return new FTRUserRegistrationPage(driver,test);
	}

}
