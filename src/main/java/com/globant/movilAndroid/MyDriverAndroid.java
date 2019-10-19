package com.globant.movilAndroid;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MyDriverAndroid {

	Logger log = Logger.getLogger(MyDriverAndroid.class);

	protected WebDriverWait wait;
	protected AppiumDriver<MobileElement> driver;

	public MyDriverAndroid() {

		// Set the desired Capabilities
		final File classpathRoot = new File(System.getProperty("user.dir"));
		DesiredCapabilities caps = new DesiredCapabilities();
		final File appDir = new File(classpathRoot, "src/test/resources/apps/");
		final File app = new File(appDir, "TAtech_android.apk");

		caps.setCapability("deviceName", "emulator-5554");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9");
		caps.setCapability("appPackage", "com.globant.tatechandroid");
		caps.setCapability("appActivity", "com.globant.tatechandroid.LoginActivity");
		caps.setCapability("autoGrantPermissions", true);
		caps.setCapability("app", app.getAbsolutePath());

		try {

			driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			wait = new WebDriverWait(driver, 10);

		} catch (MalformedURLException e) {
			log.error("error MyDriverAndroid.MyDriverAndroid()", e);
		}

	}

	public void closeApp() {
		if (driver != null) {
			driver.quit();
		}

	}

}
