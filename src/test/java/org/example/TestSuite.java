package org.example;

import com.google.common.annotations.VisibleForTesting;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    //Objects created to call the required class
    Homepage homepage = new Homepage();

    RegisterPage registerPage = new RegisterPage();

    RegisterResultPage registerResultPage = new RegisterResultPage();

    LoginPage loginPage = new LoginPage();

    ElectronicsPage electronicsPage = new ElectronicsPage();

    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();

    LeicaTMirrorlessDigitalCameraPage leicaTMirrorlessDigitalCameraPage = new LeicaTMirrorlessDigitalCameraPage();

    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();

    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully() {
        //click on register button
        homepage.clickOnRegisterButton();
        //enter registration details
        registerPage.enterRegistrationDetails();
        //verify the result
        registerResultPage.verifyUserRegisteredSuccessfully();

    }

    @Test
    public void verifyRegisteredUserIsAbleToLogin() {
        //click on register button
        homepage.clickOnRegisterButton();
        //enter registration details
        registerPage.enterRegistrationDetails();
        //verify the result
        registerResultPage.verifyUserRegisteredSuccessfully();
        //click on Login
        loginPage.enterLoginDetails();
    }

    @Test
    public void registeredUserIsAbleToReferAProduct() {

        //click on register button
        homepage.clickOnRegisterButton();
        //enter registration details
        registerPage.enterRegistrationDetails();
        //verify the result
        registerResultPage.verifyUserRegisteredSuccessfully();
        //click on Login
        loginPage.enterLoginDetails();
        //click on electronics
        homepage.clickOnElectronic();
        //click on Camera & Photo
        electronicsPage.clickOnCameraAndPhoto();
        //click on Leica T Mirrorless Digital Camera
        cameraAndPhotoPage.clickOnLeicaTMirrorlessDigitalCamera();
        //click on email a friend
        leicaTMirrorlessDigitalCameraPage.clickOnEmailAFriend();
        // enter details to refer the product
        emailAFriendPage.enterEmailAFriendDetails();

    }

    @Test
    public void verifyThatUserIsAbleToBuildYourOwnComputer() {
        //click on register button
        homepage.clickOnRegisterButton();
        //enter registration details
        registerPage.enterRegistrationDetails();
        //verify the result
        registerResultPage.verifyUserRegisteredSuccessfully();
        //click on Login
        loginPage.enterLoginDetails();
        //click on build your computer
        homepage.clickOnBuildYourOwnComputer();
        //enter the product specifications
        buildYourOwnComputerPage.selectFeatureOfTheProduct();
        //Verify the product in the shopping cart
        shoppingCartPage.verifyProductInTheShoppingCart();

    }

}
