package StepDefinition;

import POM.DialogContentElements;
import POM.NavigationBarElements;
import io.cucumber.java.en.*;

public class CitizenshipSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElements dialogContentElements;

    @When("User create Citizenship with {string} name and {string} shortname")
    public void user_create_citizenship_with_name_and_shortname(String name, String shortName) {

        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToCitizenshipPage();
        dialogContentElements.createCitizenship(name, shortName);

    }

    @When("User edit {string} citizenship to {string}")
    public void user_edit_citizenship_to(String name2, String name3) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToCitizenshipPage();
        dialogContentElements.editCitizenship(name2, name3);

    }
    @When("User delete {string} citizenship")
    public void user_delete_citizenship(String name3) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElements = new DialogContentElements();

        navigationBarElements.navigateToCitizenshipPage();
        dialogContentElements.deleteCitizenship(name3);

    }
}
