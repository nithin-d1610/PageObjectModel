package pom.indianfrro.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.indianfrro.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		browserName="chrome";
		appName="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		author="nithin";
		category="sanity";
		testCaseName="TC006";
		testCaseDescription="FormC";
		sheetName="TC006";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void formC(String id,String password,String confrmPassword,String question,String answer,String name,String gender,String dateOfBirth,
			String designation,String emailId,String mobile,String  phone,String nationality,String oname,String capacity,String dNo,String state,
			String district,String accType,String starRating,String email,String mcontact,String contact,String name1,String dNo1,String state1,
			String District1,String Email1,String Phone1,String Mobile1,String name2,String dNo2,String state2,String District2,String Email2,
			String Phone2,String Mobile2,String name3,String dNo3,String state3,String District3,String Email3,String Phone3,String Mobile3) {
		
		new HomePage(driver,test)
		.clickOnSignUpregistration()
		.enterUserId(id)
		.enterPassword(password)
		.enterConfirmPassword(confrmPassword)
		.selectSecurityQuestion(Integer.parseInt(question))
		.enterSecurityAnswer(answer)
		.enterName(name)
		.selectGender(gender)
		.enterDateOfBirth(dateOfBirth)
		.enterDesignation(designation)
		.enterEmailId(emailId)
		.enterMobile(mobile)
		.enterPhone(phone)
		.selectNationality(nationality)
		.enterName1(oname)
		.enterCapacity(capacity)
		.enterAddress(dNo)
		.selectState(state)
		.selectCity(district)
		.selectAccommodationType(accType)
		.selectAccommodationRate(starRating)
		.enterEmail(email)
		.enterMobileNumber(mcontact)
		.enterPhoneNumber(contact)
		
		.enterPassengerName(name1)
		.enterPassengerAddress(dNo1)
		.selectPassengerState(state1)
		.selectPassengerCity(District1)
		.enterPassengerEmailId(Email1)
		.enterPassengerMobile(Phone1)
		.enterPassengerPhone(Mobile1)
		.clickOnAdd()
		.enterPassengerName(name2)
		.enterPassengerAddress(dNo2)
		.selectPassengerState(state2)
		.selectPassengerCity(District2)
		.enterPassengerEmailId(Email2)
		.enterPassengerMobile(Phone2)
		.enterPassengerPhone(Mobile2)
		.clickOnAdd()
		.enterPassengerName(name3)
		.enterPassengerAddress(dNo3)
		.selectPassengerState(state3)
		.selectPassengerCity(District3)
		.enterPassengerEmailId(Email3)
		.enterPassengerMobile(Phone3)
		.enterPassengerPhone(Mobile3)
		;
		
	}

}
