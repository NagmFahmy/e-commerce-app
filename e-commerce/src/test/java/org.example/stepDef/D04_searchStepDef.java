package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class D04_searchStepDef {

    P03_homePage S = new P03_homePage();

    @When("User search with {string}")
    public void Search(String arg01){

       S.SearchField().click();
        S.SearchField().sendKeys(arg01);
        S.SearchButton().click();

    }

    @Then("User can find {string}")
    public void Success(String arg01){

        String ExprectedResult = "https://demo.nopcommerce.com/search?q="+arg01;
        String ExpectedRsult2 = "https://demo.nopcommerce.com/search?q=";
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),ExprectedResult);
        Assert.assertEquals(Hooks.driver.getCurrentUrl().contains(ExpectedRsult2),true);
       // List<WebElement> ProductItems = Hooks.driver.findElements(By.className("product-item"));

        System.out.println(S.ProductItems().size());

        for(int i=0; i<S.ProductItems().size();i++){

            Assert.assertTrue(S.ProductItems().get(i).getText().toLowerCase().contains(arg01));


        }




    }
    @When("user search with {string}")
    public void sku(String arg02){

        S.SearchField().sendKeys(arg02);
        S.SearchButton().click();

    }
    @And("click on product image")
    public void Click(){

       S.ProductImage().click();

    }

    @Then("Page should be appeared with sku")
    public void Success(){
       String ExpectedResult = "NK_FRC_RS";
       Assert.assertEquals(Hooks.driver.findElement(By.className("label")).isDisplayed(),true);
       Assert.assertEquals(Hooks.driver.findElement(By.id("sku-24")).getText(),ExpectedResult);


    }

}
