package org.example.stepDef;

import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.security.Key;
import java.sql.Driver;

public class D02_loginStepDef {

    P02_login login = new P02_login() ;

    @Given("User enter to login page")
    public void Login_Page() throws InterruptedException {
        login.Login_button().click();

        Thread.sleep(3000);
    }
    @When("User Enter valid username and valid password")
    public void Valid_data() throws InterruptedException {
       login.E_Mail().sendKeys("Nagmfahmyy@hotmail.com");
       login.Password().sendKeys("AAAAAA");
      //  Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]")).click();
        login.Password().sendKeys(Keys.ENTER);

        Thread.sleep(3000);
    }

    @Then("User able to login successfully")
    public void Login_Success() throws InterruptedException {
        Thread.sleep(3000);
        SoftAssert Y = new SoftAssert();
        String ExpectedResult = "https://demo.nopcommerce.com/";
        Y.assertEquals(Hooks.driver.getCurrentUrl(),ExpectedResult);
        Y.assertTrue(Hooks.driver.findElement(By.className("ico-account")).isDisplayed());
        Y.assertAll();
    }

    @When("User enter invalid username and password")
    public void Invalid_Data() throws InterruptedException {

        login.E_Mail().sendKeys("Nagm_Mimo@hotmail.com");
        login.Password().sendKeys("Mimo123");
        login.Password().sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    @Then("User could not able to login")
    public void login(){
        SoftAssert Z = new SoftAssert() ;
        String ExpectedResult ="Login was unsuccessful.";
        String ActualResult = Hooks.driver.findElement(By.className("message-error")).getText();
        Z.assertTrue(ActualResult.contains(ExpectedResult),"Error");
        String Color = Hooks.driver.findElement(By.className("message-error")).getCssValue("color") ;
        System.out.println(Color);
        Z.assertTrue(true,Color);
        Z.assertAll();

    }



}
