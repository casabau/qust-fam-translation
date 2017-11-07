package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by casab on 11/6/2017.
 */
public class DownloadsOSsPage {
    WebDriver driver;

    public DownloadsOSsPage(WebDriver driverLn) {
        {
            this.driver = driverLn;
        }
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div/div[2]/div/div[2]/div/div[1]/div/a")
    private WebElement clickDonwlMacButton;

    @FindBy (how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div/div[2]/div/div[2]/div/div[2]/div/a")
    private WebElement clickDonwlAndrButton;

    @FindBy (how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div/div[2]/div/div[2]/div/div[3]/div/a")
    private WebElement clickDonwlIOSButton;

    @FindBy (how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div/div[2]/div/div[2]/div/div[4]/div/a")
    private WebElement clickDonwlKindleButton;

    public void clickDownlMacButton() throws InterruptedException {
        this.clickDonwlMacButton.click();
    }

    public void clickDownlIOSButton() throws InterruptedException {
        this.clickDonwlIOSButton.click();
    }

    public void clickDownlAndrButton() throws InterruptedException {
        this.clickDonwlAndrButton.click();
    }

    public void clickDownlKindleButton() throws InterruptedException {
        this.clickDonwlKindleButton.click();
    }
}