package pom.alert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		browserName="chrome";
		appName="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		category="smoke";
		author="nithin";
		testCaseName="TC009";
		testCaseDescription="simpleAlert";
		
	}
	
	@Test
	public void simpleAlert() {
		
		new HomePage(driver,test)
		.waitsec(2000)
		.switchToFrame()
		.clickOnTryIt()
		.getAlertData()
		.acceptAlertBox()
		.switchToHomePage()
		.ClickOnHomeIcon()
		;
	}

}
