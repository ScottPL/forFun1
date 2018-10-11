package Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavBar extends BasePage {

    public NavBar (WebDriver driver) {

        super(driver);
    }

//    @FindBy(className = "nav navbar-nav")
//    private WebElement menuItemContainer;

    @FindBy(css = "ul.nav.navbar-nav")
    private WebElement menuItemContainer;

    private By menuItem = By.cssSelector("li");

    public int countTopMenuItems () {
//        wait.until(ExpectedConditions.visibilityOf(menuItemContainer));
        List<WebElement> listOfTopMenuElements = menuItemContainer.findElements(menuItem);
        return listOfTopMenuElements.size();

    }







}
