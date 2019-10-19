package com.globant.movilAndroid.Pages;

import org.apache.log4j.Logger;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoggInApp extends BasePage {

	Logger log = Logger.getLogger(LoggInApp.class);

	public LoggInApp(AndroidDriver<MobileElement> myDriver) {
		super(myDriver);

	}

	public String getLogIn() {
		String resp = "";

		try {

			// getDriver().findElementById("com.globant.tatechandroid:id/email").click();
			// getDriver().findElementById("com.globant.tatechandroid:id/email").sendKeys("aldo.villalba@globant.com");
			//
			// getDriver().findElementById("com.globant.tatechandroid:id/password").click();
			// getDriver().findElementById("com.globant.tatechandroid:id/password").sendKeys("pswAldo");
			//
			// getDriver().findElementById("email_sign_in_button").click();
			// resp = "no trono";
		} catch (Exception e) {
			log.error("error LoggInApp.getLogin()", e);
			resp = "Sí tronó";
		}

		return resp;
	}
}
