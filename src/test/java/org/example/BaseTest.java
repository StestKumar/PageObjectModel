package org.example;

import org.checkerframework.framework.qual.AnnotatedFor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    BrowserManager browsermanager = new BrowserManager();

    @BeforeMethod
    public void setup() {
        browsermanager.openBrowser();
    }

   // @AfterMethod
    public void tearDown() {
        browsermanager.closeBrowser();
    }
}





