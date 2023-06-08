package test;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.Checkout;
import pages.LogIN;
import pages.Products;

public class TestLogIN extends CommonAPI {
    Logger LOG= LogManager.getLogger(TestLogIN.class.getName());
    @Test
    public void test1() throws InterruptedException {
        LogIN log1=new LogIN(driver);
        Products products =new Products(driver);
        Checkout checkout =new Checkout(driver);

        log1.userNameField("standard_user");
        log1.passwordField("secret_sauce");
        LOG.info("username and password intered successfully ");
        log1.clickButton();
        Thread.sleep(1000);

       products.clickOnAddToCart();

       products.clickOnShoppingCart();
        Thread.sleep(2000);

       checkout.clickOnCheckout();
       checkout.clickOnFirstNameField("moawia");
       checkout.clickOnLastNameField("moawia");
       checkout.clickOnZipCodeField("18799");
        Thread.sleep(3000);
       checkout.clickOnContinue();
        Thread.sleep(4000);

    }




}