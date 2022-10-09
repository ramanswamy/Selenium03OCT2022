package com.tekparams.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
    public WebElement dashboard;
    public WebElement logout;

    public WebElement validateDashboard(WebDriver driver){
        dashboard=driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]"));
        return dashboard;
    }

    public WebElement logoutApplication(WebDriver driver){
        logout=driver.findElement(By.xpath("//a[contains(text(),'Log Out')]"));
        return logout;
    }


}
