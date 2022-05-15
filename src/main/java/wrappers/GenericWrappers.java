package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;


public class GenericWrappers extends Reporting implements Wrappers{

	public RemoteWebDriver driver;
	public static Properties prop;
	
	
	public void loadObjects() {
		try {
			prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void UnloadObject() {
	
		prop=null;
	}
	
		
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				
			}else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				
			}else if(browser.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer");
				driver = new InternetExplorerDriver();
				
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			//System.out.println("The browser "+browser+" is launched with the given url "+url+" succesfully");
			reportStep("The browser "+browser+" is launched with the given url "+url+" succesfully", "pass");
		} catch (InvalidArgumentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched with url "+url+" not contains http/https");
			reportStep("The browser "+browser+" is not launched with url "+url+" not contains http/https", "fail");
		}catch (SessionNotCreatedException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched due to session not created error");
			reportStep("\"The browser \"+browser+\" is not launched due to session not created error\"", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched with the given url "+url+" due to unknown error");
			reportStep("The browser "+browser+" is not launched with the given url "+url+" due to unknown error", "fail");
		}
	}

	
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with id "+idValue+" is entered with data "+data+" successfully");
			reportStep("The element with id "+idValue+" is entered with data "+data+" successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idValue+" is not found in the DOM");
			reportStep("The element with id "+idValue+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not visible in the application");
			reportStep("The element with id "+idValue+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not interactable in the application");
			reportStep("The element with id "+idValue+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not stable in the application");
			reportStep("The element with id "+idValue+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not entered with the data "+data+" due to unknown error");
			reportStep("The element with id "+idValue+" is not entered with the data "+data+" due to unknown error", "fail");
		}
	}

	
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name "+nameValue+" is entered with the data "+data+" successfully");
			reportStep("The element with name "+nameValue+" is entered with the data "+data+" successfully", "fail");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+nameValue+" is not found in the DOM");
			reportStep("The element with name "+nameValue+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not visible in the application");
			reportStep("The element with name "+nameValue+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+"is not interactable in the application");
			reportStep("The element with name "+nameValue+"is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not stable in the application");
			reportStep("The element with name "+nameValue+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser with name "+nameValue+" is not entered the data "+data+" due to unknown error");
			reportStep("The browser with name "+nameValue+" is not entered the data "+data+" due to unknown error", "fail");
		}
	}
 
	
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element with xpath "+xpathValue+" is entered with the data "+data+" successfully");
			reportStep("The element with xpath "+xpathValue+" is entered with the data "+data+" successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathValue+" is not found in the DOM");
			reportStep("The element with xpath "+xpathValue+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
			reportStep("The element with xpath "+xpathValue+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not interactable in the application");
			reportStep("The element with xpath "+xpathValue+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not stable in the application");
			reportStep("The element with xpath "+xpathValue+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not enetered with data "+data+" due to unknown error");
			reportStep("The element with xpath "+xpathValue+" is not enetered with data "+data+" due to unknown error", "fail");
		}
	}

	
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		String actualTitle = driver.getTitle();
		try {
			if(actualTitle.equals(title)) {
				//System.out.println("The title of the page "+actualTitle+" is matched with the expected title "+title);
				reportStep("The title of the page "+actualTitle+" is matched with the expected title "+title, "pass");
			}else {
				//System.err.println("The title of the page "+actualTitle+" is not matched with the expected title"+title);
				reportStep("The title of the page "+actualTitle+" is not matched with the expected title"+title, "fail");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The title of the page "+actualTitle+" is not matched with the expected title"+title+" due to unknown error");
			reportStep("The title of the page "+actualTitle+" is not matched with the expected title"+title+" due to unknown error", "fail");
		}
	}

	
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementById(id).getText();
			if(actualText.equals(text)) {
				//System.out.println("The element with id "+id+" is having the text "+actualText+" is matched with the expected text "+text);
				reportStep("The element with id "+id+" is having the text "+actualText+" is matched with the expected text "+text, "pass");
			}else {
				//System.err.println("The element with id "+id+" is having the text "+actualText+" is not matched with the expected text "+text);
				reportStep("The element with id "+id+" is having the text "+actualText+" is not matched with the expected text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.out.println("The element with id "+id+" is holding the text is not verified due to unknown error");
			reportStep("The element with id "+id+" is holding the text is not verified due to unknown error", "fail");
		}
	}

	
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if(actualText.equalsIgnoreCase(text)) {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+actualText+" is matched with the expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualText+" is matched with the expected text "+text, "pass");
			}else {
				//System.err.println("The element with xpath "+xpath+" is holding the text "+actualText+" is not matched with the expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualText+" is not matched with the expected text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "pass");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is holding the text is not verified due to unknown error");
			reportStep("The element with xpath "+xpath+" is holding the text is not verified due to unknown error", "fail");
		}
	}

	
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String containText = driver.findElementByXPath(xpath).getText();
			if(containText.contains(text)) {
				//System.out.println("The element with xpath "+xpath+" holding the text "+containText+" is contains the expected text "+text);
				reportStep("The element with xpath "+xpath+" holding the text "+containText+" is contains the expected text "+text, "pass");
			}else {
				//System.err.println("The element with xpath "+xpath+" holding the text "+containText+" is not contains the expected text "+text);
				reportStep("The element with xpath "+xpath+" holding the text "+containText+" is not contains the expected text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is holding the text is not verified due to unknown error");
			reportStep("The element with xpath "+xpath+" is holding the text is not verified due to unknown error", "fail");
		}
	}

	
	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with id "+id+" is clicked");
			reportStep("The element with id "+id+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is disable in the application");
			reportStep("The element with id "+id+" is disable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not clicked due to unknown error");
			reportStep("The element with id "+id+" is not clicked due to unknown error", "fail");
		}
	}

	
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with Class name "+classVal+" is clicked");
			reportStep("The element with Class name "+classVal+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Class name "+classVal+" is not found in the DOM");
			reportStep("The element with Class name "+classVal+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with Class name "+classVal+" is not visible in the application");
			reportStep("The element with Class name "+classVal+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with Class name "+classVal+" is disable in the application");
			reportStep("The element with Class name "+classVal+" is disable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with Class name "+classVal+" is not interactable in the application");
			reportStep("The element with Class name "+classVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with Class name "+classVal+" is not stable in the application");
			reportStep("The element with Class name "+classVal+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with Class name "+classVal+" is not clicked due to unknown error");
			reportStep("The element with Class name "+classVal+" is not clicked due to unknown error", "fail");
		}
	}

	
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with name "+name+" is clicked");
			reportStep("The element with name "+name+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not found in the DOM");
			reportStep("The element with name "+name+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not visible in the application");
			reportStep("The element with name "+name+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is disable in the application");
			reportStep("The element with name "+name+" is disable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not interactable in the application");
			reportStep("The element with name "+name+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not stable in the application");
			reportStep("The element with name "+name+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not clicked due to unknown error");
			reportStep("The element with name "+name+" is not clicked due to unknown error", "fail");
		}
	}
	

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with link "+name+" is clicked");
			reportStep("The element with link "+name+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with link "+name+" is not found in the DOM");
			reportStep("The element with link "+name+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not visible in the application");
			reportStep("The element with link "+name+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is disable in the application");
			reportStep("The element with link "+name+" is disable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not interactable in the application");
			reportStep("The element with link "+name+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not stable in the application");
			reportStep("The element with link "+name+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with link "+name+" is not clicked due to unknown error");
			reportStep("The element with link "+name+" is not clicked due to unknown error", "fail");
		}
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with link "+name+" is clicked");
			reportStep("The element with link "+name+" is clicked", "pass",false);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with link "+name+" is not found in the DOM");
			reportStep("The element with link "+name+" is not found in the DOM", "fail",false);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not visible in the application");
			reportStep("The element with link "+name+" is not visible in the application", "fail",false);
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is disable in the application");
			reportStep("The element with link "+name+" is disable in the application", "fail",false);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not interactable in the application");
			reportStep("The element with link "+name+" is not interactable in the application", "fail",false);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not stable in the application");
			reportStep("The element with link "+name+" is not stable in the application", "fail",false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not clicked due to unknown error");
			reportStep("The element with link "+name+" is not clicked due to unknown error", "fail",false);
		}
	}

	
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			
		if(xpathVal.contains("$option$")) {
			xpathVal = xpathVal.replace("$option$", "value");
			driver.findElementByXPath(xpathVal).click();
		}else {
			driver.findElementByXPath(xpathVal).click();
		}
			
			//System.out.println("The element with xpath "+xpathVal+" is clicked");
			reportStep("The element with xpath "+xpathVal+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is disable in the application");
			reportStep("The element with xpath "+xpathVal+" is disable in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unknown error", "fail");
		}
	}
	

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked");
			reportStep("The element with xpath "+xpathVal+" is clicked", "pass",false);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "fail",false);
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail",false);
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is disable in the application");
			reportStep("The element with xpath "+xpathVal+" is disable in the application", "fail",false);
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail",false);
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail",false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unknown error", "fail",false);
		}
	}
	

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementById(idVal).getText();
				//System.out.println("The element with id "+idVal+" is holding the text "+actualText);
				reportStep("The element with id "+idVal+" is holding the text "+actualText, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idVal+" is not found in the DOM");
			reportStep("The element with id "+idVal+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not visible in the application");
			reportStep("The element with id "+idVal+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not interactable in the application");
			reportStep("The element with id "+idVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not stable in the application");
			reportStep("The element with id "+idVal+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.out.println("The element with id "+idVal+" is holding the text is not written due to unknown error");
			reportStep("The element with id "+idVal+" is holding the text is not written due to unknown error", "fail");
		}
		return null;
		
	}

	
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpathVal).getText();
				//System.out.println("The element with xpath "+xpathVal+" is holding the text "+actualText);
			
				reportStep("The element with xpath "+xpathVal+" is holding the text "+actualText, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.out.println("The element with xpath "+xpathVal+" is holding the text is not written due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is holding the text is not written due to unknown error", "fail");
		}
		return null;
	}

	public void selectVisibleTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
		WebElement text = driver.findElementById(id);
		Select obj = new Select(text);
		obj.selectByVisibleText(value);
			//System.out.println("The element with id "+id+" is selecetd with visibletext "+value);
			reportStep("The element with id "+id+" is selecetd with visibletext "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in DOM");
			reportStep("The element with id "+id+" is not found in DOM", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element wit id "+id+" is not opening the dropdown");
			reportStep("The element with id "+id+" is not opening the dropdown", "fail");
		}catch (ElementNotVisibleException e)  {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		}catch (ElementNotInteractableException e){
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selected with vivibleText "+value+" due to unknown error");
			reportStep("The element with id "+id+" is not selected with vivibleText "+value+" due to unknown error", "fail");
		}
		
	}	
	

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement text = driver.findElementById(id);
			Select obj = new Select(text);
			obj.selectByIndex(value);
				//System.out.println("The element with id "+id+" is selecetd with index value "+value);
				reportStep("The element with id "+id+" is selecetd with index value "+value, "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with id "+id+" is not found in DOM");
				reportStep("The element with id "+id+" is not found in DOM", "fail");
			}catch (ElementNotSelectableException e) {
				// TODO: handle exception
				//System.err.println("The element wit id "+id+" is not opening the dropdown");
				reportStep("The element wit id "+id+" is not opening the dropdown", "fail");
			}catch (ElementNotVisibleException e)  {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not visible in the application");
				reportStep("The element with id "+id+" is not visible in the application", "fail");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not stable in the application");
				reportStep("The element with id "+id+" is not stable in the application", "fail");
			}catch (ElementNotInteractableException e){
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not interactable in the application");
				reportStep("The element with id "+id+" is not interactable in the application", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				///System.err.println("The element with id "+id+" is not selected with index value "+value+" due to unknown error");
				reportStep("The element with id "+id+" is not selected with index value "+value+" due to unknown error", "fail");
			}
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allId = driver.getWindowHandles();
			for(String eachId:allId) {
				driver.switchTo().window(eachId);
				break;
				}
			//System.out.println("The control is switched to parent window");
			reportStep("The control is switched to parent window", "pass");
			}catch (NoSuchWindowException e) {
				// TODO Auto-generated catch block
				//System.err.println("There is no such window available");
				reportStep("There is no such window available", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The control is not switched to parent window due to unknown error");
				reportStep("The control is not switched to parent window due to unknown error", "fail");
			}
			}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allId = driver.getWindowHandles();
			for(String eachId:allId) {
				driver.switchTo().window(eachId);
			}
			//System.out.println("The control is switched to last window");
			reportStep("The control is switched to last window", "pass");
			}catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("There is no such window available");
			reportStep("There is no such window available", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The control is not switched to last window due to unknown error");
			reportStep("The control is not switched to last window due to unknown error", "fail");
		}
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The alert is Accepted");
			reportStep("The alert is Accepted", "pass",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert is not available");
			reportStep("The alert is not available", "fail",false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert is not accepted due to unknown  error");
			reportStep("The alert is not accepted due to unknown  error", "fail",false);
		}
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The alert is dismissed");
			reportStep("The alert is dismissed", "pass",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert is not available");
			reportStep("The alert is not available", "fail",false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert is not dismissed due to unknown error");
			reportStep("The alert is not dismissed due to unknown error", "fail",false);
		}
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String alertText = null;
		try {
			alertText = driver.switchTo().alert().getText();
			//System.out.println("The alert text is "+alertText);
			reportStep("The alert text is "+alertText, "pass",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert is not available");
			reportStep("The alert is not available", "fail",false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert text is not written due to unknown error");
			reportStep("The alert text is not written due to unknown error", "fail",false);
		}
		return alertText;
	}

	public long takeSnap() {
		// TODO Auto-generated method stub
		long number=0;
		try {
			
			number =  (long) (Math.floor(Math.random()*100000000)+100000);
			
			File temp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./report/screenshots/"+number+".png");
			FileUtils.copyFile(temp, dest);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//System.err.println("screenshot not captured");
			reportStep("screenshot not captured", "fail",false);
		}
		return number;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("The active browser is closed");
			reportStep("The active browser is closed", "pass",false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The active browser is not closed due to unknown error");
			reportStep("The active browser is not closed due to unknown error", "fail",false);
		}
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("The active browsers are closed");
			reportStep("The active browsers are closed", "pass",false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("All the active browsers are not closed due to unexpected error");
			reportStep("All the active browsers are not closed due to unexpected error", "fail",false);
		}
	}


	public void selectValueById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement text = driver.findElementById(id);
			Select obj = new Select(text);
			obj.selectByValue(value);
				//System.out.println("The element with id "+id+" is selecetd with value "+value);
				reportStep("The element with id "+id+" is selecetd with value "+value, "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with id "+id+" is not found in DOM");
				reportStep("The element with id "+id+" is not found in DOM", "fail");
			}catch (ElementNotSelectableException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not opening the dropdown");
				reportStep("The element with id "+id+" is not opening the dropdown", "fail");
			}catch (ElementNotVisibleException e)  {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not visible in the application");
				reportStep("The element with id "+id+" is not visible in the application", "fail");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not stable in the application");
				reportStep("The element with id "+id+" is not stable in the application", "fail");
			}catch (ElementNotInteractableException e){
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not interactable in the application");
				reportStep("The element with id "+id+" is not interactable in the application", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not selected with value "+value+" due to unknown error");
				reportStep("The element with id "+id+" is not selected with value "+value+" due to unknown error", "fail");
			}
	}


	public void selectVisibleTextByName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement text = driver.findElementByName(name);
			Select obj = new Select(text);
			obj.selectByVisibleText(value);
				//System.out.println("The element with name "+name+" is selecetd with visibletext "+value);
				reportStep("The element with name "+name+" is selecetd with visibletext "+value, "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with name "+name+" is not found in DOM");
				reportStep("The element with name "+name+" is not found in DOM", "fail");
			}catch (ElementNotSelectableException e) {
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not opening the dropdown");
				reportStep("The element with name "+name+" is not opening the dropdown", "fail");
			}catch (ElementNotVisibleException e)  {
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not visible in the application");
				reportStep("The element with name "+name+" is not visible in the application", "fail");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not stable in the application");
				reportStep("The element with name "+name+" is not stable in the application", "fail");
			}catch (ElementNotInteractableException e){
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not interactable in the application");
				reportStep("The element with name "+name+" is not interactable in the application", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not selected with vivibleText "+value+" due to unknown error");
				reportStep("The element with name "+name+" is not selected with vivibleText "+value+" due to unknown error", "fail");
			}
	}


	public void selectIndexByName(String name, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement text = driver.findElementByName(name);
			Select obj = new Select(text);
			obj.selectByIndex(value);
				//System.out.println("The element with name "+name+" is selecetd with index value "+value);
				reportStep("The element with name "+name+" is selecetd with index value "+value, "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with name "+name+" is not found in DOM");
				reportStep("The element with name "+name+" is not found in DOM", "fail");
			}catch (ElementNotSelectableException e) {
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not opening the dropdown");
				reportStep("The element with name "+name+" is not opening the dropdown", "fail");
			}catch (ElementNotVisibleException e)  {
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not visible in the application");
				reportStep("The element with name "+name+" is not visible in the application", "fail");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not stable in the application");
				reportStep("The element with name "+name+" is not stable in the application", "fail");
			}catch (ElementNotInteractableException e){
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not interactable in the application");
				reportStep("The element with name "+name+" is not interactable in the application", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not selected with index value "+value+" due to unknown error");
				reportStep("The element with name "+name+" is not selected with index value "+value+" due to unknown error", "fail");
			}
	}


	public void selectValueByName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement text = driver.findElementByName(name);
			Select obj = new Select(text);
			obj.selectByValue(value);
				//System.out.println("The element with name "+name+" is selecetd with value "+value);
				reportStep("The element with name "+name+" is selecetd with value "+value, "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with name "+name+" is not found in DOM");
				reportStep("The element with name "+name+" is not found in DOM", "fail");
			}catch (ElementNotSelectableException e) {
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not opening the dropdown");
				reportStep("The element with name "+name+" is not opening the dropdown", "fail");
			}catch (ElementNotVisibleException e)  {
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not visible in the application");
				reportStep("The element with name "+name+" is not visible in the application", "fail");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not stable in the application");
				reportStep("The element with name "+name+" is not stable in the application", "fail");
			}catch (ElementNotInteractableException e){
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not interactable in the application");
				reportStep("The element with name "+name+" is not interactable in the application", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element with name "+name+" is not selected with value "+value+" due to unknown error");
				reportStep("The element with name "+name+" is not selected with value "+value+" due to unknown error", "fail");
			}
	}


	public void selectVisibleTextByClassName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement text = driver.findElementByClassName(name);
			Select obj = new Select(text);
			obj.selectByVisibleText(value);
				//System.out.println("The element with class name "+name+" is selecetd with visibletext "+value);
				reportStep("The element with class name "+name+" is selecetd with visibletext "+value, "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with class name "+name+" is not found in DOM");
				reportStep("The element with class name "+name+" is not found in DOM", "fail");
			}catch (ElementNotSelectableException e) {
				// TODO: handle exception
				//System.err.println("The element with class name "+name+" is not opening the dropdown");
				reportStep("The element with class name "+name+" is not opening the dropdown", "fail");
			}catch (ElementNotVisibleException e)  {
				// TODO: handle exception
				//System.err.println("The element with class name "+name+" is not visible in the application");
				reportStep("The element with class name "+name+" is not visible in the application", "fail");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with class name "+name+" is not stable in the application");
				reportStep("The element with class name "+name+" is not stable in the application", "fail");
			}catch (ElementNotInteractableException e){
				// TODO: handle exception
				//System.err.println("The element with class name "+name+" is not interactable in the application");
				reportStep("The element with class name "+name+" is not interactable in the application", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element with class name "+name+" is not selected with vivibleText "+value+" due to unknown error");
				reportStep("The element with class name "+name+" is not selected with vivibleText "+value+" due to unknown error", "fail");
			}
	}


	public void selectIndexByClassName(String name, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement text = driver.findElementByClassName(name);
			Select obj = new Select(text);
			obj.selectByIndex(value);
				//System.out.println("The element with class name "+name+" is selecetd with index value "+value);
				reportStep("The element with class name "+name+" is selecetd with index value "+value, "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with class name "+name+" is not found in DOM");
				reportStep("The element with class name "+name+" is not found in DOM", "fail");
			}catch (ElementNotSelectableException e) {
				// TODO: handle exception
				//System.err.println("The element with class name "+name+" is not opening the dropdown");
				reportStep("The element with class name "+name+" is not opening the dropdown", "fail");
			}catch (ElementNotVisibleException e)  {
				// TODO: handle exception
				//System.err.println("The element with class name "+name+" is not visible in the application");
				reportStep("The element with class name "+name+" is not visible in the application", "fail");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with class name "+name+" is not stable in the application");
				reportStep("The element with class name "+name+" is not stable in the application", "fail");
			}catch (ElementNotInteractableException e){
				// TODO: handle exception
				//System.err.println("The element with class name "+name+" is not interactable in the application");
				reportStep("The element with class name "+name+" is not interactable in the application", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element with class name "+name+" is not selected with index value "+value+" due to unknown error");
				reportStep("The element with class name "+name+" is not selected with index value "+value+" due to unknown error", "fail");
			}
	}


	public void selectValueByClassName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement text = driver.findElementByClassName(name);
			Select obj = new Select(text);
			obj.selectByValue(value);
				//System.out.println("The element with class name "+name+" is selecetd with value "+value);
				reportStep("The element with class name "+name+" is selecetd with value "+value, "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with class name "+name+" is not found in DOM");
				reportStep("The element with class name "+name+" is not found in DOM", "fail");
			}catch (ElementNotSelectableException e) {
				// TODO: handle exception
				//System.err.println("The element wit class name "+name+" is not opening the dropdown");
				reportStep("The element wit class name "+name+" is not opening the dropdown", "fail");
			}catch (ElementNotVisibleException e)  {
				// TODO: handle exception
				//System.err.println("The element with class name "+name+" is not visible in the application");
				reportStep("The element with class name "+name+" is not visible in the application", "fail");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with class name "+name+" is not stable in the application");
				reportStep("The element with class name "+name+" is not stable in the application", "fail");
			}catch (ElementNotInteractableException e){
				// TODO: handle exception
				//System.err.println("The element with class name "+name+" is not interactable in the application");
				reportStep("The element with class name "+name+" is not interactable in the application", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element with class name "+name+" is not selected with value "+value+" due to unknown error");
				reportStep("The element with class name "+name+" is not selected with value "+value+" due to unknown error", "fail");
			}
	}


	public void selectVisibleTextByXPath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement text = driver.findElementByXPath(xpath);
			Select obj = new Select(text);
			obj.selectByVisibleText(value);
				//System.out.println("The element with xpath "+xpath+" is selecetd with visibletext "+value);
				reportStep("The element with xpath "+xpath+" is selecetd with visibletext "+value, "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with xpath "+xpath+" is not found in DOM");
				reportStep("The element with xpath "+xpath+" is not found in DOM", "fail");
			}catch (ElementNotSelectableException e) {
				// TODO: handle exception
				//System.err.println("The element wit xpath "+xpath+" is not opening the dropdown");
				reportStep("The element wit xpath "+xpath+" is not opening the dropdown", "fail");
			}catch (ElementNotVisibleException e)  {
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpath+" is not visible in the application");
				reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpath+" is not stable in the application");
				reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
			}catch (ElementNotInteractableException e){
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
				reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpath+" is not selected with vivibleText "+value+" due to unknown error");
				reportStep("The element with xpath "+xpath+" is not selected with vivibleText "+value+" due to unknown error", "fail");
			}
	}


	public void selectIndexByXPath(String xpath, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement text = driver.findElementByXPath(xpath);
			Select obj = new Select(text);
			obj.selectByIndex(value);
				//System.out.println("The element with xpath"+xpath+" is selecetd with index value "+value);
				reportStep("The element with xpath"+xpath+" is selecetd with index value "+value, "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with xpath "+xpath+" is not found in DOM");
				reportStep("The element with xpath "+xpath+" is not found in DOM", "fail");
			}catch (ElementNotSelectableException e) {
				// TODO: handle exception
				//System.err.println("The element wit xpath "+xpath+" is not opening the dropdown");
				reportStep("The element wit xpath "+xpath+" is not opening the dropdown", "fail");
			}catch (ElementNotVisibleException e)  {
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpath+" is not visible in the application");
				reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpath+" is not stable in the application");
				reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
			}catch (ElementNotInteractableException e){
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
				reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpath+" is not selected with index value "+value+" due to unknown error");
				reportStep("The element with xpath "+xpath+" is not selected with index value "+value+" due to unknown error", "fail");
			}
	}


	public void selectValueByXPath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement text = driver.findElementByXPath(xpath);
			Select obj = new Select(text);
			obj.selectByValue(value);
				//System.out.println("The element with xpath "+xpath+" is selecetd with value "+value);
				reportStep("The element with xpath "+xpath+" is selecetd with value "+value, "pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with xpath "+xpath+" is not found in DOM");
				reportStep("The element with xpath "+xpath+" is not found in DOM", "fail");
			}catch (ElementNotSelectableException e) {
				// TODO: handle exception
				//System.err.println("The element wit xpath "+xpath+" is not opening the dropdown");
				reportStep("The element wit xpath "+xpath+" is not opening the dropdown", "fail");
			}catch (ElementNotVisibleException e)  {
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpath+" is not visible in the application");
				reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpath+" is not stable in the application");
				reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
			}catch (ElementNotInteractableException e){
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
				reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpath+" is not selected with value "+value+" due to unknown error");
				reportStep("The element with xpath "+xpath+" is not selected with value "+value+" due to unknown error", "fail");
			}
	}


	public void SwitchToFrameByInt(int Value) {
		// TODO Auto-generated method stub
		try {
		driver.switchTo().frame(Value);
		//System.out.println("driver is switched to the frame");
		reportStep("driver is switched to the frame", "pass");
	} catch (NoSuchFrameException e) {
		// TODO Auto-generated catch block
		//System.err.println("The frame is not available");
		reportStep("The frame is not available", "fail");
	}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("Unable to switch to frame due to unknown error");
		reportStep("Unable to switch to frame due to unknown error", "fail");
	}
	}


	public void SwitchToFrameByString(String Value) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(Value);
			//System.out.println("driver is switched to the frame");
			reportStep("driver is switched to the frame", "pass");
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			//System.err.println("The frame is not available");
			reportStep("The frame is not available", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to switch to frame due to unknown error");
			reportStep("Unable to switch to frame due to unknown error", "fail");
		}
	}


	public void SwitchToFrameById(String Value) {
		// TODO Auto-generated method stub
		try {
			WebElement myframe = driver.findElementById(Value);
			driver.switchTo().frame(myframe);
			//System.out.println("The control is changed to the frame");
			reportStep("The control is changed to the frame", "pass");
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			//System.err.println("The frame is not available");
			reportStep("The frame is not available", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to switch to frame due to unknown error");
			reportStep("Unable to switch to frame due to unknown error", "fail");
		}
	}


	public void SwitchToFrameByName(String Value) {
		// TODO Auto-generated method stub
		try {
			WebElement myframe = driver.findElementByName(Value);
			driver.switchTo().frame(myframe);
			//System.out.println("The control is changed to the frame");
			reportStep("The control is changed to the frame", "pass");
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			//System.err.println("The frame is not available");
			reportStep("The frame is not available", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to switch to frame due to unknown error");
			reportStep("Unable to switch to frame due to unknown error", "fail");
		}
	}


	public void SwitchToFrameByClassName(String Value) {
		// TODO Auto-generated method stub
		try {
			WebElement myframe = driver.findElementByClassName(Value);
			driver.switchTo().frame(myframe);
			//System.out.println("The control is changed to the frame");
			reportStep("The control is changed to the frame", "pass");
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			//System.err.println("The frame is not available");
			reportStep("The frame is not available", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to switch to frame due to unknown error");
			reportStep("Unable to switch to frame due to unknown error", "fail");
		}
	}


	public void SwitchToFrameByXPath(String Value) {
		// TODO Auto-generated method stub
		try {
			WebElement myframe = driver.findElementByXPath(Value);
			
			driver.switchTo().frame(myframe);
			//System.out.println("The control is changed to the frame");
			reportStep("The control is changed to the frame", "pass");
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			//System.err.println("The frame is not available");
			reportStep("The frame is not available", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to switch to frame due to unknown error");
			reportStep("Unable to switch to frame due to unknown error", "fail");
		}
	}


	public void refresh() {
		// TODO Auto-generated method stub
		driver.navigate().refresh();
		//System.out.println("The window is refreshed");
		reportStep("The window is refreshed", "pass");
	}


	public void forward() {
		// TODO Auto-generated method stub
		driver.navigate().forward();
		//System.out.println("The window is forward");
		reportStep("The window is forward", "pass");
	}


	public void back() {
		// TODO Auto-generated method stub
		driver.navigate().back();
		//System.out.println("The window is moved backward");
		reportStep("The window is moved backward", "pass");
	}


	public void defaultContent() {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		//System.out.println("The control is switch to default content");
		reportStep("The control is switch to default content", "pass");
	}


	public String getTextNoSnap() {
		// TODO Auto-generated method stub
		String alertText = null;
		try {
			alertText = driver.switchTo().alert().getText();
			//System.out.println("The alert text is"+alertText);
			reportStep("The alert text is"+alertText, "pass",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert is not available");
			reportStep("The alert is not available", "fail",false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert text is not written due to unknown error");
			reportStep("The alert text is not written due to unknown error", "fail",false);
		}
		return alertText;
	}


	public void PageDown() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
			//System.out.println("the page is scrolled down");
			reportStep("the page is scrolled down", "pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The page down is not operating due to unknown error");
			reportStep("The page down is not operating due to unknown error", "fail");
		}
	}


	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
			//System.out.println("the browser is wait for "+time);
			reportStep("the browser is wait for "+time, "pass");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The waiting property is interrupted due to unhknown error");
			reportStep("The waiting property is interrupted due to unhknown error", "fail");
		}
	}


	public void enterAlertText(String text) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().sendKeys(text);
			//System.out.println("The String "+text+" is sent to the alert box");
			reportStep("The String "+text+" is sent to the alert box", "pass",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("The alert is not available");
			reportStep("The alert is not available", "fail",false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The alert is not available due to unknown error");
			reportStep("The alert is not available due to unknown error", "fail",false);
		}
	}

	public void mouseHoverByXPath(String data) {
		// TODO Auto-generated method stub

		Actions builder = new Actions(driver);
		WebElement xpath = driver.findElementByXPath(data);
		builder.moveToElement(xpath).perform();
		//System.out.println("the cursor is mousehover to the element with the xpath "+xpath);
		reportStep("the cursor is mousehover to the element with the xpath "+xpath, "pass");
	}


	public String whileLoop(String clickXPath, String getTextXpath, String value) {
		// TODO Auto-generated method stub
		String month1=null;
		int i=1;
		while(i>0) {
			
			driver.findElementByXPath(clickXPath).click();
			month1 = driver.findElementByXPath(getTextXpath).getText();
			
			if(month1.contains(value))
				break;
			i++;
		}
		return month1;
	}


}
