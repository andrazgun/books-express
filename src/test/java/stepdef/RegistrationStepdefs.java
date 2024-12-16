package stepdef;

import io.cucumber.java.en.When;

import java.util.List;

public class RegistrationStepdefs {
        @When("Customer register with details")
        public void customerRegister(List<String> data) {
                System.out.println(data.get(0));
        }
}
