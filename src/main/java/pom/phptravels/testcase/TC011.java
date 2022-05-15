

package pom.phptravels.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		browserName="chrome";
		appName="https://www.phptravels.org";
		testCaseName="TC011";
		testCaseDescription="phpTravels";
		author="nithin";
		category="sanity";
		sheetName="TC011";
		
	}
	
	@Test(dataProvider="fetchData")
	public void phpTravels(String firstName,String lastName,String emailId,String phoneCode,String phone,
			String companyName,String street,String area,String city,String state,String pincode,
			String country,String mobile,String password,String confrmpassword) {
		
		new HomePage(driver,test)
		.clickOnRegister()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmailId(emailId)
		.clickOnMobileCodeDropdown()
		.clickOnCode(phoneCode)
		.enterMobileNumber(phone)
		.enterCompanyName(companyName)
		.enterStreet(street)
		.enterArea(area)
		.enterCity(city)
		.enterState(state)
		.enterPostCode(pincode)
		.selectCountry(country)
		.enterWhatsappMobile(mobile)
		.enterPassword(password)
		.enterConfirmPassword(confrmpassword)
		;
	}

}
