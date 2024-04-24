package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.awt.SystemColor.text;


// All utility related methods here
public class Utility extends BasePage {

    //Created a variable for email
    public static String email = "shivamdube" + randomDate() + "@gmail.com";
    //Created a variable for password
    public static String password = "Ipl2024";

    //Method To Find Element By Locators
    public static void findByElement(By by) {
        driver.findElement(by).click();
    }

    //Method To Find Text
    public static void findText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //Method To Get Text Of Element
    public static String getTextOfElement(By by) {
        driver.findElement(by).getText();
        return driver.findElement(by).getText();
    }

    //Method For Timestamp
    public static String randomDate() {
        DateFormat Dateformat = new SimpleDateFormat("ddMMyyyyhhmmss");
        Date date = new Date();
        return Dateformat.format(date);
    }

    public static void selectByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static void selectByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }

    public static void selectByIndex(By by, int num) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(num);
    }

}




