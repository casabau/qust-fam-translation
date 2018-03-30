package pages;
import models.LoginModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PremiumPage {
    WebDriver driver;

    public PremiumPage(WebDriver driverLn) {
        {
            this.driver = driverLn;
        }

    }

    @FindBy(how = How.ID, using = "form_name")
    private WebElement nameField;

    @FindBy(how = How.ID, using = "form_email")
    private WebElement emailField;

    @FindBy(how = How.ID, using = "form_repeat_email")
    private WebElement confirmEmailField;

    @FindBy (how = How.ID, using = "form_password")
    private WebElement password;

    @FindBy (how = How.XPATH, using = "/html/body/div/div[2]/div/div[2]/form/button")
    private WebElement createAccountButton;

    @FindBy (how = How.XPATH, using = "//*[@id=\"new_header\"]/div/div[2]/div[2]")
    private WebElement TrialNrOfDay;


    public void PremiumTest() throws InterruptedException {

            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(nameField));
            int nr = (int) (Math.random() * 1000);
            nameField.sendKeys("test");
            emailField.sendKeys("adytestare+" + nr + "@gmail.com");
            confirmEmailField.sendKeys("adytestare+" + nr + "@gmail.com");
            password.sendKeys("test12345");
            createAccountButton.click();
            wait.until(ExpectedConditions.visibilityOf(TrialNrOfDay));

            System.out.println("Account : " +"adytestare+" + nr + "@gmail.com "+ TrialNrOfDay.getText());


    }



}
