package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_register {



    public WebElement Register_Button(){
        return Hooks.driver.findElement(By.className("ico-register"));
    }


    public WebElement Gender (){
         return Hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement First_Name(){

        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement Last_Name(){
        return Hooks.driver.findElement(By.id("LastName"));
    }


    public WebElement E_Mail(){
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement Pass(){
        return Hooks.driver.findElement(By.name("Password")) ;
    }

    public WebElement Confirm_Pass (){
        return Hooks.driver.findElement(By.id("ConfirmPassword")) ;
    }

    public WebElement Click_Button(){
        return Hooks.driver.findElement(By.id("register-button"));
    }

}
