package com.quinbay.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @When("I enter username as{string}")
    public void iEnterUsernameAs(String arg0) {
        System.out.println("username");

    }

    @And("I enter password as{string}")
    public void iEnterPasswordAs(String arg0) {
        System.out.println("password");

    }
    @Then("Login should fail")
    public void loginShouldFail() {

    }

    @Given("I am on facebook login page")
    public void iAmOnFacebookLoginPage() {
        System.out.println("login page ");
    }
}
