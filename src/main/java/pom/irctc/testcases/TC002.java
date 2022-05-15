package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		browserName="chrome";
		appName="https://www.irctc.co.in/nget/train-search";
		author="nithin";
		category="regression";
		testCaseName="TC002";
		testCaseDescription="Book your coach";
		sheetName="TC002";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void irctcBookYourCoach(String userId,String password,String confrmPassword,String secQuestion,String secAnswer,String year,String month,
			String day,String gender,String marriageStatus,String email,String occupation,String fName,String mName,String lName,String nationality,String flat,String street,String area,
			String country,String mobile,String pincode,String city,String state,String postOffice,String communicationAddress,String oFlat,String oStreet,String oArea,String country1,
			String oMobile,String oPincode,String oCity,String oState,String oPostOffice) {
		
		new CovidAlertPage(driver,test)
		.waitsec(2000)
		.clickOnOk()
		.MouseHoverholidays()
		.MouseHoverstay()
		.ClickOnlounge()
		.switchWindow()
		.clickOnMenuIcon()
		.clickOnBookYourCoach()
		.switchWindow()
		.clickOnSighUp()
		.enterUserId(userId)
		.enterPassword(password)
		.enterConfirmPassword(confrmPassword)
		.selectSecurityQuestion(Integer.parseInt(secQuestion))
		.enterSecurityAnswer(secAnswer)
		.clickOnDateOfBirthDropdown()
		.selectDOBYear(year)
		.selectDOBMonth(month)
		.clickOnDObDate(day)
		.clickOnGender(gender)
		.clickOnMarriageStatus(marriageStatus)
		.enterEmailId(email)
		.selectOccupation(occupation)
		.enterFirstName(fName)
		.enterMiddleName(mName)
		.enterLastName(lName)
		.selectNationality(nationality)
		.enterDoorNumber(flat)
		.enterStreet(street)
		.enterArea(area)
		.selectCountry(Integer.parseInt(country))
		.enterMobile(mobile)
		.enterPincode(pincode)
		.scrollDown()
		//.selectCity(city)
		//.selectState(state)
		.selectPostOffice(Integer.parseInt(postOffice))
		.clickOnSameAsResAddress(communicationAddress)
		.enterOfficeDoorNo(oFlat)
		.enterOfficeStreet(oStreet)
		.enterOfficeArea(oArea)
		.selectOfficeCountry(Integer.parseInt(country1))
		.enterOfficeMobile(oMobile)
		.enterOfficePincode(oPincode)
		.scrollDown()
		//.selectOfficeCity(oCity)
		//.selectOfficeState(oState)
		.selectOfficePostOffice(Integer.parseInt(oPostOffice))
		;
		
		
		
		
		
		
		
	}

}
