package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import enums.Browsers;
import models.DownloadsBannerModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.DownloadsOSsPage;
import pages.HeaderPage;
import pages.DownloadsBannerPage;
import pages.ThankYouPage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/**
 * Created by casab on 11/4/2017.
 */
public class DownloadsBannerURLsTest extends BaseTestPublicSite {
    @DataProvider(name = "HomeGreenBanner")
    public Iterator<Object[]> jsonHomeGreenButtonURLs() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Collection<Object[]> dp = new ArrayList<>();

        File[] files = getListOfFiles("DownloadsPageButtonsURL");
        for (File f : files) {
            DownloadsBannerModel m = objectMapper.readValue(f, DownloadsBannerModel.class);
            dp.add(new Object[]{m});
        }
        return dp.iterator();
    }

    @Test(dataProvider = "HomeGreenBanner")
    public void downloadsPageURLsTest(DownloadsBannerModel downloadsBannerModel) throws InterruptedException {
        DownloadsBannerPage downloadsBannerPage = PageFactory.initElements(driver, DownloadsBannerPage.class);
        HeaderPage headerPage = PageFactory.initElements(driver, HeaderPage.class);
        ThankYouPage thankYouPage = PageFactory.initElements(driver, ThankYouPage.class);
        DownloadsOSsPage downloadsOSsPage = PageFactory.initElements(driver, DownloadsOSsPage.class);

       // if (headerPage.whatVersion.equals("C")) {
            driver.get("http://pre.qustodio.com/en/family/downloads/");
            downloadsBannerPage.clickProtectthisWinButton();
            Thread.sleep(5000);

            /*WebElement thankYouMessage = driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div/div[2]/div/div[1]/h2"));
            Assert.assertTrue(thankYouMessage.isDisplayed()); */

            driver.get("http://pre.qustodio.com/en/family/downloads/");
            downloadsBannerPage.clickGreenClickHereButton();
            Assert.assertEquals(driver.getCurrentUrl(), downloadsBannerModel.getClickHereButtonURL());


        //} else{
            System.out.println("HAHA ... e o alta versiune fuckere!!!");
        //}
    }
}
