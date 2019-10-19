package com.globant.movilAndroid.Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BasePage {

	private WebDriverWait wait;
	private AndroidDriver<MobileElement> driver;

	public BasePage(AndroidDriver<MobileElement> myDriver) {
		PageFactory.initElements(myDriver, this);
		wait = new WebDriverWait(myDriver, 10);
		driver = myDriver;
	}

	public WebDriverWait getWait() {
		return wait;
	}

	protected AndroidDriver<MobileElement> getDriver() {
		return driver;
	}

	public void dispose() {
		if (driver != null) {
			driver.quit();
		}
	}
}
