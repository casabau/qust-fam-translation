package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class PricingPage {
    WebDriver driver;

    public PricingPage(WebDriver driverLn) {
        {
            this.driver = driverLn;
        }
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div[1]/div[1]/div/h1")
    private WebElement Translation1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div[1]/div[1]/div/p")
    private WebElement Translation2;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div[1]/div[1]/div/div[2]")
    private WebElement Translation3;



    public void CheckTranslation(String translation1,String translation2,String translation3){
        try {
            Assert.assertEquals(Translation1.getText(),translation1);
        }catch (AssertionError e){
            System.out.println("Expected: " +translation1+"\nActual: "+Translation1.getText());
        }

        try {
            Assert.assertEquals(Translation2.getText(),translation2);
        }catch (AssertionError e){
            System.out.println("Expected: " +translation2+"\nActual: "+Translation2.getText());
        }

        try {
            Assert.assertEquals(Translation3.getText(),translation3);
        }catch (AssertionError e){
            System.out.println("Expected: " +translation3+"\nActual: "+Translation3.getText());
        }
    }






}
