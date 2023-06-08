package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products extends CommonAPI {
    Logger LOG= LogManager.getLogger(Products.class.getName());

    public Products(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addToCart;
    @FindBy (xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    WebElement ShoppingCart;
    public void clickOnAddToCart(){
        clickOnLogIN(addToCart);
    }
    public void clickOnShoppingCart(){
        clickOnLogIN(ShoppingCart);
    }
    }
