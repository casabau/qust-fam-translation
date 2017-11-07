package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.HomeSignUpModel;
import models.LoginModel;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomeSignUpPage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by casab on 11/6/2017.
 */
public class HomeSignUPTest extends BaseTestPublicSite {
    @DataProvider(name = "HomeSignUP")
    public Iterator<Object[]> jsonHomeSignUp() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Collection<Object[]> dp = new ArrayList<>();

        File[] files = getListOfFiles("homeSignUpJson");
        for (File f : files) {
            HomeSignUpModel m = objectMapper.readValue(f, HomeSignUpModel.class);
            dp.add(new Object[]{m});
        }
        return dp.iterator();
    }

    @Test (dataProvider = "HomeSignUP")
    public void homeSignUpTest (HomeSignUpModel homeSignUpModel) throws InterruptedException{
        HomeSignUpPage homeSignUpPage = PageFactory.initElements(driver, HomeSignUpPage.class);
        homeSignUpPage.HomeSignUpFlow(homeSignUpModel);

         System.out.println("Hurray! Happy flow works!");

    }

}

