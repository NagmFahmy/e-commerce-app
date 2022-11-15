package org.example.stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D08_WishlistStepDef {

    @When("user click on wishlist button")
    public void whishlist (){
    //    Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
         Hooks.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div > div.product-grid.home-page-product-grid > div.item-grid > div:nth-child(3) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-wishlist-button")).click();
    }


    @Then("Green message shall be appeared")
    public void Success_Message(){
       // Hooks.driver.findElement(By.cssSelector("#bar-notification > div")).isDisplayed();
        //Hooks.driver.findElement(By.cssSelector("#bar-notification > div")).getCssValue("background-color");
        Assert.assertTrue(Hooks.driver.findElement(By.className("content")).isDisplayed());
    }
}
