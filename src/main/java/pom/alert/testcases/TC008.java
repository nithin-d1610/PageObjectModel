package pom.alert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		browserName="chrome";
		appName="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
		author="nithin";
		category="smoke";
		testCaseName="TC008";
		testCaseDescription="confirmAlert";
		sheetName="TC008";
	}
		
	@Test(dataProvider="fetchData")
	public void confirmationAlert(String value,String value1) {
		
		new HomePage(driver,test)
		.waitsec(2000)
		.switchToFrame()
		.clickOnTryIt()
		.getAlertData()
		.acceptAlertBox()
		.verifyContainsText(value)
		.refreshPage()
		.waitsec(2000)
		.switchToFrame()
		.clickOnTryIt()
		.dismissAlertBox()
		.verifyContainsText(value1)
		.switchToHomePage()
		.ClickOnHomeIcon()
		;
	}

}
