package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class BannerPurchasePage {
    WebDriver driver;

    public BannerPurchasePage(WebDriver driverLn) {
        {
            this.driver = driverLn;
        }
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div[1]/div[1]")
    private WebElement banner;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div[1]/div[1]/div[2]/div/div[2]/a")
    private WebElement buyMediumButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[2]/div[1]/div[1]/div[2]/div/div[3]/a")
    private WebElement buyLarge;

    @FindBy(how = How.XPATH, using = "//*[@id=\"iFrameResizer0\"]")
    private WebElement iFrame;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/p[2]/a")
    private WebElement logInLink;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/form/div[1]/input")
    private WebElement emailInput;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/form/div[2]/input")
    private WebElement passwordInput;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/form/p[1]/button")
    private WebElement signInButton;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[4]/a")
    private WebElement noThanks;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cb-order-total\"]/div[2]")
    private WebElement currentPrice;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cb-apply-coupon-code\"]")
    private WebElement discountInput;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cb-apply-coupon-code-btn\"]")
    private WebElement applyDiscount;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cb-order-total\"]/div[2]")
    private WebElement reducedPrice;

    @FindBy(how = How.XPATH, using = "//*[@id=\"billing_address[first_name]\"]")
    private WebElement firstName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"billing_address[last_name]\"]")
    private WebElement lastName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"billing_address[country]\"]")
    private WebElement country;

    @FindBy(how = How.XPATH, using = "//*[@id=\"card[number]\"]")
    private WebElement cardNumber;

    @FindBy(how = How.XPATH, using = "//*[@id=\"card[expiry_month]\"]")
    private WebElement expiry;

    @FindBy(how = How.XPATH, using = "//*[@id=\"card[expiry_year]\"]")
    private WebElement year;

    @FindBy(how = How.XPATH, using = "//*[@id=\"card[cvv]\"]")
    private WebElement cvv;

    @FindBy(how = How.XPATH, using = "//*[@id=\"hosted_pages_checkout_v2_submit\"]/div[4]/div[2]/div[1]/input")
    private WebElement buy;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/img[1]")
    private WebElement successPic;


    public void PurchaseMediumPackage(String url,String Coupon) throws InterruptedException {

        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(banner));
        wait.until(ExpectedConditions.visibilityOf(buyMediumButton));

        buyMediumButton.click();

        driver.switchTo().frame("iFrameResizer0");

        //wait.until(ExpectedConditions.visibilityOf(logInLink));
        logInLink.click();

        wait.until(ExpectedConditions.visibilityOf(emailInput));
        emailInput.sendKeys("adytestare+613a@gmail.com");
        wait.until(ExpectedConditions.visibilityOf(passwordInput));
        passwordInput.sendKeys("test12345");
        wait.until(ExpectedConditions.visibilityOf(signInButton));
        signInButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(noThanks));
        noThanks.click();
        wait.until(ExpectedConditions.urlContains("https://qustodio-test.chargebee.com"));
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(currentPrice));
        System.out.print(currentPrice.getText());
        Thread.sleep(2000);
        Assert.assertEquals(currentPrice.getText(),"$96.95");

        wait.until(ExpectedConditions.visibilityOf(discountInput));
        Thread.sleep(3000);
        discountInput.sendKeys(Coupon);



        applyDiscount.click();

        Thread.sleep(5000);

        Assert.assertEquals( driver.findElement(By.xpath("//*[@id=\"cb-order-total\"]/div[2]")).getText(),"$77.56");

       /* Actions actions=new Actions(driver);
        actions.moveToElement(buy);
        actions.perform();*/
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", buy);
        firstName.sendKeys("test");

        lastName.sendKeys("test");

        Select dropdown=new Select(country);
        country.click();
        dropdown.selectByVisibleText("Algeria");

        cardNumber.sendKeys("4111 1111 1111 1111");

        Select dropdown2=new Select(expiry);
        expiry.click();
        dropdown2.selectByVisibleText("12");

        Select dropdown3=new Select(year);
        year.click();
        dropdown3.selectByVisibleText("2019");

        cvv.sendKeys("666");

        buy.click();

        wait.until(ExpectedConditions.visibilityOf(successPic));

    }


    public void PurchaseLargePackage(String url,String Coupon) throws InterruptedException {

        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(banner));
        wait.until(ExpectedConditions.visibilityOf(buyLarge));

        buyLarge.click();

        driver.switchTo().frame("iFrameResizer0");

        //wait.until(ExpectedConditions.visibilityOf(logInLink));
        logInLink.click();

        wait.until(ExpectedConditions.visibilityOf(emailInput));
        emailInput.sendKeys("adytestare+613a@gmail.com");
        wait.until(ExpectedConditions.visibilityOf(passwordInput));
        passwordInput.sendKeys("test12345");
        wait.until(ExpectedConditions.visibilityOf(signInButton));
        signInButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(noThanks));
        noThanks.click();
        wait.until(ExpectedConditions.urlContains("https://qustodio-test.chargebee.com"));
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(currentPrice));
        System.out.print(currentPrice.getText());
        Thread.sleep(2000);
        Assert.assertEquals(currentPrice.getText(),"$137.95");
        driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.visibilityOf(discountInput));
        Thread.sleep(3000);
        discountInput.sendKeys(Coupon);



        applyDiscount.click();

        Thread.sleep(5000);

        Assert.assertEquals( driver.findElement(By.xpath("//*[@id=\"cb-order-total\"]/div[2]")).getText(),"$110.36");

       // Actions actions=new Actions(driver);
       // actions.moveToElement(buy);
       // actions.perform();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", buy);

        firstName.sendKeys("test");

        lastName.sendKeys("test");

        Select dropdown=new Select(country);
        country.click();
        dropdown.selectByVisibleText("Algeria");

        cardNumber.sendKeys("4111 1111 1111 1111");

        Select dropdown2=new Select(expiry);
        expiry.click();
        dropdown2.selectByVisibleText("12");

        Select dropdown3=new Select(year);
        year.click();
        dropdown3.selectByVisibleText("2019");

        cvv.sendKeys("666");

        buy.click();

        wait.until(ExpectedConditions.visibilityOf(successPic));

    }

}
