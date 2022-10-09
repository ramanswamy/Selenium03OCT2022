package com.tekparams.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
    public WebElement txtEmail;
    public WebElement txtPassword;
    public WebElement btnLogin;

    public WebElement email(WebDriver driver){
        txtEmail= driver.findElement(By.id("email"));
        return txtEmail;
    }

    public WebElement password(WebDriver driver){
        txtPassword=driver.findElement(By.name("password"));
        return txtPassword;
    }

    public WebElement login(WebDriver driver){
        btnLogin = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        //btnLogin = driver.findElement(By.className("btn btn-primary"));
        return btnLogin;
    }
}
