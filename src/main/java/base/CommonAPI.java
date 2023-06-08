package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class CommonAPI {
    public WebDriver driver;
    public void getLocalDriver(String browserName)  {
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else  if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }

    }
    @Parameters({"browserName","url"})
    @BeforeMethod
    public void setup(String browserName, String url) {
        getLocalDriver(browserName);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void teardown()  {
        driver.quit();


    }

    public void Type(WebElement element, String text) {
        element.sendKeys(text);
    }
    public void clickOnLogIN(WebElement element){
       element.click();
    }
    public void selectOptionFromDropdown(WebElement dropdown , String option) {

        Select select = new Select(dropdown);
        try {
            select.selectByVisibleText(option);
        } catch (Exception e) {
            select.selectByValue(option);

        }
    }
}
