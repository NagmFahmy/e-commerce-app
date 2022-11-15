package org.example.stepDef;

import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class D05_hoverCategoriesStepDef {

    @When("User click on Parent and select sub")
    public void hover_Test() throws InterruptedException {
        // WebElement X = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
        List<WebElement> Parent = Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>Li>a[href]")); //Here i get the main 7 elements
        System.out.println("Size is "+ Parent.size()); // am right
        int random = new Random().nextInt(3); // first 3 elements ( with sub )
        Actions actions = new Actions(Hooks.driver); //
        actions.moveToElement(Parent.get(random)).perform(); // to select randomly
        System.out.println(Parent.get(random).getText()); // am right
        random = random + 1; // to avoid 0
        List<WebElement> Childs = Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/Li[" + random + "]/ul[@class=\"sublist first-level\"]/li"));
        int sub_ran = new Random().nextInt(3); // to select form childs
        String Child = Childs.get(sub_ran).getText();
        Childs.get(sub_ran).click();
        String title = Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]")).getText();
        Assert.assertTrue(title.toLowerCase().contains(Child.toLowerCase()));
    }
}
