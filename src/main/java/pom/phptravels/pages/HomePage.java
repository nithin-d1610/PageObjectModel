package pom.phptravels.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public HomePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	
	
	public RegisterPage clickOnRegister() {
		clickByXpath(prop.getProperty("HomePage.Register.XPath"));
		return new RegisterPage(driver,test);
	}

}
