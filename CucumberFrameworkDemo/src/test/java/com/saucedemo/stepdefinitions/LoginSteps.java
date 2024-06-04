package com.saucedemo.stepdefinitions;

import applicationCode.ApplicationCode;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {
	ApplicationCode app;

    @Given("User is on Login Page")
    public void user_is_on_login_page() {
    	app = new ApplicationCode();
        app.navigateToWebsite();
        System.out.println("User is on Login Page");
       
    }

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
    	app.login("standard_user", "secret_sauce");
        System.out.println("User enters valid username and password");
       
    }

    @Then("User is navigated to the Home Page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("User is navigated to the Home Page");
        app.closeBrowser();
    }
}

