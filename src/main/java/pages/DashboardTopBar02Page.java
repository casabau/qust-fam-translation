package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardTopBar02Page {
    WebDriver driver;

    public DashboardTopBar02Page(WebDriver driverLn) {
        {
            this.driver = driverLn;
        }
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div")
    private WebElement enTranslation;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div")
    private WebElement esTranslation;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div")
    private WebElement frTranslation;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div")
    private WebElement ptTranslation;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div")
    private WebElement itTranslation;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div")
    private WebElement deTranslation;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div")
    public WebElement TopBar;

    @FindBy(how = How.XPATH, using = "//*[@id=\"login_form\"]/ul/li[1]/input")
    private WebElement emailField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"login_form\"]/ul/li[2]/input")
    private WebElement passwordField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"login_button\"]/span")
    private WebElement loginButton;

    @FindBy (how = How.XPATH, using = "//*[@id=\"LoginFailed\"]/div")
    private WebElement loginError;

    @FindBy (how = How.XPATH, using = "//*[@id=\"cboxClose\"]")
    private WebElement closeBaner;

    @FindBy (how = How.XPATH, using = " //*[@id=\"new_header\"]/div/div[2]/div[1]/div[1]/div/div")
    private WebElement profileButton;

    @FindBy (how = How.XPATH, using = " //*[@id=\"new_header\"]/div/div[2]/div[1]/div[1]/ul/li[1]/a")
    private WebElement settingsButton;

    @FindBy (how = How.XPATH, using = " //*[@id=\"accountInfo-form\"]/p")
    private WebElement yourAccountButton;

    @FindBy (how = How.XPATH, using = "  //*[@id=\"selMQQ_chzn\"]/a/span")
    private WebElement language;

    @FindBy (how = How.XPATH, using = "//*[@id=\"accountInfo-form\"]/div[3]/button[1]")
    private WebElement saveButton;

    @FindBy (how = How.XPATH, using = "//*[@id=\"selXIT_chzn\"]/a")
    private WebElement clickSelect;

    @FindBy (how = How.XPATH, using = " //*[@id=\"cboxContent\"]")
    private WebElement flyover;



    public void LoginFlow() throws InterruptedException {
        //driver.get("http://fp-pre.qustodio.com");
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.click();
        emailField.clear();
        emailField.sendKeys("adytestare+bts-free@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys("test12345");
        loginButton.click();
    }



    public String getEnTranslationText(){
        return this.enTranslation.getText();
    }

    public String getEsTranslationText(){
        return this.esTranslation.getText();
    }

    public String getFrTranslationText(){
        return this.frTranslation.getText();
    }

    public String getPtTranslationText(){
        return this.ptTranslation.getText();
    }

    public String getItTranslationText(){
        return this.itTranslation.getText();
    }

    public String getDeTranslationText(){
        return this.deTranslation.getText();
    }

    public void clickTopBar(){
        this.TopBar.click();
    }

    public boolean isTopBarVisible(){
        return TopBar.isDisplayed();
    }

    public void closeBanner(){
        this.closeBaner.click();
    }

    public void clickSelect(){
        this.clickSelect.click();
    }

    public void ChangeLanguage(String value) throws InterruptedException{
        WebDriverWait wait=new WebDriverWait(driver,10);
        driver.get("https://fp-pre.qustodio.com/user-activity/summary");
        //Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(profileButton));

        profileButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(settingsButton));
        settingsButton.click();
        wait.until(ExpectedConditions.visibilityOf(yourAccountButton));
        yourAccountButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"account-settings\"]")));
        driver.findElement(By.xpath("//*[@id=\"account-settings\"]")).click();
        JavascriptExecutor executor= (JavascriptExecutor)driver;
        //Thread.sleep(2000);
        executor.executeScript("document.getElementsByName('lang')[0].style.display='block';");
        Select select = new Select(driver.findElement(By.name("lang")));
        select.selectByValue(value);


        saveButton.click();
        //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"accountInfo-form\"]/div[3]/button[1]/span")));
        driver.get("https://fp-pre.qustodio.com");

    }

}
