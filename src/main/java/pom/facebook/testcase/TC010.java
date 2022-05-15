package pom.facebook.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.HomePage;
import wrappers.ProjectWrappers;


public class TC010 extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseName ="TC010";
		testCaseDescription ="facebook";
		author ="nithin";
		category="sanity";
		browserName="chrome";
		appName="https://www.facebook.com";
		sheetName="TC010";
		  
	}
	
	@Test(dataProvider="fetchData")
	public void facebook(String firstname,String lastname,String email,String Confrmemail, 
			String password, String day, String month, String year,String gender) {
		
		new HomePage(driver,test)
		.clickOnCreateNewAccount()
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.enterEmailId(email)
		.enterEmailIdConfirmation(Confrmemail)
		.enterPassword(password)
		.selectDOBDate(day)
		.selectDOBMonth(month)
		.selectDOBYear(year)
		.clickOnGender(gender)
		;
	}

}
