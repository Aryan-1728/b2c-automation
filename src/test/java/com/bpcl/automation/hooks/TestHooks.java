package com.bpcl.automation.hooks;

import com.bpcl.automation.driver.AppiumServer;
import com.bpcl.automation.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.AfterAll;
import net.serenitybdd.core.Serenity;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;

public class TestHooks {

    @BeforeAll
    public static void startServer() {
        AppiumServer.start();
    }

    @Before
    public void setup() {

        DriverManager.initializeDriver();

        // Launch the application at the start of each scenario
        String appPackage = "com.acn.bootstrap";

        DriverManager.getDriver().activateApp(appPackage);

        System.out.println("Application launched for new scenario");
    }

    @AfterStep
    public void takeScreenshot() throws IOException {

        File screenshotFile = DriverManager.getDriver()
                .getScreenshotAs(OutputType.FILE);

        File directory = new File(
                System.getProperty("user.dir") + "/target/screenshots"
        );

        FileUtils.forceMkdir(directory);

        File destination = new File(
                directory,
                "Screenshot-" + System.currentTimeMillis() + ".png"
        );

        FileUtils.copyFile(screenshotFile, destination);

        Serenity.recordReportData()
                .withTitle("Screenshot")
                .downloadable()
                .fromFile(destination.toPath());
    }

    @After
    public void tearDown() {

        if (DriverManager.getDriver() != null) {

            // Close the app after the scenario
            DriverManager.getDriver()
                    .terminateApp("com.acn.bootstrap");

            System.out.println("Application terminated after scenario");

            // Close the driver session
            DriverManager.quitDriver();
        }
    }

    @AfterAll
    public static void stopServer() {
        AppiumServer.stop();
    }
}
