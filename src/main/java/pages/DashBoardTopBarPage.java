package pages;

import models.LoginModel;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardTopBarPage {
    WebDriver driver;

    public DashBoardTopBarPage(WebDriver driverLn) {
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

    @FindBy(how = How.XPATH, using = "//*[@id=\"site-header\"]/a")
    private WebElement TopBar;

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



    public void LoginFlow() throws InterruptedException {
        driver.get("http://fp-pre.qustodio.com");
        emailField.click();
        emailField.clear();
        emailField.sendKeys("adytestare+pre2011@gmail.com");
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
        //this.closeBaner.click();
    }

    public void clickSelect(){
        this.clickSelect.click();
    }

    public void ChangeLanguage(int index) throws InterruptedException{
        Thread.sleep(5000);
        profileButton.click();
        settingsButton.click();
        yourAccountButton.click();
        Thread.sleep(5000);

        //driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/iframe")));
        //clickSelect.click();
        //driver.findElement(By.className("chzn-drop")).click();
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("document.getElementByName('lang').sty‌​le.display='block';");

        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lang")));
        //driver.findElement(By.name("lang")).click();
        //Select dropdown = new Select(driver.findElement(By.name("lang")));
        //dropdown.deselectAll();
        //dropdown.selectByIndex(index);


        /*JavascriptExecutor executor= (JavascriptExecutor)driver;
        executor.executeScript("document.getElementsByTagName('select').style.display='block';");
        Select select = new Select(driver.findElement(By.tagName("select")));
        select.selectByVisibleText("Spanish");
        */
        /*Thread.sleep(6000);
        WebElement hiddenWebElement =driver.findElement(By.name("lang"));
        ((JavascriptExecutor)driver).executeScript("document.getElementsByName('lang')[0].click");

        hiddenWebElement.click();*/
        //driver.findElement(By.cssSelector("[a.chzn-single]")).click();
        //driver.findElement(By.cssSelector("select#selL3T.chzn-done")).click();

        driver.findElement(By.xpath("//*[@id=\"accountInfo-form\"]/div[2]/dl/dd[4]")).click();
        JavascriptExecutor executor= (JavascriptExecutor)driver;
        executor.executeScript("document.getElementsByName('lang')[0].style.display='block';");
        Select select = new Select(driver.findElement(By.name("lang")));
        select.selectByValue("es");
        Thread.sleep(6000);
        //driver.findElement(By.xpath("//*[@id=\"selVTJ\"]")).click();
      //Select select = new Select(driver.findElement(By.name("lang")));
      //driver.findElement(By.name("lang")).click();
      //select.selectByVisibleText("Italiano");


        Thread.sleep(5000);
        //Select select = new Select(driver.findElement(By.name("lang")));
        saveButton.click();

    }


}
