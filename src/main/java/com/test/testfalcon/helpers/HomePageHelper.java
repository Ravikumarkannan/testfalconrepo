package com.test.testfalcon.helpers;

import org.openqa.selenium.WebDriver;

import com.atmecs.falcon.automation.ui.selenium.Browser;
import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.atmecs.locatorSmartFixTool.models.SmartFixPageFileHandler;
import com.test.testfalcon.constant.FilePathConstants;
import com.test.testfalcon.constant.LocatorKeyContainer;

public class HomePageHelper {

	public Browser browser;
	
	public WebDriver driver;

	
	public HomePageHelper(Browser browser) {
		this.browser = browser;
	}

	public void googleTest(String url, String os, String osVersion, String browserName, String browserVersion ) {
		
		browser.openURL(url,os, osVersion, browserName, browserVersion);
		browser.maximizeWindow();
		browser.getWait().pageLoadTimeout(30);
//		browser.getTextField().enterTextField(LocatorType.NAME,
//				SmartFixPageFileHandler.getLocatorValue(FilePathConstants.Contact_US, LocatorKeyContainer.SEARCH_INPUT),
//				"automation tutorial");
//		browser.getWait().waitForElementPresence(LocatorType.NAME, SmartFixPageFileHandler.getLocatorValue(FilePathConstants.Contact_US, LocatorKeyContainer.SEARCH_BUTTON), 5000);
//	
//		browser.getClick().clickButtonByName(LocatorType.NAME, SmartFixPageFileHandler.getLocatorValue(FilePathConstants.Contact_US, LocatorKeyContainer.SEARCH_BUTTON));
	
	}
}
