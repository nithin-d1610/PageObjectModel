package pom.alert.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public HomePage waitsec(int time) {
		waitProperty(time);
		return this;
	}
	public FramePage switchToFrame() {
		SwitchToFrameByXPath(prop.getProperty("HomePage.switchToFrame.XPath"));
		return new FramePage(driver,test);
	}
	
	public MainPage ClickOnHomeIcon() {
		clickByXpath(prop.getProperty("HomePage.clickOnHomeIcon.XPath"));
		return new MainPage();
	}

}
