package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.LoginModel;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PremiumPage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by casab on 11/2/2017.
 */
public class PremiumTest extends BaseTestLogin {

    @DataProvider(name = "LoginJson")
    public Iterator<Object[]> jsonLoginDataProvider() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Collection<Object[]> dp = new ArrayList<>();

        File[] files = getListOfFiles("loginJson");
        for (File f : files) {
            LoginModel m = objectMapper.readValue(f, LoginModel.class);
            dp.add(new Object[]{m});
        }
        return dp.iterator();
    }

    @Test(dataProvider = "LoginJson",priority = 1)
    public void Test1(LoginModel loginModel) throws InterruptedException {
        PremiumPage premiumPage = PageFactory.initElements(driver, PremiumPage.class);

            premiumPage.PremiumTest();
        }

    @Test(dataProvider = "LoginJson",priority = 2)
    public void Test2(LoginModel loginModel) throws InterruptedException {
        PremiumPage premiumPage = PageFactory.initElements(driver, PremiumPage.class);

        premiumPage.PremiumTest();
    }

    @Test(dataProvider = "LoginJson",priority = 3)
    public void Test3(LoginModel loginModel) throws InterruptedException {
        PremiumPage premiumPage = PageFactory.initElements(driver, PremiumPage.class);

        premiumPage.PremiumTest();
    }

    @Test(dataProvider = "LoginJson",priority = 4)
    public void Test4(LoginModel loginModel) throws InterruptedException {
        PremiumPage premiumPage = PageFactory.initElements(driver, PremiumPage.class);

        premiumPage.PremiumTest();
    }

    @Test(dataProvider = "LoginJson",priority = 5)
    public void Test5(LoginModel loginModel) throws InterruptedException {
        PremiumPage premiumPage = PageFactory.initElements(driver, PremiumPage.class);

        premiumPage.PremiumTest();
    }

    @Test(dataProvider = "LoginJson",priority = 6)
    public void Test6(LoginModel loginModel) throws InterruptedException {
        PremiumPage premiumPage = PageFactory.initElements(driver, PremiumPage.class);

        premiumPage.PremiumTest();
    }

    @Test(dataProvider = "LoginJson",priority = 7)
    public void Test7(LoginModel loginModel) throws InterruptedException {
        PremiumPage premiumPage = PageFactory.initElements(driver, PremiumPage.class);

        premiumPage.PremiumTest();
    }

    @Test(dataProvider = "LoginJson",priority = 8)
    public void Test8(LoginModel loginModel) throws InterruptedException {
        PremiumPage premiumPage = PageFactory.initElements(driver, PremiumPage.class);

        premiumPage.PremiumTest();
    }

    @Test(dataProvider = "LoginJson",priority = 9)
    public void Test9(LoginModel loginModel) throws InterruptedException {
        PremiumPage premiumPage = PageFactory.initElements(driver, PremiumPage.class);

        premiumPage.PremiumTest();
    }

    @Test(dataProvider = "LoginJson",priority = 10)
    public void Test10(LoginModel loginModel) throws InterruptedException {
        PremiumPage premiumPage = PageFactory.initElements(driver, PremiumPage.class);

        premiumPage.PremiumTest();
    }


    }


