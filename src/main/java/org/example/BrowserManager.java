package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

//Everything Browser Related In Here
public class BrowserManager extends Utility {

    //Creating a Browser
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //get the URL
        driver.get("https://demo.nopcommerce.com/");
    }
    public void closeBrowser() {
        driver.quit();
    }
}


