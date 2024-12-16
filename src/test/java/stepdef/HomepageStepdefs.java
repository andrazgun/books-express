package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomepageStepdefs {

    @Given("Customer is on Homepage")
    public void customerIsOnHomepage() {
//        homePage.openPage();
        System.out.println("The customer is on the Homepage");

    }

    @When("Customer hover over {string} drop menu")
    public void customerHoverOverAccountDropMenu(String dropMenu) {
        System.out.println("The customer hovers over " + dropMenu + " drop menu.");
    }

    @Then("{string} button is displayed")
    public void buttonIsDisplayed(String button) {
        System.out.println(button + " button is displayed.");
    }

    @When("Customer clicks {string} button")
    public void customerClicksButton(String button) {
        System.out.println(button + " button is clicked");
    }

    @Then("{string} page opens")
    public void pageOpens() {
        System.out.println("Page opens");
    }

    @When("Customer login with username {string} and password {string}")
    public void loginWithUsernameAndPassword(String username, String password) {
//        System.out.println("Login with {} and {}", username, password);
        System.out.println(username + ", " + password);
    }

    @When("Customer hover over Wishlist drop menu")
    public void customerHoverOverWishlistDropMenu() {
        
    }

    @Then("Wishlist button is displayed")
    public void wishlistButtonIsDisplayed() {
    }
}
