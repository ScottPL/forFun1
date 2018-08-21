package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage extends BasePage {

    // CONSTRUCTOR
        public LoginPage (WebDriver driver, WebDriverWait wait) {
            super(driver, wait);
    }

    // VARIABLES, LOCATORS

    @FindBy(className = "col-md-4 col-md-offset-4 logo")
    public WebElement theTdlLogo;

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-submit")
    private WebElement loginButton;

    String baseUrl = "https://engage1.stable-cw.product.mttnow.com/mcw/#/login";
    String reportingPageUrl = "https://engage1.stable-cw.product.mttnow.com/mcw/#/engage/reporting";

    // METHODS

    //Go to Login page
    public void openPage() {
        driver.get(baseUrl);
    }

    //Check the page is TDL by its logo's url
    public void checkTdlLogo(WebElement theTdlLogo) {
        this.theTdlLogo = theTdlLogo;
        String logoText = theTdlLogo.getText();
        Assert.assertEquals(logoText,
                "https://engage1.stable-cw.product.mttnow.com/mcw/src/img/common-img/logo@2x.png");
    }

    //Input username
    public void inputUsername(WebElement usernameInput) {
        this.usernameInput = usernameInput;
        usernameInput.sendKeys("username");
    }

    //Input password
    public void inputPassword(WebElement passwordInput) {
        this.passwordInput = passwordInput;
        passwordInput.sendKeys("password");
    }

    //Click Login button
    public void clickLoginButton (WebElement loginButton) {
        this.loginButton = loginButton;
        loginButton.click();
    }

    //Check if Reporting page was displayed
    public void checkReportingPage (String reportingPageUrl){
        this.reportingPageUrl = reportingPageUrl;
        Assert.assertEquals(reportingPageUrl, "https://engage1.stable-cw.product.mttnow.com/mcw/#/engage/reporting");
    }
}