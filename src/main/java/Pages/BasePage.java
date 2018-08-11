package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    // VARIABLES, LOCATORS

    public final WebDriver driver;
    public WebDriverWait wait;

    // CONSTRUCTOR

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
        wait = new WebDriverWait(driver, 60);
    }

}
