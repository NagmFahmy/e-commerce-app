package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P02_login {

    public WebElement Login_button (){

        return Hooks.driver.findElement(By.className("ico-login"));
    }

    public WebElement E_Mail(){
        return Hooks.driver.findElement(By.id("Email"));
    }

    public  WebElement Password(){

        return  Hooks.driver.findElement(By.id("Password"));
    }


}
