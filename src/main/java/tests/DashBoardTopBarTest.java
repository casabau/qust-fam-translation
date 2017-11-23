package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.TopBarModel;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.DashBoardTopBarPage;
import pages.TopBarPage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DashBoardTopBarTest extends BaseTestPublicSite {

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
        DashBoardTopBarPage dashboardtopBarPage = PageFactory.initElements(driver, DashBoardTopBarPage.class);
        Thread.sleep(1000);


        dashboardtopBarPage.LoginFlow();
        Thread.sleep(5000);
        dashboardtopBarPage.ChangeLanguage(2);
        /*dashboardtopBarPage.closeBanner();

        try {
            //Assert.assertTrue(dashboardtopBarPage.isTopBarVisible());
        }catch (NoSuchElementException e){
            System.out.println("No top bar");
        }
        String EnTopBarTranslation= dashboardtopBarPage.getEnTranslationText();
        try {
            Assert.assertEquals( topBarTranslationModel.getEnTranslate(),EnTopBarTranslation);
        }catch(AssertionError e){
            System.out.println("Expected: " +topBarTranslationModel.getEnTranslate()+"\nActual: "+EnTopBarTranslation);
        }
        //dashboardtopBarPage.clickTopBar();
        //Assert.assertEquals(driver.getCurrentUrl(), "https://pre.qustodio.com/en/family/premium/" );

        dashboardtopBarPage.ChangeLanguage(2);
        Assert.assertTrue(dashboardtopBarPage.isTopBarVisible());
        String EsTopBarTranslation= dashboardtopBarPage.getEsTranslationText();
        try {
            Assert.assertEquals(topBarTranslationModel.getEsTranslate(),EsTopBarTranslation);
        }catch(AssertionError e){
            System.out.println("Expected: " +topBarTranslationModel.getEsTranslate()+"\nActual: "+EsTopBarTranslation);
        }



        Assert.assertTrue(dashboardtopBarPage.isTopBarVisible());
        String FrTopBarTranslation= dashboardtopBarPage.getFrTranslationText();
        try {
            Assert.assertEquals(topBarTranslationModel.getFrTranslate(),FrTopBarTranslation);
        }catch (AssertionError e){
            System.out.println("Expected: " +topBarTranslationModel.getFrTranslate()+"\nActual: "+FrTopBarTranslation);
        }


        Assert.assertTrue(dashboardtopBarPage.isTopBarVisible());
        String ItTopBarTranslation= dashboardtopBarPage.getItTranslationText();
        try {
            Assert.assertEquals(topBarTranslationModel.getItTranslate(),ItTopBarTranslation);
        }catch(AssertionError e){
            System.out.println("Expected: " +topBarTranslationModel.getItTranslate()+"\nActual: "+ItTopBarTranslation);
        }



        Assert.assertTrue(dashboardtopBarPage.isTopBarVisible());
        String PtTopBarTranslation= dashboardtopBarPage.getPtTranslationText();
        try {
            Assert.assertEquals(topBarTranslationModel.getPtTranslate(),PtTopBarTranslation);
        }catch (AssertionError e){
            System.out.println("Expected: " +topBarTranslationModel.getPtTranslate()+"\nActual: "+PtTopBarTranslation);
        }



        Assert.assertTrue(dashboardtopBarPage.isTopBarVisible());
        String DeTopBarTranslation= dashboardtopBarPage.getDeTranslationText();
        try {
            Assert.assertEquals(topBarTranslationModel.getDeTranslate(),DeTopBarTranslation);
        }catch (AssertionError e){
            System.out.println("Expected: " +topBarTranslationModel.getDeTranslate()+"\nActual: "+DeTopBarTranslation);
        }

        */
    }

}
