package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.PricingPageModel;
import models.TopBarModel;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.PricingPage;
import pages.TopBarPage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by casab on 11/2/2017.
 */
public class PricingPageTest extends BaseTestPublicSite {

    @DataProvider(name = "TranslationJson")
    public Iterator<Object[]> jsonTranslationDataProvider() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Collection<Object[]> dp = new ArrayList<>();

        File[] files = getListOfFiles("PricingPage");
        for (File f : files) {
            PricingPageModel m = objectMapper.readValue(f, PricingPageModel.class);
            dp.add(new Object[]{m});
        }
        return dp.iterator();
    }

    @Test(dataProvider = "TranslationJson")
    public void topBarTranslationTest(PricingPageModel pricingPageModel) throws InterruptedException {

        PricingPage pricingPage = PageFactory.initElements(driver, PricingPage.class);
        WebDriverWait wait=new WebDriverWait(driver,20);
        driver.get("https://pre.qustodio.com/en/family/premium/");
        wait.until(ExpectedConditions.urlContains("https://pre.qustodio.com/en/family/premium/"));
        pricingPage.CheckTranslation(pricingPageModel.getEnTranslate(),pricingPageModel.getEnTranslate2(),pricingPageModel.getEnTranslate3());

        driver.get("https://pre.qustodio.com/es/family/premium/");
        wait.until(ExpectedConditions.urlContains("https://pre.qustodio.com/es/family/premium/"));
        pricingPage.CheckTranslation(pricingPageModel.getEsTranslate(),pricingPageModel.getEsTranslate2(),pricingPageModel.getEsTranslate3());

        driver.get("https://pre.qustodio.com/fr/family/premium/");
        wait.until(ExpectedConditions.urlContains("https://pre.qustodio.com/fr/family/premium/"));
        pricingPage.CheckTranslation(pricingPageModel.getFrTranslate(),pricingPageModel.getFrTranslate2(),pricingPageModel.getFrTranslate3());


        driver.get("https://pre.qustodio.com/it/family/premium/");
        wait.until(ExpectedConditions.urlContains("https://pre.qustodio.com/it/family/premium/"));
        pricingPage.CheckTranslation(pricingPageModel.getItTranslate(),pricingPageModel.getItTranslate2(),pricingPageModel.getItTranslate3());


        driver.get("https://pre.qustodio.com/it/family/premium/");
        wait.until(ExpectedConditions.urlContains("https://pre.qustodio.com/it/family/premium/"));
        pricingPage.CheckTranslation(pricingPageModel.getItTranslate(),pricingPageModel.getItTranslate2(),pricingPageModel.getItTranslate3());

        driver.get("https://pre.qustodio.com/pt/family/premium/");
        wait.until(ExpectedConditions.urlContains("https://pre.qustodio.com/pt/family/premium/"));
        pricingPage.CheckTranslation(pricingPageModel.getPtTranslate(),pricingPageModel.getPtTranslate2(),pricingPageModel.getPtTranslate3());

        driver.get("https://pre.qustodio.com/de/family/premium/");
        wait.until(ExpectedConditions.urlContains("https://pre.qustodio.com/de/family/premium/"));
        pricingPage.CheckTranslation(pricingPageModel.getDeTranslate(),pricingPageModel.getDeTranslate2(),pricingPageModel.getDeTranslate3());

        driver.get("https://pre.qustodio.com/ja/family/premium/");
        wait.until(ExpectedConditions.urlContains("https://pre.qustodio.com/ja/family/premium/"));
        pricingPage.CheckTranslation(pricingPageModel.getJapTranslate(),pricingPageModel.getJapTranslate2(),pricingPageModel.getJapTranslate3());

        driver.get("https://pre.qustodio.com/zh-Hans/family/premium/");
        wait.until(ExpectedConditions.urlContains("https://pre.qustodio.com/zh-Hans/family/premium/"));
        pricingPage.CheckTranslation(pricingPageModel.getZhTranslate(),pricingPageModel.getZhTranslate2(),pricingPageModel.getZhTranslate3());





    }

}
