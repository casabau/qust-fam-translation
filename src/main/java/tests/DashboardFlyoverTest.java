package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.Serializers;
import models.FlyoverModel;
import models.dashboardTopBar02;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.DashboardFlyoverPage;
import pages.DashboardTopBar02Page;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DashboardFlyoverTest extends BaseTestPublicSite {
    @DataProvider(name = "TranslationJson")
    public Iterator<Object[]> jsonTranslationDataProvider() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Collection<Object[]> dp = new ArrayList<>();

        File[] files = getListOfFiles("DashboardFlyover");
        for (File f : files) {
            FlyoverModel m = objectMapper.readValue(f, FlyoverModel.class);
            dp.add(new Object[]{m});
        }
        return dp.iterator();
    }

    @Test(dataProvider = "TranslationJson")
    public void topBarTranslationTest(FlyoverModel flyoverModel) throws InterruptedException {
        DashboardFlyoverPage dashboardFlyOverpage = PageFactory.initElements(driver, DashboardFlyoverPage.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlMatches("https://fp-pre.qustodio.com"));

        dashboardFlyOverpage.LoginFlow();
        wait.until(ExpectedConditions.urlMatches("https://fp-pre.qustodio.com/user-activity/summary"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        //dashboardtopBarPage.closeBanner();
        dashboardFlyOverpage.ChangeLanguage("en");
        executor.executeScript("QFP.Controllers.Layout.Notifications.showPopup({\"href\": \"/popup/christmas-2017-flyover05\", \"popup\": true, \"width\": 744, \"height\": 452});");

        //wait.until(ExpectedConditions.visibilityOf(dashboardFlyOverpage.Flyover));
        System.out.println(dashboardFlyOverpage.getEnTranslationText());
        Thread.sleep(5000);
        /*String EnTopBarTranslation = dashboardFlyOverpage.getEnTranslationText();
        try {
            Assert.assertEquals(dashboardFlyOverpage.getEnTranslationText(), EnTopBarTranslation);
        } catch (AssertionError e) {
            System.out.println("Expected: " + dashboardFlyOverpage.getEnTranslationText() + "\nActual: " + EnTopBarTranslation);
        }
*/

    }

}

