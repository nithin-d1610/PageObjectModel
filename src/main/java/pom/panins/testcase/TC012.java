package pom.panins.testcase;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.panind.pages.ApplicationPage;
import wrappers.ProjectWrappers;

public class TC012 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		browserName="chrome";
		appName="https://panind.com/india/new_pan/";
		testCaseName="TC012";
		testCaseDescription="Panind";
		author="nithin";
		category="sanity";
		sheetName="TC012";
	}
	
	@Test(dataProvider="fetchData")
	public void panInd(String title,String firstName,String middleName, String lastName,String fatherFirstName,
			String fatherMiddleName,String fatherLastName, String mobile, String emailId,String income,String address,
			String dateOfBirth,String Dno, String street,String city,String state,String pincode,String country,String oName,String oDno, String oStreet,
			String oCity,String oState, String oPincode,String oCountry,String idProof,String addressProof,String dobProof,String aadharProof,
			String oAddressProof) {
		
		new ApplicationPage(driver,test)
		.selectTitle(Integer.parseInt(title))
		.enterFirstName(firstName)
		.enterMiddleName(middleName)
		.enterLastName(lastName)
		.enterFatherFirstName(fatherFirstName)
		.enterFatherMiddleName(fatherMiddleName)
		.enterFatherLastName(fatherLastName)
		.enterMobile(mobile)
		.enterEmaiId(emailId)
		.selectSourceOfIncome(income)
		.clickOnAddressForCommunication(address)
		.enterDateOfBirth(dateOfBirth)
		.scrollDown()
		.enterResDoorNo(Dno)
		.enterResAreaStreet(street)
		.enterResCity(city)
		.selectResState(state)
		.enterResPincode(pincode)
		.selectResCountry(country)
		.enterOffName(oName)
		.enterOffDoorNo(oDno)
		.enterOffAreaStreet(oStreet)
		.enterOffCity(oCity)
		.selectOffState(oState)
		.enterOffPincode(oPincode)
		.selectOffCountry(oCountry)
		.scrollDown()
		.SelectIdentityProof(Integer.parseInt(idProof))
		.SelectAddressProof(Integer.parseInt(addressProof))
		.SelectDOBProof(Integer.parseInt(dobProof))
		.SelectAadharProof(Integer.parseInt(aadharProof))
		.SelectOfficeAddressProof(Integer.parseInt(oAddressProof))
		.clickOnAgreeTerms()
		;
	}

}
