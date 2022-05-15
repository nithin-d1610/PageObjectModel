package pom.alert.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FramePage extends GenericWrappers{
	
	public FramePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public AlertPage clickOnTryIt() {
		
		clickByXpathNoSnap(prop.getProperty("FramePage.clickOnTryIt.XPath"));
		return new AlertPage(driver,test);
	}
	
	public FramePage verifyContainsText(String text) {
		verifyTextContainsByXpath(prop.getProperty("FramePage.verifytextContains.XPath"), text);
		return this;
	}
	
	public HomePage refreshPage() {
		refresh();
		return new HomePage(driver,test);
	}
	
	public FramePage waitsec(int time) {
		waitProperty(time);
		return this;
	}
	
	public HomePage switchToHomePage() {
		defaultContent();
		return new HomePage(driver,test);
	}
	
	
}
