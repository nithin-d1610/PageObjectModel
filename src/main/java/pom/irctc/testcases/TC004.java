package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		browserName="chrome";
		appName="https://www.irctc.co.in/nget/train-search";
		testCaseName="TC004";
		testCaseDescription="Book Hotel - OTP validation";
		author="nithin";
		category="regression";
		sheetName="TC004";
	}
	
	@Test(dataProvider="fetchData")
	public void irctcHotelOTPValid(String email,String mobile,String filterText,String requiredText,String checkInYear,String checkInMonth,
			String checkInDay,String checkOutYear,String checkOutMonth,String checkOutDay,String room,String adult,String title,String fName,
			String lName,String country,String state,String phone,String gst,String verifyOtp) {
		
		new CovidAlertPage(driver,test)
		.waitsec(3000)
		.clickOnOk()
		.MouseHoverholidays()
		.MouseHoverstay()
		.ClickOnlounge()
		.switchWindow()
		.clickOnHotelIcon()
		.switchWindow()
		.clickOnLogin()
		.clickOnGuestUserLogin()
		.enterEmailId(email)
		.enterMobileNumber(mobile)
		.clickOnLogin()
		.EnterCityOrHotelName(filterText)
		.clickOnRequiredHotelName(requiredText)
		.clickOnCheckIn()
		.clickOnCheckInDateDropdown()
		.clickOnCheckInDateYear(checkInYear)
		.clickOnCheckInDateMonth(checkInMonth)
		.clickOnCheckInDate(checkInDay)
		.clickOnCheckOut()
		.clickOnCheckOutDropdown()
		.clickOnCheckOutYear(checkOutYear)
		.clickOnCheckOutMonth(checkOutMonth)
		.clickOnCheckOutDate(checkOutDay)
		.clickOnNumberOfRoomAndGuest()
		.selectNoOfRoom(room)
		.selectNoOfGuest(adult)
		.clickOnDone()
		.clickOnFindHotel()
		.waitsec(4000)
		.clickOnFirstHotel()
		.switchWindow()
		.getHotelName()
		.getHotelPrice()
		.clickOnContinueToBook()
		.switchWindow()
		.selectTitle(Integer.parseInt(title))
		.enterFirstName(fName)
		.enterLastName(lName)
		.selectCountry(country)
		.selectState(state)
		.enterMobileNumber(phone)
		.selectGst(gst)
		.scrollDown()
		.verifyHotelName()
		.verifyHotelPrice()
		.waitsec(2000)
		.clickOnContinue()
		.waitsec(2000)
		.clickOnAgreeTerms()
		.clickOnMakePayment()
		.clickOnVerify()
		.verifyOtpRequiredOrNot(verifyOtp)
		;
		
	}
	
}
