package pom.facebook.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.HomePage;
import wrappers.ProjectWrappers;

public class facebook extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseName ="TC010";
		testCaseDescription ="facebook";
		author ="nithin";
		category="sanity";
		browserName="chrome";
		appName="https://www.facebook.com";

		  
	}
	
		@Test
		public void fc() {
		new HomePage(driver,test)
		.clickOnCreateNewAccount()
		.enterFirstName("nithin")
		.enterLastName("kumar")
		.enterEmailId("nithin@gmail.com")
		.enterEmailIdConfirmation("nithin@gmail.com")
		.enterPassword("nit1610")
		.selectDOBDate("10")
		.selectDOBMonth("Apr")
		.selectDOBYear("1995")
		.clickOnGender("Male")
		;

	}

}
