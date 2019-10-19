package com.globant.movilAndroid;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.globant.movilAndroid.Pages.LoggInApp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AndroidTest extends BaseTest {
	Logger log = Logger.getLogger(AndroidTest.class);

	@Test
	public void loggInTest() {

		log.info("Hola loggInTest" + myDriver.driver);

		LoggInApp logInApp = new LoggInApp((AndroidDriver<MobileElement>) myDriver.driver);

		String prueba = logInApp.getLogIn();

		log.info("sí lo hizo?>>" + prueba);

	}

}
