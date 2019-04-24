package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    // VARIABLES, LOCATORS

    public WebDriver driver;
    public WebDriverWait wait;

    // CONSTRUCTOR

    BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 11), this);
        wait = new WebDriverWait(driver, 11);
    }

    public BasePage() {}

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void hardWait(int numbOfSeconds) {
        try {
            Thread.sleep(1000 * numbOfSeconds);
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
    }
}
