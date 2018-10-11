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

    //This is package-private
    BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
        wait = new WebDriverWait(driver, 10);
    }

    //Must be a public cause it is used in InitSteps, so have to be accessible.
    public BasePage() {

    }

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
