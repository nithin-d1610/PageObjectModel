package pom.indianfrro.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public HomePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public RegistrationPage clickOnSignUpregistration() {
		clickByXpath(prop.getProperty("HomePageind.SignUpRegistration.XPath"));
		return new RegistrationPage(driver,test);
	}

}
