package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.TopBarModel;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.TopBarPage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by casab on 11/2/2017.
 */
public class TopBarTest extends BaseTestPublicSite {

    @DataProvider(name = "TranslationJson")
    public Iterator<Object[]> jsonTranslationDataProvider() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Collection<Object[]> dp = new ArrayList<>();

        File[] files = getListOfFiles("topBarTranslate");
        for (File f : files) {
            TopBarModel m = objectMapper.readValue(f, TopBarModel.class);
            dp.add(new Object[]{m});
        }
        return dp.iterator();
    }

    @Test(dataProvider = "TranslationJson")
    public void topBarTranslationTest(TopBarModel topBarTranslationModel) throws InterruptedException {
        TopBarPage topBarPage = PageFactory.initElements(driver, TopBarPage.class);
        Thread.sleep(1000);


        driver.get("http://pre.qustodio.com/en/");
        Assert.assertTrue(topBarPage.isTopBarVisible());
        String EnTopBarTranslation= topBarPage.getEnTranslationText();
        Assert.assertEquals(EnTopBarTranslation, topBarTranslationModel.getEnTranslate() );
        topBarPage.clickTopBar();
        Assert.assertEquals(driver.getCurrentUrl(), "https://pre.qustodio.com/en/family/premium/" );

        driver.get("http://pre.qustodio.com/es/");
        Assert.assertTrue(topBarPage.isTopBarVisible());
        String EsTopBarTranslation= topBarPage.getEsTranslationText();
        Assert.assertEquals(EsTopBarTranslation, topBarTranslationModel.getEsTranslate() );
        topBarPage.clickTopBar();
        Assert.assertEquals(driver.getCurrentUrl(), "https://pre.qustodio.com/es/family/premium/" );

        driver.get("http://pre.qustodio.com/fr/");
        Assert.assertTrue(topBarPage.isTopBarVisible());
        String FrTopBarTranslation= topBarPage.getFrTranslationText();
        Assert.assertEquals(FrTopBarTranslation, topBarTranslationModel.getFrTranslate() );
        topBarPage.clickTopBar();
        Assert.assertEquals(driver.getCurrentUrl(), "https://pre.qustodio.com/fr/family/premium/" );

        driver.get("http://pre.qustodio.com/it/");
        Assert.assertTrue(topBarPage.isTopBarVisible());
        String ItTopBarTranslation= topBarPage.getItTranslationText();
        Assert.assertEquals(ItTopBarTranslation, topBarTranslationModel.getItTranslate() );
        topBarPage.clickTopBar();
        Assert.assertEquals(driver.getCurrentUrl(), "https://pre.qustodio.com/it/family/premium/" );

        driver.get("http://pre.qustodio.com/pt/");
        Assert.assertTrue(topBarPage.isTopBarVisible());
        String PtTopBarTranslation= topBarPage.getPtTranslationText();
        Assert.assertEquals(PtTopBarTranslation, topBarTranslationModel.getPtTranslate() );
        topBarPage.clickTopBar();
        Assert.assertEquals(driver.getCurrentUrl(), "https://pre.qustodio.com/pt/family/premium/" );

        driver.get("http://pre.qustodio.com/de/");
        Assert.assertTrue(topBarPage.isTopBarVisible());
        String DeTopBarTranslation= topBarPage.getDeTranslationText();
        Assert.assertEquals(DeTopBarTranslation, topBarTranslationModel.getDeTranslate() );
        topBarPage.clickTopBar();
        Assert.assertEquals(driver.getCurrentUrl(), "https://pre.qustodio.com/de/family/premium/");

        driver.get("https://pre.qustodio.com/en/schools/");
        try {

            Assert.assertFalse(topBarPage.isTopBarVisible());
        }catch(org.openqa.selenium.NoSuchElementException e){
            System.out.println("Top bar is not present on the: " +driver.getCurrentUrl() +" page");
        }

        driver.get("https://pre.qustodio.com/en/schools/plans-and-pricing-for-schools/");
        try {

            Assert.assertFalse(topBarPage.isTopBarVisible());
        }catch(org.openqa.selenium.NoSuchElementException e){
            System.out.println("Top bar is not present on the: " +driver.getCurrentUrl() +" page");
        }

        driver.get("https://pre.qustodio.com/en/schools/resources-for-schools/");
        try {

            Assert.assertFalse(topBarPage.isTopBarVisible());
        }catch(org.openqa.selenium.NoSuchElementException e){
            System.out.println("Top bar is not present on the: " +driver.getCurrentUrl() +" page");
        }

        driver.get("https://pre.qustodio.com/en/schools/downloads-for-schools/");
        try {

            Assert.assertFalse(topBarPage.isTopBarVisible());
        }catch(org.openqa.selenium.NoSuchElementException e){
            System.out.println("Top bar is not present on the: " +driver.getCurrentUrl() +" page");
        }

        driver.get("https://pre.qustodio.com/en/business/");
        try {

            Assert.assertFalse(topBarPage.isTopBarVisible());
        }catch(org.openqa.selenium.NoSuchElementException e){
            System.out.println("Top bar is not present on the: " +driver.getCurrentUrl() +" page");
        }

        driver.get("https://pre.qustodio.com/en/business/plans-and-pricing-for-business/");
        try {

            Assert.assertFalse(topBarPage.isTopBarVisible());
        }catch(org.openqa.selenium.NoSuchElementException e){
            System.out.println("Top bar is not present on the: " +driver.getCurrentUrl() +" page");
        }

        driver.get("https://pre.qustodio.com/en/business/resources-for-business/");
        try {

            Assert.assertFalse(topBarPage.isTopBarVisible());
        }catch(org.openqa.selenium.NoSuchElementException e){
            System.out.println("Top bar is not present on the: " +driver.getCurrentUrl() +" page");
        }

        driver.get("https://pre.qustodio.com/en/business/downloads-for-business/");
        try {

            Assert.assertFalse(topBarPage.isTopBarVisible());
        }catch(org.openqa.selenium.NoSuchElementException e){
            System.out.println("Top bar is not present on the: " +driver.getCurrentUrl() +" page");
        }

        driver.get("https://pre.qustodio.com/en/help/");
        try {

            Assert.assertFalse(topBarPage.isTopBarVisible());
        }catch(org.openqa.selenium.NoSuchElementException e){
            System.out.println("Top bar is not present on the: " +driver.getCurrentUrl() +" page");
        }

    }

}
