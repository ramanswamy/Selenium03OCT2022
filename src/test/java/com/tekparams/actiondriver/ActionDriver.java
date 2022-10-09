package com.tekparams.actiondriver;


import com.tekparams.selenium.base.Base;
import com.tekparams.selenium.pageobjects.homePage;
import com.tekparams.selenium.pageobjects.loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionDriver {
    String browserType = "chrome";
    String url = "https://acme-test.uipath.com/login";
    public WebDriver driver;
    WebElement element;
    String strEmail = "ramanswamy@rediffmail.com";
    String strPassword = "EKY9GJ";
    String strActualResult;


    void setupApplicaiton() {
        Base driverInstance = new Base();
        driver = driverInstance.getDriverInstance(browserType);
        System.out.println("Driver instance is created..");
    }

    @Test(priority = 1)
    void openApplication() {
        setupApplicaiton();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    @Test(priority = 2)
    void loginToApplication() {
        loginPage login = new loginPage();
        homePage home = new homePage();

        element = login.email(driver);
        element.sendKeys(strEmail);
        element = login.password(driver);
        element.sendKeys(strPassword);
        element = login.login(driver);
        element.click();
        element = home.validateDashboard(driver);
        strActualResult = element.getText();
        Assert.assertEquals(strActualResult, "Dashboard");
   }

   @Test(priority = 3)
   public void logoutOfApplication(){
       homePage home = new homePage();
       element=home.logoutApplication(driver);
       element.click();
   }

   @Test(priority = 4)
   public void closeApplication(){
        driver.quit();
   }
}