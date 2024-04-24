package org.example;


import org.openqa.selenium.By;

public class RegisterPage extends Utility {


    public void enterRegistrationDetails() {  //Click on Register
        findByElement(By.className("ico-register"));

        //Enter First Name
        findText(By.id("FirstName"), "Shivam");

        //Enter Last Name
        findText(By.id("LastName"), "Dube");

        //Enter Day Of Birth
        selectByVisibleText(By.name("DateOfBirthDay"), "26");

        //Enter Month Of Birth
        selectByVisibleText(By.name("DateOfBirthMonth"), "June");

        //Enter Year Of Birth
        selectByVisibleText(By.name("DateOfBirthYear"), "1993");

        //Enter Email id
        findText(By.id("Email"), email);

        //Enter Password
        findText(By.id("Password"), password);

        //Confirm Password
        findText(By.id("ConfirmPassword"), "Ipl2024");

        //Click on Register Button
        findByElement(By.id("register-button"));

    }
}
