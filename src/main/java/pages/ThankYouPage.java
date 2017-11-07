package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by casab on 11/4/2017.
 */

    public class ThankYouPage {
        WebDriver driver;

        public ThankYouPage(WebDriver driverLn) {
            {
                this.driver = driverLn;
            }
        }

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div/div[1]/div/h1")
    private WebElement thankYouText;

    public String getThankYouMessage(){
        return thankYouText.getText();
    }

    }


