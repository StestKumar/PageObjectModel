package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;

public class RegisterResultPage extends Utility {
    String expectedMsgEqualsActualMsg = "Your registration completed";

    public void verifyUserRegisteredSuccessfully() {
        Assert.assertEquals(getTextOfElement(By.xpath("//div[@class=\"result\"]")), expectedMsgEqualsActualMsg);
    }

}