package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC0013 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		browserName="chrome";
		appName="https://www.irctc.co.in/nget/train-search";
		author="nithin";
		category="regression";
		testCaseName="TC001";
		testCaseDescription="irctc signup";
		sheetName="TC001";
	}
	
	
	@Test(dataProvider="fetchData")
	public void irctcRegistration(String userName,String password,String confrmpassword,String language,String secQuestion,String secAnswer,String firstName,String middleName,String lastName,
			String occupation,String year,String month,String date,String marriageStatus,String country,String gender,String emailId,String  mobile,String nationality,String dNo,String street,String area
			,String pincode,String state,String district,String postOffice,String phone,String communicationAddress,String oDNo,String oStreet,String oArea,String oCountry,String oPincode,
			String oState,String oCity,String oPostOffice,String oPhone) {
		
		new CovidAlertPage(driver,test)
		.waitsec(2000)
		.clickOnOk()
		.waitsec(2000)
		.clickOnRegister()
		.enterUserName(userName)
		.enterPassword(password)
		.enterConfirmPassword(confrmpassword)
		.clickOnPrefferedLanguageDropdown()
		.clickOnLanguage(language)
		.clickOnSecQuestionDropdown()
		.clickOnSecQuestionOption(secQuestion)
		.enterSecAnswer(secAnswer)
		.ClickOnContinue()
		.enterFirstName(firstName)
		.enterMiddleName(middleName)
		.enterLastName(lastName)
		.ClickOnOccupationDropdown()
		.ClickOnOccupationOption(occupation)
		.ClickOnDateOfBirthDropdown()
		.selectYear(year)
		.selectMonth(month)
		.selectDate(date)
		.clickOnMarriageStatus(marriageStatus)
		.selectCountry(country)
		.clickOnGender(gender)
		.enterEmail(emailId)
		.enterMobileNumber(mobile)
		.selectNationality(nationality)
		.ClickOnContinue()
		.enterDoorNumber(dNo)
		.enterStreetName(street)
		.enterAreaName(area)
		.enterPincode(pincode)
		.enterStateName(state)
		.selectCity(district)
		.selectPostOffice(postOffice)
		.enterPhoneNumber(phone)
		.clickCopyResAddrressToOffice(communicationAddress)
		.enterOfficeDoorNo(oDNo)
		.enterOfficeStreetName(oStreet)
		.enterOfficeAreaName(oArea)
		.clickOnOffCountryDropdown()
		.clickOnOffCountryoption(oCountry)
		.enterOfficePincode(oPincode)
		.enterOfficeState(oState)
		.enterOfficeCity(oCity)
		.enterOfficePostOffice(oPostOffice)
		.enterOfficePhone(oPhone)
		.ClickOnAgreeTerms();
		
		
	}


}
