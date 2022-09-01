package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NavigationBarElements extends BasePOM {

    public NavigationBarElements () {
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//span[text()='Setup']")
    private WebElement setupButton;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parametersButton;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countriesButton;


    public void userSelectsCountriesFromNavigationBar() {
        setupButton.click();
        parametersButton.click();
        countriesButton.click();
    }


}