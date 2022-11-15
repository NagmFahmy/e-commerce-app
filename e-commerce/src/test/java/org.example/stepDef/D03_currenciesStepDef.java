package org.example.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class D03_currenciesStepDef {

    P03_homePage Curr = new P03_homePage() ;

    @When("User click on Currency dropdownlist and select Euro")
    public void Currency_dropdown() throws InterruptedException {

        Select Currency = new Select(Curr.Currency_List());
        Currency.selectByVisibleText("Euro");

        Thread.sleep(3000);
    }

    @Then("Euro Symbol is shown on the 4 products displayed in Home page")

    public void Currency_validation(){


       String[] x = new String[4];

        for(int i= 0 ; i<Curr.prices().size() ; i++){
            x[i]=Curr.prices().get(i).getText();
            System.out.println(x[i]);
        Assert.assertTrue(x[i].contains("€"));
        }




    }


}
