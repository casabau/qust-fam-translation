package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.LoginModel;
import models.TopBarTranslationsModel;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.TopBarTranslationPage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by casab on 11/2/2017.
 */
public class TopBarTranslationTest extends BaseTestPublicSite {

    @DataProvider(name = "TranslationJson")
    public Iterator<Object[]> jsonTranslationDataProvider() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Collection<Object[]> dp = new ArrayList<>();

        File[] files = getListOfFiles("topBarTranslate");
        for (File f : files) {
            TopBarTranslationsModel m = objectMapper.readValue(f, TopBarTranslationsModel.class);
            dp.add(new Object[]{m});
        }
        return dp.iterator();
    }

    @Test(dataProvider = "TranslationJson")
    public void topBarTranslationTest(TopBarTranslationsModel topBarTranslationModel) throws InterruptedException {
        TopBarTranslationPage topBarTranslationPage = PageFactory.initElements(driver, TopBarTranslationPage.class);
        Thread.sleep(1000);


        driver.get("http://pre.qustodio.com/en/");
        String EnTopBarTranslation=topBarTranslationPage.getEnTranslationText();
        Assert.assertEquals(EnTopBarTranslation, topBarTranslationModel.getEnTranslate() );

        driver.get("http://pre.qustodio.com/es/");
        String EsTopBarTranslation=topBarTranslationPage.getEsTranslationText();
        Assert.assertEquals(EsTopBarTranslation, topBarTranslationModel.getEsTranslate() );

        driver.get("http://pre.qustodio.com/fr/");
        String FrTopBarTranslation=topBarTranslationPage.getFrTranslationText();
        Assert.assertEquals(FrTopBarTranslation, topBarTranslationModel.getFrTranslate() );

        driver.get("http://pre.qustodio.com/it/");
        String ItTopBarTranslation=topBarTranslationPage.getItTranslationText();
        Assert.assertEquals(ItTopBarTranslation, topBarTranslationModel.getItTranslate() );

        driver.get("http://pre.qustodio.com/pt/");
        String PtTopBarTranslation=topBarTranslationPage.getPtTranslationText();
        Assert.assertEquals(PtTopBarTranslation, topBarTranslationModel.getPtTranslate() );

        driver.get("http://pre.qustodio.com/de/");
        String DeTopBarTranslation=topBarTranslationPage.getDeTranslationText();
        Assert.assertEquals(DeTopBarTranslation, topBarTranslationModel.getDeTranslate() );

    }

}
