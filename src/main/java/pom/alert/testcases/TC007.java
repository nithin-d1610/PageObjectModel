package pom.alert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		browserName="chrome";
		appName="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		category="smoke";
		author="nithin";
		testCaseName="TC007";
		testCaseDescription="PromptAlert";
		sheetName="TC007";
		
	}
	
	@Test(dataProvider="fetchData")
	public void promptAlert(String name, String expectedName, String name1, String expectedName1) {
		new HomePage(driver,test)
		.waitsec(2000)
		.switchToFrame()
		.clickOnTryIt()
		.enterdataInAlertBox(name)
		.acceptAlertBox()
		.verifyContainsText(expectedName)
		.refreshPage()
		.waitsec(2000)
		.switchToFrame()
		.clickOnTryIt()
		.enterdataInAlertBox(name1)
		.dismissAlertBox()
		.verifyContainsText(expectedName1)
		.switchToHomePage()
		.ClickOnHomeIcon()
		;
		
	}

}
