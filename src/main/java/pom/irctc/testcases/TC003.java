package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		browserName="chrome";
		appName="https://www.irctc.co.in/nget/train-search";
		author="nithin";
		category="regression";
		testCaseName="TC003";
		testCaseDescription="Saloon mandatary check";
		sheetName="TC003";
	}
	
	
	@Test(dataProvider="fetchData")
	public void irctcSaloonCheck(String name,String organisation,String address,String mobile,String email,String request,String place,
			String destPlace,String Oyear,String oMonth,String oDay,String dYear,String dMonth,String dDay,String duration,String coach,
			String passengers,String purpose,String services,String MobileNumVerification) {
		new CovidAlertPage(driver,test)
		.waitsec(2000)
		.clickOnOk()
		.MouseHoverholidays()
		.MouseHoverstay()
		.ClickOnlounge()
		.switchWindow()
		.clickOnMenuIcon()
		.ClickOnCharter()
		.clickOnCloseMenu()
		.clickOnEnquiryForm()
		.enterApplicantName(name)
		.enterOrganizationName(organisation)
		.enterAddress(address)
		.enterMobile(mobile)
		.enterEmail(email)
		.selectSaloonCharter(Integer.parseInt(request))
		.enterOriginatingStation(place)
		.enterDestinationStation(destPlace)
		.clickOnDateOfDepartureDropdown()
		.selectOnDepartureYear(Oyear)
		.clickOnDepartureMonth(oMonth)
		.clickOnDepartureDate(oDay)
		.clickOnDateOfArrivalDropdown()
		.selectOnDepartureYear(dYear)
		.clickOnArrivalMonth(dMonth)
		.clickOnArrivalDate(dDay)
		.enterDurationOfTour(duration)
		.enterCoachDetails(coach)
		.enterNumberOfPassengers(passengers)
		.enterPurposeOfCharter(purpose)
		.enterServicesRequired(services)
		.clickOnSubmit()
		.verifyMobileNo(MobileNumVerification)
		;
				
		
	}

}
