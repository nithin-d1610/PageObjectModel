package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public SignUpPage clickOnCreateNewAccount() {
		clickByXpath(prop.getProperty("HomePage.CreateNewAccount.XPath"));
		return new SignUpPage(driver,test);
	}

}
