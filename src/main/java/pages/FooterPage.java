package pages;

import models.HomeSignUpModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.beans.IntrospectionException;

/**
 * Created by casab on 11/3/2017.
 */
public class FooterPage {
    WebDriver driver;

    public FooterPage(WebDriver driverLn) {
        {
            this.driver = driverLn;
        }
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-footer-about-navigation\"]/li[1]/a")
    private WebElement Company;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-footer-about-navigation\"]/li[2]/a")
    private WebElement team;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-footer-about-navigation\"]/li[3]/a")
    private WebElement careers;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-footer-about-navigation\"]/li[4]/a")
    private WebElement blog;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-footer-about-navigation\"]/li[5]/a")
    private WebElement pressReleases;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-footer-about-navigation\"]/li[6]/a")
    private WebElement contactUs;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-footer-products-navigation\"]/li[1]/a")
    private WebElement forFamilies;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-footer-products-navigation\"]/li[2]/a")
    private WebElement forSchools;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-footer-products-navigation\"]/li[3]/a")
    private WebElement forBusiness;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-footer-partners-navigation\"]/li[1]/a")
    private WebElement resellers;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-footer-partners-navigation\"]/li[2]/a")
    private WebElement partners;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-footer-partners-navigation\"]/li[3]/a")
    private WebElement affiliates;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-footer-resources-navigation\"]/li[1]/a")
    private WebElement help;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-footer-resources-navigation\"]/li[2]/a")
    private WebElement systemRequirements;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-footer-resources-navigation\"]/li[3]/a")
    private WebElement resourcesForParents;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-footer-resources-navigation\"]/li[4]/a")
    private WebElement sitemap;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/footer/div[2]/div[1]/div[5]/div[2]/ul/li[1]/a")
    private WebElement facebook;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/footer/div[2]/div[1]/div[5]/div[2]/ul/li[2]/a")
    private WebElement linkedin;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/footer/div[2]/div[1]/div[5]/div[2]/ul/li[3]/a")
    private WebElement twitter;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-footer-docs-navigation\"]/li[1]/a")
    private WebElement termsOfService;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-footer-docs-navigation\"]/li[2]/a")
    private WebElement privacyPolicy;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/footer/div[2]/div[2]/div[1]/div[2]/div")
    private WebElement copyRightText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"language_selector\"]/button")
    private WebElement dropdown;


//    public String whatVersion = this.versionIndicator.getText();


    public void clickCompanyLink() throws InterruptedException {
        this.Company.click();
    }

    public void clickTeamLink() throws InterruptedException{
        this.team.click();
    }

    public void clickCareersLink() throws InterruptedException{
        this.careers.click();
    }

    public void clickBlogLink() throws InterruptedException{
        this.blog.click();
    }

    public void clickPressReleases() throws InterruptedException{
        this.pressReleases.click();
    }

    public void clickContacUsLink() throws InterruptedException{
        this.contactUs.click();
    }

    public void clickForFamiliesLink() throws InterruptedException{
        this.forFamilies.click();
    }

    public void clickForSchoolsLink() throws InterruptedException{
        this.forSchools.click();
    }

    public void clickForBusinessLink()throws InterruptedException{
        this.forBusiness.click();
    }

    public void clickResellersLink()throws InterruptedException{
        this.resellers.click();
    }

    public void clickPartners()throws InterruptedException{
        this.partners.click();
    }

    public void clickAffiliatesLink()throws InterruptedException{
        this.affiliates.click();
    }

    public void clickHelpLink() throws InterruptedException{
        this.help.click();
    }

    public void clickSystemRequirementsLink() throws InterruptedException{
        this.systemRequirements.click();
    }

    public void clickResourcesForParentsLink() throws InterruptedException{
        this.resourcesForParents.click();
    }

    public void clickSitemapLink() throws InterruptedException{
        this.sitemap.click();
    }

    public void clickFacebookButton()throws InterruptedException{
        this.facebook.click();
    }

    public void clickLinkedinButton()throws InterruptedException{
        this.linkedin.click();
    }

    public void clickTwitterButton()throws InterruptedException{
        this.twitter.click();

    }

    public void clickTermsOfService()throws InterruptedException{
        this.termsOfService.click();

    }

    public void clickPrivacyPolicy()throws InterruptedException{
        this.privacyPolicy.click();

    }

    public String getCopyRightText()throws InterruptedException{
       return this.copyRightText.getText();
    }

    public void clickDropDown()throws InterruptedException{
        this.dropdown.click();
    }

}
