package com.bpcl.automation.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverManager {

    private static AndroidDriver driver;
    private static WebDriverWait wait;

    public static void initializeDriver() {

        try {

            // Read Serenity configuration
            EnvironmentVariables environmentVariables =
                    SystemEnvironmentVariables.createEnvironmentVariables();

            EnvironmentSpecificConfiguration configuration =
                    EnvironmentSpecificConfiguration.from(environmentVariables);

            // Read Appium configuration
            String serverUrl =
                    configuration.getProperty("appium.server.url");

            String platformName =
                    configuration.getProperty("appium.platformName");

            String automationName =
                    configuration.getProperty("appium.automationName");

            String platformVersion =
                    configuration.getProperty("appium.platformVersion");

            String deviceName =
                    configuration.getProperty("appium.deviceName");

            String appPackage =
                    configuration.getProperty("appium.appPackage");

            String appActivity =
                    configuration.getProperty("appium.appActivity");

            boolean noReset =
                    Boolean.parseBoolean(
                            configuration.getProperty("appium.noReset")
                    );

            boolean ignoreHiddenApiPolicyError =
                    Boolean.parseBoolean(
                            configuration.getProperty(
                                    "appium.ignoreHiddenApiPolicyError"
                            )
                    );

            // Create UiAutomator2 options
            UiAutomator2Options options = new UiAutomator2Options();

            options.setPlatformName(platformName);
            options.setAutomationName(automationName);
            options.setPlatformVersion(platformVersion);
            options.setDeviceName(deviceName);

            options.setAppPackage(appPackage);
            options.setAppActivity(appActivity);

            options.setNoReset(noReset);

            options.setCapability(
                    "appium:ignoreHiddenApiPolicyError",
                    ignoreHiddenApiPolicyError
            );
            options.setCapability(
                    "appium:enforceXPath1",
                    true
            );

            // Create Android driver
            driver = new AndroidDriver(
                    new URL(serverUrl),
                    options
            );

            wait = new WebDriverWait(
                    DriverManager.getDriver(),
                    Duration.ofSeconds(20)
            );

        } catch (MalformedURLException e) {

            throw new RuntimeException(
                    "Invalid Appium server URL",
                    e
            );
        }
    }

    public static AndroidDriver getDriver() {
        return driver;
    }

    public static WebDriverWait getWait(){
        return wait;
    }

    public static void quitDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}