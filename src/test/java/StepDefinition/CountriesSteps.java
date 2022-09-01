package StepDefinition;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.*;

public class CountriesSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @When("User create Country")
    public void user_create_country() {
        navigationBarElements = new NavigationBarElements();
        navigationBarElements.userSelectsCountriesFromNavigationBar();

        dialogContentElements = new DialogContentElements();
        dialogContentElements.userCreateCountryName();


    }
    @When("User edit Country")
    public void user_edit_country() {
        navigationBarElements = new NavigationBarElements();
        navigationBarElements.userSelectsCountriesFromNavigationBar();

        dialogContentElements = new DialogContentElements();
        dialogContentElements.userEditCounty();

    }

    @When("User delete Country")
    public void user_delete_country() {
        navigationBarElements = new NavigationBarElements();
        navigationBarElements.userSelectsCountriesFromNavigationBar();

        dialogContentElements = new DialogContentElements();
        dialogContentElements.userDeleteCountry();

    }
    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {
        dialogContentElements = new DialogContentElements();
        dialogContentElements.validateSuccessMessage();




    }
}
