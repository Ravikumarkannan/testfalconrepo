package com.test.testfalcon.testscript;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.atmecs.falcon.automation.util.parser.PropertyParser;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;
import com.atmecs.locatorSmartFixTool.models.SmartFixPageFileHandler;
import com.test.testfalcon.constant.FilePathConstants;
import com.test.testfalcon.constant.LocatorKeyContainer;
import com.test.testfalcon.helpers.HomePageHelper;
import com.test.testfalcon.testsuite.SampleTestSuiteBase;

public class GoogleTest extends SampleTestSuiteBase {

	private ReportLogService report = new ReportLogServiceImpl(GoogleTest.class);
	String url = PropertyParser.readEnvOrConfigProperty("applicationUrl");
	
	
	@Test
	@Parameters({"os", "osVersion", "browser", "browserVersion"}) 
	public void googleTest(String os, String osVersion, String browserName, String browserVersion) {
		HomePageHelper home = new HomePageHelper(browser);
		home.googleTest(url, os, osVersion, browserName, browserVersion);
	}
}
