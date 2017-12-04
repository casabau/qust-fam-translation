package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BannerPage {
    WebDriver driver;

    public BannerPage(WebDriver driverLn) {
        {
            this.driver = driverLn;
        }
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div[1]/div[1]")
    private WebElement banner;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div[1]/div[1]/div/h1")
    private WebElement enTranslate1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div[1]/div[1]/div/p")
    private WebElement enTranslate2;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div[1]/div[1]/div/h1")
    private WebElement esTranslate1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div[1]/div[1]/div/p")
    private WebElement esTranslate2;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div[1]/div[1]/div/h1")
    private WebElement frTranslate1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div[1]/div[1]/div/p")
    private WebElement frTranslate2;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div[1]/div[1]/div/h1")
    private WebElement itTranslate1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div[1]/div[1]/div/p")
    private WebElement itTranslate2;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div[1]/div[1]/div/h1")
    private WebElement ptTranslate1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div[1]/div[1]/div/p")
    private WebElement ptTranslate2;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div[1]/div[1]/div/h1")
    private WebElement deTranslate1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div[1]/div[1]/div/p")
    private WebElement deTranslate2;


    public String getEnTranslate1(){
      return this.enTranslate1.getText();
    }

    public String getEnTranslate2(){
        return this.enTranslate2.getText();
    }

    public String getEsTranslate1(){
        return this.esTranslate1.getText();
    }

    public String getEsTranslate2(){
        return this.esTranslate2.getText();
    }

    public String getFrTranslate1(){
        return this.frTranslate1.getText();
    }

    public String getFrTranslate2(){
        return this.frTranslate2.getText();
    }

    public String getItTranslate1(){
        return this.itTranslate1.getText();
    }

    public String getItTranslate2(){
        return this.itTranslate2.getText();
    }

    public String getPtTranslate1(){
        return this.ptTranslate1.getText();
    }

    public String getPtTranslate2(){
        return this.ptTranslate2.getText();
    }

    public String getDeTranslate1(){
        return this.deTranslate1.getText();
    }

    public String getDeTranslate2(){
        return this.deTranslate2.getText();
    }

    public boolean isBannerVisible(){
        return this.banner.isDisplayed();
    }
}
