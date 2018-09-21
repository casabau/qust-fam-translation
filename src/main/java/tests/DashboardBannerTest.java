package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.dashboardBanner;
import models.dashboardTopBar02;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.DashboardBannerPage;
import pages.DashboardTopBar02Page;
import sun.plugin2.message.JavaScriptBaseMessage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DashboardBannerTest extends BaseTestPublicSite {
    @DataProvider(name = "TranslationJson")
    public Iterator<Object[]> jsonTranslationDataProvider() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Collection<Object[]> dp = new ArrayList<>();

        File[] files = getListOfFiles("DashboardBanner");
        for (File f : files) {
            dashboardBanner m = objectMapper.readValue(f, dashboardBanner.class);
            dp.add(new Object[]{m});
        }
        return dp.iterator();
    }

    @Test(dataProvider = "TranslationJson")
    public void topBarTranslationTest(dashboardBanner bannerModel) throws InterruptedException {
        DashboardBannerPage dashboardBannerPage = PageFactory.initElements(driver, DashboardBannerPage.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlMatches("https://fp-pre.qustodio.com"));

        dashboardBannerPage.LoginFlow();
        wait.until(ExpectedConditions.urlMatches("https://fp-pre.qustodio.com/user-activity/summary"));
        //JavascriptExecutor executor= (JavascriptExecutor)driver;

        //dashboardtopBarPage.closeBanner();
        dashboardBannerPage.ChangeLanguage("en");

        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("QFP.Controllers.Layout.Notifications.showPopup({\"href\": \"/popup/premium-trial-b\", \"popup\": true, \"width\": 744, \"height\": 452}, {\"flyover\":0})");

        Thread.sleep(5000000);

    }
}