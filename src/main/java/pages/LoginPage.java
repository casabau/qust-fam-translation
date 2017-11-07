package pages;
import models.LoginModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driverLn) {
        {
            this.driver = driverLn;
        }

    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"login_form\"]/ul/li[1]/input")
    private WebElement emailField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"login_form\"]/ul/li[2]/input")
    private WebElement passwordField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"login_button\"]/span")
    private WebElement loginButton;

    @FindBy (how = How.XPATH, using = "//*[@id=\"LoginFailed\"]/div")
    private WebElement loginError;


    public void LoginFlow(LoginModel model) throws InterruptedException {
        driver.get("http://fp-pre.qustodio.com");
        emailField.click();
        emailField.clear();
        emailField.sendKeys(model.getEmailAddress());
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(model.getPassword());
        loginButton.click();
    }

    public String getLoginError(){
        return loginError.getText();
    }

}
