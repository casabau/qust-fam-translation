package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FooterPage {
    WebDriver driver;

    public FooterPage(WebDriver driverIn ){
           this.driver=driverIn;
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-footer-about-navigation\"]/li[1]/a")
    private WebElement Company;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menu-footer-about-navigation\"]/li[2]/a")
    private WebElement Team;

    @FindBy (how = How.XPATH, using = "//*[@id=\"menu-footer-about-navigation\"]/li[3]/a")
    private WebElement Careers;

    @FindBy (how = How.XPATH, using = "//*[@id=\"menu-footer-about-navigation\"]/li[4]/a")
    private WebElement Blog;

    @FindBy (how = How.XPATH, using = "//*[@id=\"menu-footer-about-navigation\"]/li[5]/a")
    private WebElement PressReleases;

    @FindBy (how = How.XPATH, using = "//*[@id=\"menu-footer-about-navigation\"]/li[6]/a")
    private WebElement ContactUs;

    @FindBy (how = How.XPATH, using = "//*[@id=\"menu-footer-products-navigation\"]/li[1]/a")
    private WebElement ForFamilies;

    @FindBy (how = How.XPATH, using = "//*[@id=\"menu-footer-products-navigation\"]/li[2]/a")
    private WebElement ForSchools;

    @FindBy (how = How.XPATH, using = "//*[@id=\"menu-footer-products-navigation\"]/li[3]/a")
    private WebElement ForBusiness;

    @FindBy (how = How.XPATH, using = "//*[@id=\"menu-footer-partners-navigation\"]/li[1]/a")
    private WebElement Resellers;

    @FindBy (how = How.XPATH, using = "//*[@id=\"menu-footer-partners-navigation\"]/li[2]/a")
    private WebElement Partners;

    @FindBy (how = How.XPATH, using = "//*[@id=\"menu-footer-partners-navigation\"]/li[3]/a")
    private WebElement Affiliates;

    @FindBy (how = How.XPATH, using = "//*[@id=\"menu-footer-resources-navigation\"]/li[1]/a")
    private WebElement Help;

    @FindBy (how = How.XPATH, using = "//*[@id=\"menu-footer-resources-navigation\"]/li[2]/a")
    private WebElement SystemRequirements;

    @FindBy (how = How.XPATH, using = "//*[@id=\"menu-footer-resources-navigation\"]/li[3]/a")
    private WebElement Resourcesforparents;

    @FindBy (how = How.XPATH, using = "//*[@id=\"menu-footer-resources-navigation\"]/li[4]/a")
    private WebElement Sitemap;

    @FindBy (how = How.XPATH, using = "//*[@id=\"page\"]/footer/div[2]/div[1]/div[5]/div[2]/ul/li[1]/a")
    private WebElement Facebook;

    @FindBy (how = How.XPATH, using = "//*[@id=\"page\"]/footer/div[2]/div[1]/div[5]/div[2]/ul/li[2]/a")
    private WebElement Linkedin;
    @FindBy (how = How.XPATH, using = "//*[@id=\"page\"]/footer/div[2]/div[1]/div[5]/div[2]/ul/li[3]/a")
    private WebElement Twitter;

    @FindBy (how = How.XPATH, using = "//*[@id=\"menu-footer-docs-navigation\"]/li[1]/a")
    private WebElement TermsOfService;
    @FindBy (how = How.XPATH, using = "//*[@id=\"menu-footer-docs-navigation\"]/li[2]/a")
    private WebElement PrivacyPolicy;




    public void clickCompanyLink() throws InterruptedException{
        this.Company.click();
    }

    public void clickTeamLink() throws InterruptedException{
        this.Team.click();
    }

    public void clickCareersLink() throws InterruptedException{
        this.Careers.click();
    }

    public void clickBlogLink() throws InterruptedException{
        this.Blog.click();
    }
    public void clickPressReleasesLink() throws InterruptedException{
        this.PressReleases.click();
    }
    public void clickContactUsLink() throws InterruptedException{
        this.ContactUs.click();
    }
    public void clickForFamiliesLink() throws InterruptedException{
        this.ForFamilies.click();
    }
    public void clickForSchoolsLink() throws InterruptedException{
        this.ForSchools.click();

    }
    public void clickForBusinessLink() throws InterruptedException{
        this.ForBusiness.click();
    }
    public void clickResellersLink() throws InterruptedException{
        this.Resellers.click();
    }
    public void clickPartnersLink() throws InterruptedException{
        this.Partners.click();
    }
    public void clickAffiliatesLink() throws InterruptedException{
        this.Affiliates.click();
    }
    public void clickHelpLink() throws InterruptedException{
        this.Help.click();
    }
    public void ClickSystemRequirementsLink()throws InterruptedException{
        this.SystemRequirements.click();
    }
    public void ClickResourcesforparents()throws InterruptedException{
        this.Resourcesforparents.click();
    }
    public void ClickSiteMapLink()throws InterruptedException{
        this.Sitemap.click();
    }
    public void clickFacebookButton()throws InterruptedException{
        this.Facebook.click();
    }
    public void clickLinkedinButton()throws InterruptedException{
        this.Linkedin.click();
    }
    public void clickTwitterButton()throws InterruptedException{
        this.Twitter.click();
    }
    public void clickTermsOfServiceLink()throws InterruptedException{
        this.TermsOfService.click();
    }
    public void clickPrivacyPolicy()throws InterruptedException{
        this.PrivacyPolicy.click();
    }


}
