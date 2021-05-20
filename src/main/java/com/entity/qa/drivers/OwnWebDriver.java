package com.entity.qa.drivers;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;

import com.entity.qa.utils.Selenium;

import net.thucydides.core.webdriver.DriverSource;

public class OwnWebDriver implements DriverSource {

	private WebDriver driver;

	
	@Override
	public WebDriver newDriver() {
		String downloadPath = "";
		int timeOut = 20;
		ChromeOptions chromeOptions = new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		LoggingPreferences logPrefs = new LoggingPreferences();
		logPrefs.enable(LogType.PERFORMANCE, Level.ALL);

		chromePrefs.put("download.default_directory", downloadPath);
		chromeOptions.addArguments(
				"" + "--start-maximized " + "--ignore-certificate-errors " + "--disable-extensions " + "--incognito");

		chromeOptions.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
		chromeOptions.setExperimentalOption("prefs", chromePrefs).setExperimentalOption("excludeSwitches",
				new String[] { "enable-automation" });
		System.setProperty("webdriver.chrome.driver", Selenium.parameters().getProperty("WebDrive"));

		
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(timeOut,TimeUnit.SECONDS);
		return driver;
	}


	@Override
	public boolean takesScreenshots() {
		// TODO Auto-generated method stub
		return true;
	}

}
