package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.DataInPutProvider;


@Test
public class ProjectWrappers extends GenericWrappers{
	
	public String browserName;
	public String appName;
	
	public String sheetName;

	@BeforeSuite
	public void beforeSuite() {
		startReport();
	}
	
	@BeforeTest
	public void beforeTest() {
		loadObjects();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		startTest(testCaseName, testCaseDescription);
		invokeApp(browserName,appName);
	}
	
	@AfterMethod
	public void afterMethod() {
		closeAllBrowsers();
		
	}
	
	@AfterClass
	public void afterClass() {
		endTest();
	}
	
	@AfterTest
	public void afterTest() {
		UnloadObject();
	}
	
	@AfterSuite
	public void afterSuite() {
		endReport();
	}
	
	
	@DataProvider(name="fetchData")
	public String[][] getInputData(){
		return DataInPutProvider.getData(sheetName);
	}
	
	
	
	
	
	
	
	
}
