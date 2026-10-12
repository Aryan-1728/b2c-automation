package com.bpcl.automation.driver;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;

public class AppiumServer {

    private static AppiumDriverLocalService service;

    public static void start() {

        if (service == null || !service.isRunning()) {

            service = new AppiumServiceBuilder()
                    .withIPAddress("127.0.0.1")
                    .usingPort(4723)
                    .withTimeout(java.time.Duration.ofSeconds(60))
                    .build();

            service.start();

            System.out.println("=================================");
            System.out.println("Appium Server Started");
            System.out.println("URL: " + service.getUrl());
            System.out.println("=================================");
        }
    }

    public static void stop() {

        if (service != null && service.isRunning()) {

            service.stop();

            System.out.println("=================================");
            System.out.println("Appium Server Stopped");
            System.out.println("=================================");
        }
    }
}