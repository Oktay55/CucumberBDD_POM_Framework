package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class DialogContentElements extends BasePOM {

    public DialogContentElements() {
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[contains(@placeholder, 'FIELD.NAME')]//input")
    private WebElement searchNameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']")
    private WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(), 'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button[@class='ng-star-inserted']")
    private WebElement editButton;

    @FindBy(xpath = "//ms-delete-button[@class='ng-star-inserted']")
    private WebElement deleteButton;

    @FindBy(xpath = "(//div[@class='ng-star-inserted']//button)[2]")
    private WebElement deleteButton2;

    private String countryName = "Samsun";
    private String code = "5555";

    private String editCountryName = "Istanbul";

    private String editCode = "3434";


    public void userCreateCountryName() {
        addButton.click();
        nameInput.sendKeys(countryName);
        codeInput.sendKeys(code);
        saveButton.click();

    }
        public void userEditCounty() {
            searchNameInput.sendKeys(countryName);
            searchButton.click();
            editButton.click();
            nameInput.clear();
            nameInput.sendKeys(editCountryName);
            codeInput.clear();
            codeInput.sendKeys(editCode);
            saveButton.click();

        }

        public void userDeleteCountry() {
        searchNameInput.sendKeys(editCountryName);
        searchButton.click();
        waitUntilVisibleAndClickableThenClick(deleteButton);
        waitUntilVisibleAndClickableThenClick(deleteButton2);



    }
    public void validateSuccessMessage() {
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        Assert.assertTrue(successMessage.getText().contains("success".toLowerCase()));




    }


}
