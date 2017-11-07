package pages;

import models.HomeSignUpModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by casab on 11/3/2017.
 */
public class HeaderPage {
    WebDriver driver;

    public HeaderPage(WebDriver driverLn) {
        {
            this.driver = driverLn;
        }
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"site-header\"]/div/div[1]/a")
    private WebElement logoHeader;

    @FindBy(how = How.XPATH, using = "//*[@id=\"site-header\"]/div/div[2]/ul[1]/li[1]/a")
    private WebElement familyButton;

    @FindBy (how = How.XPATH, using = "//*[@id=\"site-header\"]/div/div[2]/ul[1]/li[2]/a")
    private WebElement schoolButton;

    @FindBy (how = How.XPATH, using = "//*[@id=\"site-header\"]/div/div[2]/ul[1]/li[3]/a")
    private WebElement businessButton;

    @FindBy (how = How.XPATH, using = "//*[@id=\"site-header\"]/div/div[2]/ul[1]/li[4]/a")
    private WebElement helpHeaderButton;

    @FindBy (how = How.XPATH, using = "//*[@id=\"site-header\"]/div/div[3]/div[1]/a")
    private WebElement signUpHeaderButton;

    @FindBy (how = How.XPATH, using = "//*[@id=\"site-header\"]/div/div[3]/div[2]/div/a")
    private WebElement loginHeaderButton;

    @FindBy (how = How.XPATH, using = "//*[@id=\"site-header\"]/div/div[2]/ul[2]/li[1]/a")
    private WebElement whyQustodioButton;

    @FindBy (how = How.XPATH, using = "//*[@id=\"site-header\"]/div/div[2]/ul[2]/li[2]/a")
    private WebElement howItWorksButton;

    @FindBy (how = How.XPATH, using = "//*[@id=\"site-header\"]/div/div[2]/ul[2]/li[3]/a")
    private WebElement pricingButton;

    @FindBy (how = How.XPATH, using = "//*[@id=\"site-header\"]/div/div[2]/ul[2]/li[4]/a")
    private WebElement downloadsHeaderButton;

    @FindBy (how = How.XPATH, using = "//*[@id=\"page\"]/div[1]/div[2]")
    private WebElement versionIndicator;


//    public String whatVersion = this.versionIndicator.getText();


    public void clickHomePageLogo() throws InterruptedException {
        this.logoHeader.click();
    }

    public void clickWhyQustodioButton() throws InterruptedException {
        this.whyQustodioButton.click();
    }

    public void clickHowItWorksButton() throws InterruptedException {
        this.howItWorksButton.click();
    }

    public void clickPricingButton() throws InterruptedException {
        this.pricingButton.click();
    }

    public void clickDownloadsHeaderButton() throws InterruptedException {
        this.downloadsHeaderButton.click();
    }

    public void clickFamilyButton() throws InterruptedException {
        this.familyButton.click();
    }

    public void clickSchoolButton() throws InterruptedException {
        this.schoolButton.click();
    }

    public void clickBusinessButton() throws InterruptedException {
        this.businessButton.click();
    }

    public void clickHelpHeaderButton() throws InterruptedException {
        this.helpHeaderButton.click();
    }

    public void clickSignUpHeaderButton() throws InterruptedException {
        this.signUpHeaderButton.click();
    }

    public void clickLoginHeaderButton() throws InterruptedException {
        this.loginHeaderButton.click();
    }


}
