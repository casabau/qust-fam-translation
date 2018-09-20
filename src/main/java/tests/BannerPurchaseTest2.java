package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.BannerModel;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BannerPurchasePage;
import pages.BannerPurchasePage2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BannerPurchaseTest2 extends BaseTestPublicSite {
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
        BannerPurchasePage2 bannerPurchasePage2 = PageFactory.initElements(driver, BannerPurchasePage2.class);
        Thread.sleep(1000);

        bannerPurchasePage2.PurchaseSmallPackage("https://pre.qustodio.com/en/family/premium/","SuCCEsS10");




    }

    @Test(dataProvider = "BannerJson",priority = 2)
    public void BannerPuchaseMediumPackegeTestEn(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage2 bannerPurchasePage2 = PageFactory.initElements(driver, BannerPurchasePage2.class);
        Thread.sleep(1000);

        bannerPurchasePage2.PurchaseMediumPackage("https://pre.qustodio.com/en/family/premium/","SuCCEsS10");




    }


    @Test(dataProvider = "BannerJson",priority = 3)
    public void BannerPuchaseLargePackegeTestEn(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage2 bannerPurchasePage2 = PageFactory.initElements(driver, BannerPurchasePage2.class);
        Thread.sleep(1000);

        bannerPurchasePage2.PurchaseLargePackage("https://pre.qustodio.com/en/family/premium/","SuCCEsS10");




    }

    @Test(dataProvider = "BannerJson",priority = 4)
    public void BannerPuchaseSmallPackegeTestEs(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage2 bannerPurchasePage2 = PageFactory.initElements(driver, BannerPurchasePage2.class);
        Thread.sleep(1000);

        bannerPurchasePage2.PurchaseSmallPackage("https://pre.qustodio.com/es/family/premium/","SuCCEsS10");




    }

    @Test(dataProvider = "BannerJson",priority = 5)
    public void BannerPuchaseMediumPackegeTestEs(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage2 bannerPurchasePage2 = PageFactory.initElements(driver, BannerPurchasePage2.class);
        Thread.sleep(1000);

        bannerPurchasePage2.PurchaseMediumPackage("https://pre.qustodio.com/es/family/premium/","SuCCEsS10");




    }


    @Test(dataProvider = "BannerJson",priority = 6)
    public void BannerPuchaseLargePackegeTestEs(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage2 bannerPurchasePage2 = PageFactory.initElements(driver, BannerPurchasePage2.class);
        Thread.sleep(1000);

        bannerPurchasePage2.PurchaseLargePackage("https://pre.qustodio.com/es/family/premium/","SuCCEsS10");




    }

    @Test(dataProvider = "BannerJson",priority = 7)
    public void BannerPuchaseSmallPackegeTestFr(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage2 bannerPurchasePage2 = PageFactory.initElements(driver, BannerPurchasePage2.class);
        Thread.sleep(1000);

        bannerPurchasePage2.PurchaseSmallPackage("https://pre.qustodio.com/fr/family/premium/","SuCCEsS10");




    }

    @Test(dataProvider = "BannerJson",priority = 8)
    public void BannerPuchaseMediumPackegeTestFr(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage2 bannerPurchasePage2 = PageFactory.initElements(driver, BannerPurchasePage2.class);
        Thread.sleep(1000);

        bannerPurchasePage2.PurchaseMediumPackage("https://pre.qustodio.com/fr/family/premium/","SuCCEsS10");




    }


    @Test(dataProvider = "BannerJson",priority = 9)
    public void BannerPuchaseLargePackegeTestFr(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage2 bannerPurchasePage2 = PageFactory.initElements(driver, BannerPurchasePage2.class);
        Thread.sleep(1000);

        bannerPurchasePage2.PurchaseLargePackage("https://pre.qustodio.com/fr/family/premium/","SuCCEsS10");




    }

    @Test(dataProvider = "BannerJson",priority = 10)
    public void BannerPuchaseSmallPackegeTestIt(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage2 bannerPurchasePage2 = PageFactory.initElements(driver, BannerPurchasePage2.class);
        Thread.sleep(1000);

        bannerPurchasePage2.PurchaseSmallPackage("https://pre.qustodio.com/it/family/premium/","SuCCEsS10");




    }


    @Test(dataProvider = "BannerJson",priority = 11)
    public void BannerPuchaseMediumPackegeTestIt(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage2 bannerPurchasePage2 = PageFactory.initElements(driver, BannerPurchasePage2.class);
        Thread.sleep(1000);

        bannerPurchasePage2.PurchaseMediumPackage("https://pre.qustodio.com/it/family/premium/","SuCCEsS10");




    }


    @Test(dataProvider = "BannerJson",priority = 12)
    public void BannerPuchaseLargePackegeTestIt(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage2 bannerPurchasePage2 = PageFactory.initElements(driver, BannerPurchasePage2.class);
        Thread.sleep(1000);

        bannerPurchasePage2.PurchaseLargePackage("https://pre.qustodio.com/it/family/premium/","SuCCEsS10");




    }

    @Test(dataProvider = "BannerJson",priority = 13)
    public void BannerPuchaseSmallPackegeTestPt(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage2 bannerPurchasePage2 = PageFactory.initElements(driver, BannerPurchasePage2.class);
        Thread.sleep(1000);

        bannerPurchasePage2.PurchaseSmallPackage("https://pre.qustodio.com/pt/family/premium/","SuCCEsS10");




    }

    @Test(dataProvider = "BannerJson",priority = 14)
    public void BannerPuchaseMediumPackegeTestPt(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage2 bannerPurchasePage2 = PageFactory.initElements(driver, BannerPurchasePage2.class);
        Thread.sleep(1000);

        bannerPurchasePage2.PurchaseMediumPackage("https://pre.qustodio.com/pt/family/premium/","SuCCEsS10");




    }


    @Test(dataProvider = "BannerJson",priority = 15)
    public void BannerPuchaseLargePackegeTestPt(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage2 bannerPurchasePage2 = PageFactory.initElements(driver, BannerPurchasePage2.class);
        Thread.sleep(1000);

        bannerPurchasePage2.PurchaseLargePackage("https://pre.qustodio.com/pt/family/premium/","SuCCEsS10");



    }

    @Test(dataProvider = "BannerJson",priority = 16)
    public void BannerPuchaseSmallPackegeTestDe(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage2 bannerPurchasePage2 = PageFactory.initElements(driver, BannerPurchasePage2.class);
        Thread.sleep(1000);

        bannerPurchasePage2.PurchaseSmallPackage("https://pre.qustodio.com/de/family/premium/","SuCCEsS10");




    }


    @Test(dataProvider = "BannerJson",priority = 17)
    public void BannerPuchaseMediumPackegeTestDe(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage2 bannerPurchasePage2 = PageFactory.initElements(driver, BannerPurchasePage2.class);
        Thread.sleep(1000);

        bannerPurchasePage2.PurchaseMediumPackage("https://pre.qustodio.com/de/family/premium/","SuCCEsS10");




    }


    @Test(dataProvider = "BannerJson",priority = 18)
    public void BannerPuchaseLargePackegeTestDe(BannerModel bannerModel) throws InterruptedException {
        BannerPurchasePage2 bannerPurchasePage2 = PageFactory.initElements(driver, BannerPurchasePage2.class);
        Thread.sleep(1000);

        bannerPurchasePage2.PurchaseLargePackage("https://pre.qustodio.com/de/family/premium/","SuCCEsS10");




    }

}
