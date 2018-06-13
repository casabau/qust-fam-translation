package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.BannerModel;
import models.TopBarModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BannerPage;
import pages.TopBarPage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BannerTest extends BaseTestPublicSite {
    @DataProvider(name = "BannerJson")
    public Iterator<Object[]> jsonBannerDataProvider() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Collection<Object[]> dp = new ArrayList<>();

        File[] files = getListOfFiles("bannerXmas");
        for (File f : files) {
            BannerModel m = objectMapper.readValue(f, BannerModel.class);
            dp.add(new Object[]{m});
        }
        return dp.iterator();
    }

    @Test(dataProvider = "BannerJson")
    public void BannerTranslationTest(BannerModel bannerModel) throws InterruptedException {
        BannerPage bannerPage = PageFactory.initElements(driver, BannerPage.class);
        Thread.sleep(1000);


        driver.get("https://pre.qustodio.com/en/family/premium-20/");
        Assert.assertTrue(bannerPage.isBannerVisible());
        String EnTranslate1 = bannerPage.getEnTranslate1();
        try {
            Assert.assertEquals(bannerModel.getEnTranslate1(), EnTranslate1);
        } catch (AssertionError e) {
            System.out.println("Expected: " + bannerModel.getEnTranslate1() + "\nActual: " + EnTranslate1);
        }

        String EnTranslate2 = bannerPage.getEnTranslate2();
        try {
            Assert.assertEquals(bannerModel.getEnTranslate2(), EnTranslate2);
        } catch (AssertionError e) {
            System.out.println("Expected: " + bannerModel.getEnTranslate2() + "\nActual: " + EnTranslate2);
        }

        driver.get("https://pre.qustodio.com/es/family/premium-20/");
        Assert.assertTrue(bannerPage.isBannerVisible());
        String EsTranslate1 = bannerPage.getEsTranslate1();
        try {
            Assert.assertEquals(bannerModel.getEsTranslate1(), EsTranslate1);
        } catch (AssertionError e) {
            System.out.println("Expected: " + bannerModel.getEsTranslate1() + "\nActual: " + EsTranslate1);
        }

        String EsTranslate2 = bannerPage.getEsTranslate2();
        try {
            Assert.assertEquals(bannerModel.getEsTranslate2(), EsTranslate2);
        } catch (AssertionError e) {
            System.out.println("Expected: " + bannerModel.getEsTranslate2() + "\nActual: " + EsTranslate2);
        }

        driver.get("https://pre.qustodio.com/fr/family/premium-20/");
        Assert.assertTrue(bannerPage.isBannerVisible());
        String FrTranslate1 = bannerPage.getFrTranslate1();
        try {
            Assert.assertEquals(bannerModel.getFrTranslate1(), FrTranslate1);
        } catch (AssertionError e) {
            System.out.println("Expected: " + bannerModel.getFrTranslate1() + "\nActual: " + FrTranslate1);
        }

        String FrTranslate2 = bannerPage.getFrTranslate2();
        try {
            Assert.assertEquals(bannerModel.getFrTranslate2(), FrTranslate2);
        } catch (AssertionError e) {
            System.out.println("Expected: " + bannerModel.getFrTranslate2() + "\nActual: " + FrTranslate2);
        }

        driver.get("https://pre.qustodio.com/it/family/premium-20/");
        Assert.assertTrue(bannerPage.isBannerVisible());
        String ItTranslate1 = bannerPage.getItTranslate1();
        try {
            Assert.assertEquals(bannerModel.getItTranslate1(), ItTranslate1);
        } catch (AssertionError e) {
            System.out.println("Expected: " + bannerModel.getItTranslate1() + "\nActual: " + ItTranslate1);
        }

        String ItTranslate2 = bannerPage.getItTranslate2();
        try {
            Assert.assertEquals(bannerModel.getItTranslate2(), ItTranslate2);
        } catch (AssertionError e) {
            System.out.println("Expected: " + bannerModel.getItTranslate2() + "\nActual: " + ItTranslate2);
        }

        driver.get("https://pre.qustodio.com/pt/family/premium-20/");
        Assert.assertTrue(bannerPage.isBannerVisible());
        String PtTranslate1 = bannerPage.getPtTranslate1();
        try {
            Assert.assertEquals(bannerModel.getPtTranslate1(), PtTranslate1);
        } catch (AssertionError e) {
            System.out.println("Expected: " + bannerModel.getPtTranslate1() + "\nActual: " + PtTranslate1);
        }

        String PtTranslate2 = bannerPage.getPtTranslate2();
        try {
            Assert.assertEquals(bannerModel.getPtTranslate2(), PtTranslate2);
        } catch (AssertionError e) {
            System.out.println("Expected: " + bannerModel.getPtTranslate2() + "\nActual: " + PtTranslate2);
        }

        driver.get("https://pre.qustodio.com/de/family/premium-20/");
        Assert.assertTrue(bannerPage.isBannerVisible());
        String DeTranslate1 = bannerPage.getDeTranslate1();
        try {
            Assert.assertEquals(bannerModel.getDeTranslate1(), DeTranslate1);
        } catch (AssertionError e) {
            System.out.println("Expected: " + bannerModel.getDeTranslate1() + "\nActual: " + DeTranslate1);
        }

        String DeTranslate2 = bannerPage.getDeTranslate2();
        try {
            Assert.assertEquals(bannerModel.getDeTranslate2(), DeTranslate2);
        } catch (AssertionError e) {
            System.out.println("Expected:" + bannerModel.getDeTranslate2() + "\nActual:" + DeTranslate2);
        }



    }

}
