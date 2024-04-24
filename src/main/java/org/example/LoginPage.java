package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utility {
    //Enter Email id
    public void enterLoginDetails() {
        //click on login button
        findByElement(By.className("ico-login"));

        //enter email id
        findText(By.id("Email"), email);

        //enter password
        findText(By.id("Password"), password);

        //click on login button
        findByElement(By.xpath("//button[@class ='button-1 login-button']"));

    }
}
