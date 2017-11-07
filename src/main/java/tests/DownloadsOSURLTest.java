package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.DownloadsBannerModel;
import models.DownloadsOSsModel;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.DownloadsBannerPage;
import pages.DownloadsOSsPage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by casab on 11/6/2017.
 */
    public class DownloadsOSURLTest extends BaseTestPublicSite {
        @DataProvider(name = "jsonDownloadsOS")
        public Iterator<Object[]> jsonDownloadsOSDataProvider() throws IOException {
            ObjectMapper objectMapper = new ObjectMapper();
            Collection<Object[]> dp = new ArrayList<>();

            File[] files = getListOfFiles("DownloadsOSsJson");
            for (File f : files) {
                DownloadsOSsModel m = objectMapper.readValue(f, DownloadsOSsModel.class);
                dp.add(new Object[]{m});
            }
            return dp.iterator();
        }

        @Test(dataProvider = "jsonDownloadsOS")
        public void downloadsOSsURLTest(DownloadsOSsModel downloadsOSsModel) throws InterruptedException {
            DownloadsOSsPage downloadsOSsPage = PageFactory.initElements(driver, DownloadsOSsPage.class);

            driver.get("http://pre.qustodio.com/en/family/downloads/");
            downloadsOSsPage.clickDownlMacButton();
            Thread.sleep(1000);
            Assert.assertEquals(driver.getCurrentUrl(), downloadsOSsModel.getDownloadMacURL());
        }
    }

