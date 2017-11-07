package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.HeaderModel;
import models.HomeSignUpModel;
import models.LoginModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HeaderPage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by casab on 11/3/2017.
 */
public class HeaderElementsURLTest extends BaseTestPublicSite {
    @DataProvider(name = "HeaderPageURLs")
    public Iterator<Object[]> jsonLoginDataProvider() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Collection<Object[]> dp = new ArrayList<>();

        File[] files = getListOfFiles("headerSiteJson");
        for (File f : files) {
            HeaderModel m = objectMapper.readValue(f, HeaderModel.class);
            dp.add(new Object[]{m});
        }
        return dp.iterator();
    }

    @Test(dataProvider = "HeaderPageURLs")
    public void headerUrlsTest (HeaderModel headerModel) throws InterruptedException {
        HeaderPage headerPage = PageFactory.initElements(driver, HeaderPage.class);
        Thread.sleep(1000);

        headerPage.clickHomePageLogo();
        Assert.assertEquals(driver.getCurrentUrl(),headerModel.getLogoHeaderURL() );

        driver.get("http://pre.qustodio.com/en/");
        headerPage.clickFamilyButton();
        Assert.assertEquals(driver.getCurrentUrl(), headerModel.getFamilyButtonHeaderURL());

        driver.get("http://pre.qustodio.com/en/");
        headerPage.clickSchoolButton();
        Assert.assertEquals(driver.getCurrentUrl(), headerModel.getSchoolButtonHeaderURL());

        driver.get("http://pre.qustodio.com/en/");
        headerPage.clickBusinessButton();
        Assert.assertEquals(driver.getCurrentUrl(), headerModel.getBusinessButtonHeaderURL());

        driver.get("http://pre.qustodio.com/en/");
        headerPage.clickHelpHeaderButton();
        Assert.assertEquals(driver.getCurrentUrl(), headerModel.getHelpButtonHeaderURL());

        driver.get("http://pre.qustodio.com/en/");
        headerPage.clickSignUpHeaderButton();
        Assert.assertEquals(driver.getCurrentUrl(), headerModel.getSignUpButtonHeaderURL());

        driver.get("http://pre.qustodio.com/en/");
        headerPage.clickWhyQustodioButton();
        Assert.assertEquals(driver.getCurrentUrl(), headerModel.getWhyQustodioURL());

        driver.get("http://pre.qustodio.com/en/");
        headerPage.clickHowItWorksButton();
        Assert.assertEquals(driver.getCurrentUrl(), headerModel.getHowDoesItWorkURL());

        driver.get("http://pre.qustodio.com/en/");
        headerPage.clickPricingButton();
        Assert.assertEquals(driver.getCurrentUrl(), headerModel.getPricingURL());

        driver.get("http://pre.qustodio.com/en/");
        headerPage.clickDownloadsHeaderButton();
        Assert.assertEquals(driver.getCurrentUrl(), headerModel.getDownloadsHeaderURL());

        driver.get("http://pre.qustodio.com/en/");
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"site-header\"]/div/div[3]/div[2]/div/div/ul/li[1]/a"));

        headerPage.clickLoginHeaderButton();
        Assert.assertEquals(true, dropdown.isDisplayed());
    }
}
