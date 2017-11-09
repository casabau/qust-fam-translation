package tests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.FooterModel;
import models.HeaderModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.FooterPage;
import pages.HeaderPage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FooterTest extends BaseTestPublicSite {
    @DataProvider(name = "footerSiteJson")
    public Iterator<Object[]> jsonfooterDataProvider() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
       // objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Collection<Object[]> dp = new ArrayList<>();

        File[] files = getListOfFiles("footerSiteJson");
        for (File f : files) {
            FooterModel m = objectMapper.readValue(f, FooterModel.class);
           dp.add(new Object[]{m});

        }

        return dp.iterator();
    }

    @Test(dataProvider = "footerSiteJson")
    public void FooterSiteUrlsTest (FooterModel footerModel) throws InterruptedException {
        FooterPage footerPage = PageFactory.initElements(driver, FooterPage.class);
        Thread.sleep(1000);



        driver.get("http://qustodio.com/en/");
        footerPage.clickCompanyLink();
        Assert.assertEquals(driver.getCurrentUrl(),footerModel.getCompany());

        driver.get("http://pre.qustodio.com/en/");
        footerPage.clickTeamLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getTeam());

        driver.get("http://pre.qustodio.com/en/");
        footerPage.clickCareersLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getCareers());

        driver.get("http://pre.qustodio.com/en/");
        footerPage.clickBlogLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getBlog());

        driver.get("http://pre.qustodio.com/en/");
        footerPage.clickPressReleasesLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getPressReleases());

        driver.get("http://pre.qustodio.com/en/");
        footerPage.clickContactUsLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getContactUs());

        driver.get("http://pre.qustodio.com/en/");
        footerPage.clickForFamiliesLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getForFamilies());

        driver.get("http://pre.qustodio.com/en/");
        footerPage.clickForSchoolsLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getForSchools());

        driver.get("http://pre.qustodio.com/en/");
        footerPage.clickForBusinessLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getForBusiness());

        driver.get("http://pre.qustodio.com/en/");
        footerPage.clickResellersLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getResellers());

        driver.get("http://pre.qustodio.com/en/");
        footerPage.clickPartnersLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getPartners());

        driver.get("http://pre.qustodio.com/en/");
        footerPage.clickAffiliatesLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getAffiliates());

        driver.get("http://pre.qustodio.com/en/");
        footerPage.clickAffiliatesLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getAffiliates());

        driver.get("http://pre.qustodio.com/en/");
        footerPage.clickHelpLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getHelp());

        driver.get("http://pre.qustodio.com/en/");
        footerPage.ClickSystemRequirementsLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getSystemRequirements());

        driver.get("http://pre.qustodio.com/en/");
        footerPage.ClickSiteMapLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getSitemap());

        driver.get("http://pre.qustodio.com/en/");
        footerPage.clickFacebookButton();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getFacebook());

        driver.get("http://pre.qustodio.com/en/");
        footerPage.clickLinkedinButton();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getLinkedin());

        driver.get("http://pre.qustodio.com/en/");
        footerPage.clickTwitterButton();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getTwitter());

        driver.get("http://pre.qustodio.com/en/");
        footerPage.clickTermsOfServiceLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getTermsOfService());

        driver.get("http://pre.qustodio.com/en/");
        footerPage.clickPrivacyPolicy();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getPrivacyPolicy());


    }
}
