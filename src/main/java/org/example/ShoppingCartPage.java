package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    String expectedMessage = "Build your own computer";

    public void verifyProductInTheShoppingCart() {

        Assert.assertEquals(getTextOfElement(By.className("product-name")), expectedMessage);
    }

}
