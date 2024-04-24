package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    public void clickOnCameraAndPhoto() {

        //Click on Camera & Photo
        findByElement(By.xpath("//a[@title='Show products in category Camera & photo']"));

    }
}
