package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {
    public void selectFeatureOfTheProduct() {
        //click on the processor dropdown
        selectByValue(By.id("product_attribute_1"), "2");
        //click on the Ram
        selectByValue(By.id("product_attribute_2"), "4");
        //click on the HDD
        findByElement(By.id("product_attribute_3_7"));
        //click of the OS
        findByElement(By.id("product_attribute_4_9"));
        //click on the software option preselected
        findByElement(By.id("product_attribute_5_10"));
        //click on the software
        findByElement(By.id("product_attribute_5_11"));
        //click on add to cart
        findByElement(By.id("add-to-cart-button-1"));
        //click on shopping cart
        findByElement(By.className("cart-label"));

    }
}
