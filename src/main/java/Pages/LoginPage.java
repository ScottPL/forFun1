package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    // CONSTRUCTOR
        public LoginPage (WebDriver driver) {

            super(driver);
    }

    // VARIABLES, LOCATORS

    @FindBy(css = "div[class='col-md-4 col-md-offset-4 logo']")
    private WebElement theTdlLogo;

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-submit")
    private WebElement loginButton;

    String baseUrl = "https://engagecore1.stable-cw.product.mttnow.com/mcw/#/login";
    String expectedLogoUrl = "url(\"https://engagecore1.stable-cw.product.mttnow.com/mcw/src/img/common-img/logo@2x.png\")";

    // METHODS

    //Go to Login page
    public void openPage() {
        driver.get(baseUrl);
    }

    public String getExpectedLogoUrl() {
        return expectedLogoUrl;
    }

    //Check the page is TDL by its logo's url
    public String getTdlLogoText() {
        theTdlLogo.click();
        return theTdlLogo.getCssValue("background-image");
    }

    public void inputUsername(String user) {
        usernameInput.sendKeys(user);
    }

    //Input password
    public void inputPassword(String password) {
        passwordInput.sendKeys(password);
    }

    //Click Login button
    public void clickLoginButton () {
        loginButton.click();
    }

    //Waiting for different URL then login page
    public void waitForUrlToChange () {
        for (int i=0; i<=5; i++) {
           if (driver.getCurrentUrl().equals(baseUrl)) {
               hardWait(1);
            }
            else {
               break;
           }
        }
    }
}