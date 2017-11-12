package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TopBarTranslationPage {
    WebDriver driver;

    public TopBarTranslationPage(WebDriver driverLn) {
        {
            this.driver = driverLn;
        }
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"site-header\"]/a/div")
    private WebElement enTranslation;

    @FindBy(how = How.XPATH, using = "//*[@id=\"site-header\"]/a/div")
    private WebElement esTranslation;

    @FindBy(how = How.XPATH, using = "//*[@id=\"site-header\"]/a/div")
    private WebElement frTranslation;

    @FindBy(how = How.XPATH, using = "//*[@id=\"site-header\"]/a/div")
    private WebElement ptTranslation;

    @FindBy(how = How.XPATH, using = "//*[@id=\"site-header\"]/a/div")
    private WebElement itTranslation;

    @FindBy(how = How.XPATH, using = "//*[@id=\"site-header\"]/a/div")
    private WebElement deTranslation;

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
}
