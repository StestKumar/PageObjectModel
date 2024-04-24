package org.example;


import org.openqa.selenium.By;

//Only Homepage Related Methods Here
public class Homepage extends Utility {
    ////Click On Register Button
    public void clickOnRegisterButton() {
        findByElement(By.className("ico-register"));
    }

    //Click On Login Button
    public void clickOnLoginButton() {
        findByElement(By.className("ico-login"));
    }

    public void clickOnElectronic() {
        //Click on Electronics
        findByElement(By.linkText("Electronics"));
    }

    public void clickOnBuildYourOwnComputer() {
        findByElement(By.linkText("Build your own computer"));
    }
}
