package Pages;

import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;
import org.testng.Assert;


@Data
@Component
public class LoginPage extends BasePage {

    // CONSTRUCTOR

    WebDriver driver;
    WebDriverWait wait;

    // VARIABLES, LOCATORS

    @FindBy(className = "col-md-4 col-md-offset-4 logo")
    private WebElement theTdlLogo;

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-submit")
    private WebElement loginButton;

    String baseUrl ="https://engage1.stable-cw.product.mttnow.com/mcw/#/login";
    String expectedUrl = "https://engage1.stable-cw.product.mttnow.com/mcw/#/engage/reporting";


    // METHODS

    //Go to Login page
    public void openLoginPage(){
        driver.get(baseURL);
    }

    //Check the page is TDL by its logo's url
    public void checkTdlLogo () {
        WebElement tmp = driver.findElement(By.cssSelector(theTdlLogo));
        String logoText = tmp.getText();
        Assert.assertEquals(logoText,"https://engage1.stable-cw.product.mttnow.com/mcw/src/img/common-img/logo@2x.png");
    }
    public void waitForUrlToChange(String expectedUrl) {
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
    }

}