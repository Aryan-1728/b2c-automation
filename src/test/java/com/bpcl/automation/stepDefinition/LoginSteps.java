package com.bpcl.automation.stepDefinition;

import com.bpcl.automation.pages.LoginPage;
import io.cucumber.java.en.Given;

public class LoginSteps {
    private final LoginPage loginPage = new LoginPage();

    @Given("The user logs in to the app")
    public void theUserLogsInToTheApp(){
        loginPage.validLogin();
    }
}
