package com.bpcl.automation.hooks;

import com.bpcl.automation.driver.AppiumServer;
import com.bpcl.automation.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import net.serenitybdd.core.Serenity;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;

public class TestHooks {

    @Before
    public void setup() {
        AppiumServer.start();
        DriverManager.initializeDriver();
    }

    @AfterStep
    public void takeScreenshot() throws IOException {

        File screenshotFile = DriverManager.getDriver()
                .getScreenshotAs(OutputType.FILE);

        String path = System.getProperty("user.dir")
                + "/target/screenshots/Screenshot-"
                + System.currentTimeMillis()
                + ".png";

        File destination = new File(path);

        FileUtils.copyFile(screenshotFile, destination);

        Serenity.recordReportData()
                .withTitle("Screenshot")
                .downloadable()
                .fromFile(destination.toPath());
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
        AppiumServer.stop();
    }
}