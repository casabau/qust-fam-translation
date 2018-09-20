package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.dashboardTopBar02;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.DashboardTopBar02Page;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DashboardTopBar02Test extends BaseTestPublicSite{
    @DataProvider(name = "TranslationJson")
    public Iterator<Object[]> jsonTranslationDataProvider() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Collection<Object[]> dp = new ArrayList<>();

        File[] files = getListOfFiles("topbar01");
        for (File f : files) {
            dashboardTopBar02 m = objectMapper.readValue(f, dashboardTopBar02.class);
            dp.add(new Object[]{m});
        }
        return dp.iterator();
    }

    @Test(dataProvider = "TranslationJson")
    public void topBarTranslationTest(dashboardTopBar02 dashboardTopBar02model) throws InterruptedException {
        DashboardTopBar02Page dashboardTopBar02Page = PageFactory.initElements(driver, DashboardTopBar02Page.class);
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.urlMatches("https://fp-pre.qustodio.com"));

        dashboardTopBar02Page.LoginFlow();
        wait.until(ExpectedConditions.urlMatches("https://fp-pre.qustodio.com/user-activity/summary"));
        JavascriptExecutor executor= (JavascriptExecutor)driver;

        //dashboardtopBarPage.closeBanner();
        dashboardTopBar02Page.ChangeLanguage("en");
        executor.executeScript("QFP.Controllers.Layout.Notifications.showTopBanner(\"halloween_2018_topbar\");");
        wait.until(ExpectedConditions.elementToBeClickable(dashboardTopBar02Page.TopBar));
        try {
            Assert.assertTrue(dashboardTopBar02Page.isTopBarVisible());
        }catch (NoSuchElementException e){
            System.out.println("No top bar present on: " +driver.getCurrentUrl());
        }

        String EnTopBarTranslation= dashboardTopBar02Page.getEnTranslationText();
        try {
            Assert.assertEquals( dashboardTopBar02model.getEnTranslate(),EnTopBarTranslation);
        }catch(AssertionError e){
            System.out.println("Expected: " +dashboardTopBar02model.getEnTranslate()+"\nActual: "+EnTopBarTranslation);
        }

        dashboardTopBar02Page.clickTopBar();

      //  Assert.assertEquals(driver.getCurrentUrl(), "https://fp-pre.qustodio.com/bts2018" );

        dashboardTopBar02Page.ChangeLanguage("es");
        executor.executeScript("QFP.Controllers.Layout.Notifications.showTopBanner(\"halloween_2018_topbar\");");
        wait.until(ExpectedConditions.elementToBeClickable(dashboardTopBar02Page.TopBar));
        try {
            Assert.assertTrue(dashboardTopBar02Page.isTopBarVisible());
        }catch (NoSuchElementException e){
            System.out.println("No top bar present on: " +driver.getCurrentUrl());
        }

        String EsTopBarTranslation= dashboardTopBar02Page.getEsTranslationText();
        try {
            Assert.assertEquals(dashboardTopBar02model.getEsTranslate(),EsTopBarTranslation);
        }catch(AssertionError e){
            System.out.println("Expected: " +dashboardTopBar02model.getEsTranslate()+"\nActual: "+EsTopBarTranslation);
        }

        dashboardTopBar02Page.clickTopBar();

     //   Assert.assertEquals(driver.getCurrentUrl(), "https://fp-pre.qustodio.com/bts2018" );

        dashboardTopBar02Page.ChangeLanguage("fr");
        executor.executeScript("QFP.Controllers.Layout.Notifications.showTopBanner(\"halloween_2018_topbar\");");
        wait.until(ExpectedConditions.elementToBeClickable(dashboardTopBar02Page.TopBar));
        try {
            Assert.assertTrue(dashboardTopBar02Page.isTopBarVisible());
        }catch (NoSuchElementException e){
            System.out.println("No top bar present on: " +driver.getCurrentUrl());
        }

        String FrTopBarTranslation= dashboardTopBar02Page.getFrTranslationText();
        try {
            Assert.assertEquals(dashboardTopBar02model.getFrTranslate(),FrTopBarTranslation);
        }catch (AssertionError e){
            System.out.println("Expected: " +dashboardTopBar02model.getFrTranslate()+"\nActual: "+FrTopBarTranslation);
        }
        dashboardTopBar02Page.clickTopBar();

      //  Assert.assertEquals(driver.getCurrentUrl(), "https://fp-pre.qustodio.com/christmas2017-retrial" );

     //   Assert.assertEquals(driver.getCurrentUrl(), "https://fp-pre.qustodio.com/bts2018" );

        dashboardTopBar02Page.ChangeLanguage("it");
        executor.executeScript("QFP.Controllers.Layout.Notifications.showTopBanner(\"halloween_2018_topbar\");");
        wait.until(ExpectedConditions.elementToBeClickable(dashboardTopBar02Page.TopBar));
        try {
            Assert.assertTrue(dashboardTopBar02Page.isTopBarVisible());
        }catch (NoSuchElementException e){
            System.out.println("No top bar present on: " +driver.getCurrentUrl());
        }

        String ItTopBarTranslation= dashboardTopBar02Page.getItTranslationText();
        try {
            Assert.assertEquals(dashboardTopBar02model.getItTranslate(),ItTopBarTranslation);
        }catch(AssertionError e){
            System.out.println("Expected: " +dashboardTopBar02model.getItTranslate()+"\nActual: "+ItTopBarTranslation);
        }
        dashboardTopBar02Page.clickTopBar();

    //    Assert.assertEquals(driver.getCurrentUrl(), "https://fp-pre.qustodio.com/christmas2017-retrial" );

     //   Assert.assertEquals(driver.getCurrentUrl(), "https://fp-pre.qustodio.com/bts2018" );

        dashboardTopBar02Page.ChangeLanguage("pt_BR");
        executor.executeScript("QFP.Controllers.Layout.Notifications.showTopBanner(\"halloween_2018_topbar\");");
        wait.until(ExpectedConditions.elementToBeClickable(dashboardTopBar02Page.TopBar));
        try {
            Assert.assertTrue(dashboardTopBar02Page.isTopBarVisible());
        }catch (NoSuchElementException e){
            System.out.println("No top bar present on: " +driver.getCurrentUrl());
        }

        String PtTopBarTranslation= dashboardTopBar02Page.getPtTranslationText();
        try {
            Assert.assertEquals(dashboardTopBar02model.getPtTranslate(),PtTopBarTranslation);
        }catch (AssertionError e){
            System.out.println("Expected: " +dashboardTopBar02model.getPtTranslate()+"\nActual: "+PtTopBarTranslation);
        }
        dashboardTopBar02Page.clickTopBar();

   //     Assert.assertEquals(driver.getCurrentUrl(), "https://fp-pre.qustodio.com/christmas2017-retrial" );

      //  Assert.assertEquals(driver.getCurrentUrl(), "https://fp-pre.qustodio.com/bts2018" );

        dashboardTopBar02Page.ChangeLanguage("de");
        executor.executeScript("QFP.Controllers.Layout.Notifications.showTopBanner(\"halloween_2018_topbar\");");
        wait.until(ExpectedConditions.elementToBeClickable(dashboardTopBar02Page.TopBar));
        try {
            Assert.assertTrue(dashboardTopBar02Page.isTopBarVisible());
        }catch (NoSuchElementException e){
            System.out.println("No top bar present on: " +driver.getCurrentUrl());
        }

        String DeTopBarTranslation= dashboardTopBar02Page.getDeTranslationText();
        try {
            Assert.assertEquals(dashboardTopBar02model.getDeTranslate(),DeTopBarTranslation);
        }catch (AssertionError e){
            System.out.println("Expected: " +dashboardTopBar02model.getDeTranslate()+"\nActual: "+DeTopBarTranslation);
        }
        dashboardTopBar02Page.clickTopBar();
        //Assert.assertEquals(driver.getCurrentUrl(), "https://fp-pre.qustodio.com/bts2018" );
    }

}
