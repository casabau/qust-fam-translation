package pages;

import models.HomeSignUpModel;
import models.LoginModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by casab on 11/6/2017.
 */
public class HomeSignUpPage {
    WebDriver driver;

    public HomeSignUpPage(WebDriver driverIn) {
        {
            this.driver = driverIn;
        }
    }

    @FindBy(how = How.ID, using = "home_bottom_form_name")
    private WebElement nameField;

    @FindBy(how = How.ID, using = "home_bottom_form_email")
    private WebElement emailField;

    @FindBy(how = How.ID, using = "home_bottom_form_password")
    private WebElement passwordField;

    @FindBy(how = How.ID, using = "home_bottom_form_name_error")
    private WebElement nameFieldError;

    @FindBy(how = How.ID, using = "home_bottom_form_email_error")
    private WebElement emailFieldError;

    @FindBy(how = How.ID, using = "home_bottom_form_password_error")
    private WebElement passwordFieldError;

    @FindBy(how = How.XPATH, using = "//*[@id=\"home_bottom_form\"]/div[1]/div[4]/input")
    private WebElement getStartedFreeButton;

    /* public void clickGetStartedFreeButton() throws InterruptedException{
        this.getStartedFreeButton.click();
    } */

    public void clickNameField() throws InterruptedException {
        this.nameField.click();
    }

    public void clickEmailField() throws InterruptedException {
        this.emailField.click();
    }

    public void clickPasswordField() throws InterruptedException {
        this.passwordField.click();
    }


    public void HomeSignUpFlow(HomeSignUpModel model) throws InterruptedException {
        driver.get("https://pre.qustodio.com/en/");

        Thread.sleep(1000);

        nameField.click();
        nameField.clear();
        nameField.sendKeys(model.getNameHomeField());

        emailField.click();
        emailField.clear();
        emailField.sendKeys(model.getEmailHomeField());

        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(model.getPassHomeField());

        getStartedFreeButton.click();
    }
}
