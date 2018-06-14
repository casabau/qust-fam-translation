package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.BannerModel;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BannerPage;
import pages.BannerPurchasePage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BannerPurchaseTest extends BaseTestPublicSite {
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

    @Test(dataProvider = "BannerJson",priority = 1)
    public void BannerPuchaseSmallPackegeTestEn(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage bannerPurchasePage = PageFactory.initElements(driver, BannerPurchasePage.class);
        Thread.sleep(1000);

        bannerPurchasePage.PurchaseSmallPackage("https://pre.qustodio.com/en/family/premium-20/","SuMMer");




    }




    @Test(dataProvider = "BannerJson",priority = 2)
    public void BannerPuchaseMediumPackegeTestEn(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage bannerPurchasePage = PageFactory.initElements(driver, BannerPurchasePage.class);
        Thread.sleep(1000);

        bannerPurchasePage.PurchaseMediumPackage("https://pre.qustodio.com/en/family/premium-20/","SuMMer");




    }


    @Test(dataProvider = "BannerJson",priority = 3)
    public void BannerPuchaseLargePackegeTestEn(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage bannerPurchasePage = PageFactory.initElements(driver, BannerPurchasePage.class);
        Thread.sleep(1000);

        bannerPurchasePage.PurchaseLargePackage("https://pre.qustodio.com/en/family/premium-20/","SuMMER");




    }


    @Test(dataProvider = "BannerJson",priority = 4)
    public void BannerPuchaseSmallPackegeTestEs(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage bannerPurchasePage = PageFactory.initElements(driver, BannerPurchasePage.class);
        Thread.sleep(1000);

        bannerPurchasePage.PurchaseSmallPackage("https://pre.qustodio.com/es/family/premium-20/","SuMMer");




    }






    @Test(dataProvider = "BannerJson",priority = 5)
    public void BannerPuchaseMediumPackegeTestEs(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage bannerPurchasePage = PageFactory.initElements(driver, BannerPurchasePage.class);
        Thread.sleep(1000);

        bannerPurchasePage.PurchaseMediumPackage("https://pre.qustodio.com/es/family/premium-20/","SuMMer");




    }


    @Test(dataProvider = "BannerJson",priority = 6)
    public void BannerPuchaseLargePackegeTestEs(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage bannerPurchasePage = PageFactory.initElements(driver, BannerPurchasePage.class);
        Thread.sleep(1000);

        bannerPurchasePage.PurchaseLargePackage("https://pre.qustodio.com/es/family/premium-20/","SuMMER");




    }

    @Test(dataProvider = "BannerJson",priority = 7)
    public void BannerPuchaseSmallPackegeTestFr(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage bannerPurchasePage = PageFactory.initElements(driver, BannerPurchasePage.class);
        Thread.sleep(1000);

        bannerPurchasePage.PurchaseSmallPackage("https://pre.qustodio.com/fr/family/premium-20/","SuMMer");




    }


    @Test(dataProvider = "BannerJson",priority = 8)
    public void BannerPuchaseMediumPackegeTestFr(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage bannerPurchasePage = PageFactory.initElements(driver, BannerPurchasePage.class);
        Thread.sleep(1000);

        bannerPurchasePage.PurchaseMediumPackage("https://pre.qustodio.com/fr/family/premium-20/","SuMMer");




    }


    @Test(dataProvider = "BannerJson",priority = 9)
    public void BannerPuchaseLargePackegeTestFr(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage bannerPurchasePage = PageFactory.initElements(driver, BannerPurchasePage.class);
        Thread.sleep(1000);

        bannerPurchasePage.PurchaseLargePackage("https://pre.qustodio.com/fr/family/premium-20/","SuMMER");




    }

    @Test(dataProvider = "BannerJson",priority = 10)
    public void BannerPuchaseSmallPackegeTestIt(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage bannerPurchasePage = PageFactory.initElements(driver, BannerPurchasePage.class);
        Thread.sleep(1000);

        bannerPurchasePage.PurchaseSmallPackage("https://pre.qustodio.com/it/family/premium-20/","SuMMer");




    }



    @Test(dataProvider = "BannerJson",priority = 11)
    public void BannerPuchaseMediumPackegeTestIt(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage bannerPurchasePage = PageFactory.initElements(driver, BannerPurchasePage.class);
        Thread.sleep(1000);

        bannerPurchasePage.PurchaseMediumPackage("https://pre.qustodio.com/it/family/premium-20/","SuMMer");




    }


    @Test(dataProvider = "BannerJson",priority = 12)
    public void BannerPuchaseLargePackegeTestIt(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage bannerPurchasePage = PageFactory.initElements(driver, BannerPurchasePage.class);
        Thread.sleep(1000);

        bannerPurchasePage.PurchaseLargePackage("https://pre.qustodio.com/it/family/premium-20/","SuMMER");




    }

    @Test(dataProvider = "BannerJson",priority = 13)
    public void BannerPuchaseSmallPackegeTestPt(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage bannerPurchasePage = PageFactory.initElements(driver, BannerPurchasePage.class);
        Thread.sleep(1000);

        bannerPurchasePage.PurchaseSmallPackage("https://pre.qustodio.com/pt/family/premium-20/","SuMMer");




    }


    @Test(dataProvider = "BannerJson",priority = 14)
    public void BannerPuchaseMediumPackegeTestPt(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage bannerPurchasePage = PageFactory.initElements(driver, BannerPurchasePage.class);
        Thread.sleep(1000);

        bannerPurchasePage.PurchaseMediumPackage("https://pre.qustodio.com/pt/family/premium-20/","SuMMer");




    }


    @Test(dataProvider = "BannerJson",priority = 15)
    public void BannerPuchaseLargePackegeTestPt(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage bannerPurchasePage = PageFactory.initElements(driver, BannerPurchasePage.class);
        Thread.sleep(1000);

        bannerPurchasePage.PurchaseLargePackage("https://pre.qustodio.com/pt/family/premium-20/","SuMMER");



    }

    @Test(dataProvider = "BannerJson",priority = 16)
    public void BannerPuchaseSmallPackegeTestDe(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage bannerPurchasePage = PageFactory.initElements(driver, BannerPurchasePage.class);
        Thread.sleep(1000);

        bannerPurchasePage.PurchaseSmallPackage("https://pre.qustodio.com/de/family/premium-20/","SuMMer");




    }

    @Test(dataProvider = "BannerJson",priority = 17)
    public void BannerPuchaseMediumPackegeTestDe(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage bannerPurchasePage = PageFactory.initElements(driver, BannerPurchasePage.class);
        Thread.sleep(1000);

        bannerPurchasePage.PurchaseMediumPackage("https://pre.qustodio.com/de/family/premium-20/","SuMMer");




    }


    @Test(dataProvider = "BannerJson",priority =18)
    public void BannerPuchaseLargePackegeTestDe(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage bannerPurchasePage = PageFactory.initElements(driver, BannerPurchasePage.class);
        Thread.sleep(1000);

        bannerPurchasePage.PurchaseLargePackage("https://pre.qustodio.com/de/family/premium-20/","SuMMER");




    }

}
