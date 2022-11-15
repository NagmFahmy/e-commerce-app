package org.example.stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import javax.swing.text.Style;
import java.time.Duration;
import java.util.List;

public class D06_homeSlidersStepDef {

    P03_homePage SL = new P03_homePage();

    @When("User Click on Nokia Slider")
    public void Nokia_Slider(){

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeContains(SL.Sliders().get(0),"style", "display: block;"));
        SL.Sliders().get(0).click();

    }
    @Then("Nokia URL shall be appeared")
    public void Success(){
        SoftAssert soft=new SoftAssert();
        String ExpectedResult = "https://demo.nopcommerce.com/nokia-lumia-1020";
        soft.assertEquals(Hooks.driver.getCurrentUrl(),ExpectedResult,"error");
    }

    @When("User click on iphone slider")
    public void Second_Slider(){

        WebDriverWait wait2 = new WebDriverWait(Hooks.driver,Duration.ofSeconds(10));

        wait2.until(ExpectedConditions.attributeContains(SL.Sliders().get(1),"style","display: none;"));
        SL.Sliders().get(1).click();
    }

    @Then("Iphone URL shall be appeared")
    public void Iphone(){
        SoftAssert S = new SoftAssert();
        S.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6");
    }
}
