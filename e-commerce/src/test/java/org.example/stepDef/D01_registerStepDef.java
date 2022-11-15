package org.example.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.fr.Soit;
import org.example.pages.P01_register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {


    P01_register Regis = new P01_register();

    @Given("user go to Register page")
    public void Register_Button() throws InterruptedException {
          Regis.Register_Button().click();
          Thread.sleep(3000);
    }

    @When("User enter valid data")
    public void Valid_Data() throws InterruptedException {
        Regis.Gender().click();
        Thread.sleep(1000);
       Regis.First_Name().sendKeys("Nagm");
       Regis.Last_Name().sendKeys("Fahmy");
        Select Day = new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
        Day.selectByIndex(1);
        Thread.sleep(1000);
        Select Month = new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
        Month.selectByIndex(1);
        Thread.sleep(1000);
        Select year = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        year.selectByIndex(1);
        Thread.sleep(1000);
        Regis.E_Mail().sendKeys("Nagmfahmyy@hotmail.com");
        Regis.Pass().sendKeys("AAAAAA");
        Regis.Confirm_Pass().sendKeys("AAAAAA");
        Thread.sleep(1000);
        Regis.Click_Button().click();
    }

    @Then("User able to register successfully")
    public void User_Login (){
        SoftAssert X = new SoftAssert();
        String ExpectedResult = "Your registration completed";
        String ActualResult = Hooks.driver.findElement(By.className("result")).getText();
        X.assertEquals(ActualResult.contains(ExpectedResult),true);
        X.assertTrue(Hooks.driver.findElement(By.cssSelector("a[class=\"button-1 register-continue-button\"]")).isDisplayed());
        String Color=  Hooks.driver.findElement(By.className("result")).getCssValue("#color") ;
        X.assertTrue(true,Color);
    }


}
