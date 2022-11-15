package org.example.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import org.example.pages.P01_register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
public  static  WebDriver driver = null ;
@Before
    public static void Open_Browser() throws InterruptedException {
    String chromePath=  System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver",chromePath);
     driver = new ChromeDriver();
    driver.navigate().to("https://demo.nopcommerce.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
}

@After
    public static void Close_Browser() throws InterruptedException {
    Thread.sleep(3000);

    driver.quit();
}


}
