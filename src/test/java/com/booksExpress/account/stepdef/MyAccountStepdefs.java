package com.booksExpress.account.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MyAccountStepdefs {

        @Then("MyAccount page opens")
    public void myAccountPageOpens() {
            System.out.println("MyAccount page opens");
        }

    @Given("Customer is logged in")
    public void customerIsLoggedIn() {
    }

    @And("Customer is on {string} page")
    public void customerIsOnPage() {
    }

    @Given("Customer opens {string} page")
    public void customerOpensPage() {
    }

    @Then("{string} is displayed")
    public void contactDetailsFormIsDisplayed() {
    }

    @When("Customer selects {string} radio button")
    public void customerSelectsGenderRadioButton() {
    }

    @And("Customer adds First Name {string} Last Name {string} phone {string}")
    public void customerAddsFirstNameLastNameLastNamePhone(String firstName, String lastName, String phone) {
        System.out.println(firstName + " " + lastName + " " + phone);
    }

    @Then("{string} page opens with updated information")
    public void contactDetailsPageOpensWithUpdatedInformation() {
    }
}
