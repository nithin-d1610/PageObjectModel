package pom.alert.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AlertPage extends GenericWrappers {
	
	public AlertPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public AlertPage enterdataInAlertBox(String text) {
		
		enterAlertText(text);
		return this; 
	}
	
	public AlertPage getAlertData() {
		getTextNoSnap();
		return this;
	}
	
	public FramePage acceptAlertBox() {
		acceptAlert();
		return new FramePage(driver,test);
	}
	
	public FramePage dismissAlertBox() {
		dismissAlert();
		return new FramePage(driver,test);
	}

}
