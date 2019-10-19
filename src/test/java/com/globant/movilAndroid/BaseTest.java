package com.globant.movilAndroid;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	Logger log = Logger.getLogger(BaseTest.class);

	MyDriverAndroid myDriver;

	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() {

		try {
			myDriver = new MyDriverAndroid();
		} catch (Exception e) {
			log.error("error BaseTest().beforeSuite", e);

		}

	}

	@AfterSuite
	public void afterTest() {
		myDriver.closeApp();
	}

}
