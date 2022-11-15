package org.example.stepDef;

import com.google.j2objc.annotations.Weak;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class D07_followUsStepDef {

    P03_homePage S1 = new P03_homePage();

    @When("User click on facebook Link")
    public void face_book() throws InterruptedException {
        S1.Facebook().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println("Before Switch "+ Hooks.driver.getCurrentUrl());
    }

    @Then("Page shall be opened in new tab {string}")
    public void Face_book(String arg05){

        ArrayList<String> tab = new ArrayList<String>(Hooks.driver.getWindowHandles()); // there is another window need to be handled
        Hooks.driver.switchTo().window(tab.get(1)); // Switch driver to the second window
        System.out.println("After Switch"+ Hooks.driver.getCurrentUrl());
        // now we are working on the second window
        String ActualResult = Hooks.driver.getCurrentUrl();
        SoftAssert soft1= new SoftAssert();
        soft1.assertEquals(ActualResult,arg05);

        Hooks.driver.close();

        Hooks.driver.switchTo().window(tab.get(0));

        soft1.assertAll();


    }

    @When("User click on Twitter link")
    public void Twitter(){
      S1.Twitter().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2)); // inform selenium to wait till the second window is opened
    }

    @When("User click on rss")
    public void rss() {
        S1.rss().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }

    @When("User click on youtube")
    public void  youTube(){
        S1.youtube().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }

}
