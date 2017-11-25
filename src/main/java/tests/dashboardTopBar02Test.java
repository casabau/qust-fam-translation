package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.TopBarModel;
import models.dashboardTopBar02;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.DashBoardTopBarPage;
import pages.dashboardTopBar02Page;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class dashboardTopBar02Test extends BaseTestPublicSite{
    @DataProvider(name = "TranslationJson")
    public Iterator<Object[]> jsonTranslationDataProvider() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Collection<Object[]> dp = new ArrayList<>();

        File[] files = getListOfFiles("xmas2017");
        for (File f : files) {
            dashboardTopBar02 m = objectMapper.readValue(f, dashboardTopBar02.class);
            dp.add(new Object[]{m});
        }
        return dp.iterator();
    }

    @Test(dataProvider = "TranslationJson")
    public void topBarTranslationTest(dashboardTopBar02 dashboardTopBar02model) throws InterruptedException {
        dashboardTopBar02Page dashboardTopBar02page = PageFactory.initElements(driver, dashboardTopBar02Page.class);
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.urlMatches("https://fp-pre.qustodio.com"));

        dashboardTopBar02page.LoginFlow();
        wait.until(ExpectedConditions.urlMatches("https://fp-pre.qustodio.com/user-activity/summary"));

        //dashboardtopBarPage.closeBanner();
        dashboardTopBar02page.ChangeLanguage("en");
        wait.until(ExpectedConditions.elementToBeClickable(dashboardTopBar02page.TopBar));
        try {
            Assert.assertTrue(dashboardTopBar02page.isTopBarVisible());
        }catch (NoSuchElementException e){
            System.out.println("No top bar present on: " +driver.getCurrentUrl());
        }

        String EnTopBarTranslation= dashboardTopBar02page.getEnTranslationText();
        try {
            Assert.assertEquals( dashboardTopBar02model.getEnTranslate(),EnTopBarTranslation);
        }catch(AssertionError e){
            System.out.println("Expected: " +dashboardTopBar02model.getEnTranslate()+"\nActual: "+EnTopBarTranslation);
        }

        dashboardTopBar02page.clickTopBar();
        Assert.assertEquals(driver.getCurrentUrl(), "https://fp-pre.qustodio.com/christmas2017-retrial" );

        dashboardTopBar02page.ChangeLanguage("es");
        wait.until(ExpectedConditions.elementToBeClickable(dashboardTopBar02page.TopBar));
        try {
            Assert.assertTrue(dashboardTopBar02page.isTopBarVisible());
        }catch (NoSuchElementException e){
            System.out.println("No top bar present on: " +driver.getCurrentUrl());
        }

        String EsTopBarTranslation= dashboardTopBar02page.getEsTranslationText();
        try {
            Assert.assertEquals(dashboardTopBar02model.getEsTranslate(),EsTopBarTranslation);
        }catch(AssertionError e){
            System.out.println("Expected: " +dashboardTopBar02model.getEsTranslate()+"\nActual: "+EsTopBarTranslation);
        }

        dashboardTopBar02page.clickTopBar();
        Assert.assertEquals(driver.getCurrentUrl(), "https://fp-pre.qustodio.com/christmas2017-retrial" );

        dashboardTopBar02page.ChangeLanguage("fr");
        wait.until(ExpectedConditions.elementToBeClickable(dashboardTopBar02page.TopBar));
        try {
            Assert.assertTrue(dashboardTopBar02page.isTopBarVisible());
        }catch (NoSuchElementException e){
            System.out.println("No top bar present on: " +driver.getCurrentUrl());
        }

        String FrTopBarTranslation= dashboardTopBar02page.getFrTranslationText();
        try {
            Assert.assertEquals(dashboardTopBar02model.getFrTranslate(),FrTopBarTranslation);
        }catch (AssertionError e){
            System.out.println("Expected: " +dashboardTopBar02model.getFrTranslate()+"\nActual: "+FrTopBarTranslation);
        }
        dashboardTopBar02page.clickTopBar();
        Assert.assertEquals(driver.getCurrentUrl(), "https://fp-pre.qustodio.com/christmas2017-retrial" );

        dashboardTopBar02page.ChangeLanguage("it");
        wait.until(ExpectedConditions.elementToBeClickable(dashboardTopBar02page.TopBar));
        try {
            Assert.assertTrue(dashboardTopBar02page.isTopBarVisible());
        }catch (NoSuchElementException e){
            System.out.println("No top bar present on: " +driver.getCurrentUrl());
        }

        String ItTopBarTranslation= dashboardTopBar02page.getItTranslationText();
        try {
            Assert.assertEquals(dashboardTopBar02model.getItTranslate(),ItTopBarTranslation);
        }catch(AssertionError e){
            System.out.println("Expected: " +dashboardTopBar02model.getItTranslate()+"\nActual: "+ItTopBarTranslation);
        }
        dashboardTopBar02page.clickTopBar();
        Assert.assertEquals(driver.getCurrentUrl(), "https://fp-pre.qustodio.com/christmas2017-retrial" );

        dashboardTopBar02page.ChangeLanguage("pt_BR");
        wait.until(ExpectedConditions.elementToBeClickable(dashboardTopBar02page.TopBar));
        try {
            Assert.assertTrue(dashboardTopBar02page.isTopBarVisible());
        }catch (NoSuchElementException e){
            System.out.println("No top bar present on: " +driver.getCurrentUrl());
        }

        String PtTopBarTranslation= dashboardTopBar02page.getPtTranslationText();
        try {
            Assert.assertEquals(dashboardTopBar02model.getPtTranslate(),PtTopBarTranslation);
        }catch (AssertionError e){
            System.out.println("Expected: " +dashboardTopBar02model.getPtTranslate()+"\nActual: "+PtTopBarTranslation);
        }
        dashboardTopBar02page.clickTopBar();
        Assert.assertEquals(driver.getCurrentUrl(), "https://fp-pre.qustodio.com/christmas2017-retrial" );

        dashboardTopBar02page.ChangeLanguage("de");
        wait.until(ExpectedConditions.elementToBeClickable(dashboardTopBar02page.TopBar));
        try {
            Assert.assertTrue(dashboardTopBar02page.isTopBarVisible());
        }catch (NoSuchElementException e){
            System.out.println("No top bar present on: " +driver.getCurrentUrl());
        }

        String DeTopBarTranslation= dashboardTopBar02page.getDeTranslationText();
        try {
            Assert.assertEquals(dashboardTopBar02model.getDeTranslate(),DeTopBarTranslation);
        }catch (AssertionError e){
            System.out.println("Expected: " +dashboardTopBar02model.getDeTranslate()+"\nActual: "+DeTopBarTranslation);
        }
        dashboardTopBar02page.clickTopBar();
        Assert.assertEquals(driver.getCurrentUrl(), "https://fp-pre.qustodio.com/christmas2017-retrial" );
    }

}
