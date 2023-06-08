package pages;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIN  extends CommonAPI {
    Logger LOG= LogManager.getLogger(LogIN.class.getName());

    public LogIN(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    //OBJECT
    @FindBy(name="user-name")
    WebElement userName;
    @FindBy(name="password")
    WebElement password;
    @FindBy(name="login-button")
    WebElement loginButton;




    //Reusable Steps
    public void userNameField(String text){
        Type(userName,text);
        LOG.info("user name entering successful");
    }
   public  void passwordField(String text){
        Type(password,text);
        LOG.info("password entering successful");
   }
   public  void clickButton(){
        clickOnLogIN(loginButton);
        LOG.info("clicking button successful");
   }


}
