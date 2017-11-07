package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by casab on 11/4/2017.
 */
public class DownloadsBannerPage {
    WebDriver driver;

    public DownloadsBannerPage(WebDriver driverLn) {
        {
            this.driver = driverLn;
        }
    }

    @FindBy (how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div/div[1]/div[1]/a")
    private WebElement protectThisWindowsButton;

    @FindBy (how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div/div[1]/div[2]/a")
    private WebElement clickHereGreenBanButton;



    public void clickProtectthisWinButton() throws InterruptedException {
        this.protectThisWindowsButton.click();
    }


    public void clickGreenClickHereButton() throws InterruptedException {
        this.clickHereGreenBanButton.click();
    }


}
