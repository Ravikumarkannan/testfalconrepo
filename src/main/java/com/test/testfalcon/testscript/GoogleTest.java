package com.test.testfalcon.testscript;

import org.testng.annotations.Test;

import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;
import com.test.testfalcon.testsuite.SampleTestSuiteBase;

public class GoogleTest extends SampleTestSuiteBase {

	private ReportLogService report = new ReportLogServiceImpl(GoogleTest.class);
	
	@Test
	public void googleTest() {
		
	}
}
