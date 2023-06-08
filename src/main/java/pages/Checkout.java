package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout extends CommonAPI {
    public Checkout(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="//button[@id='checkout']" )
    WebElement checkoutButton;
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement zipCode;
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueButton;
    public void clickOnCheckout(){
        clickOnLogIN(checkoutButton);
    }
    public void clickOnFirstNameField(String text){
        Type(firstName,text);
    }
    public void clickOnLastNameField(String text){
        Type(lastName,text);
    }
    public void clickOnZipCodeField(String text){
        Type(zipCode,text);
    }
    public void clickOnContinue(){
        clickOnLogIN(continueButton);
    }

}
