package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.FooterModel;
import models.HeaderModel;
import models.HomeSignUpModel;
import models.LoginModel;
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

/**
 * Created by casab on 11/3/2017.
 */
public class FooterTest extends BaseTestPublicSite {
    @DataProvider(name = "FooterUrls")
    public Iterator<Object[]> jsonLoginDataProvider() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Collection<Object[]> dp = new ArrayList<>();

        File[] files = getListOfFiles("footerSiteJson");
        for (File f : files) {
            FooterModel m = objectMapper.readValue(f, FooterModel.class);
            dp.add(new Object[]{m});
        }
        return dp.iterator();
    }

    @Test(dataProvider = "FooterUrls")
    public void footerrUrlsTest (FooterModel footerModel) throws InterruptedException {
        FooterPage footerpage = PageFactory.initElements(driver, FooterPage.class);
        Thread.sleep(1000);



        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickCompanyLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getCompany());

        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickTeamLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getTeam());

        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickCareersLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getCareers());

        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickBlogLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getBlog());

        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickPressReleases();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getPressReleases());

        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickContacUsLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getContactUs());

        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickForFamiliesLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getForFamilies());

        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickForSchoolsLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getForSchools());

        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickForBusinessLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getForBusiness());

        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickResellersLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getResellers());

        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickPartners();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getPartners());

        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickAffiliatesLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getAffiliates());

        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickHelpLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getHelp());

        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickSystemRequirementsLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getSystemRequirements());

        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickResourcesForParentsLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getResourcesForParents());

        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickSitemapLink();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getSitemap());

        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickFacebookButton();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getFacebook());

        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickLinkedinButton();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getLinkedin());

        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickTwitterButton();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getTwitter());

        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickTermsOfService();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getTermsOfService());

        driver.get("http://pre.qustodio.com/en/");
        footerpage.clickPrivacyPolicy();
        Assert.assertEquals(driver.getCurrentUrl(), footerModel.getPrivacyPolicy());

        driver.get("http://pre.qustodio.com/en/");
        String CopyRighttext=footerpage.getCopyRightText();
        Assert.assertEquals(CopyRighttext, footerModel.getCopyRightText());


    }
}
