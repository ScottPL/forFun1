package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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

    String baseUrl = "https://engage1.stable-cw.product.mttnow.com/mcw/#/login";
    String reportingPageUrl = "https://engage1.stable-cw.product.mttnow.com/mcw/#/engage/reporting";
    String expectedLogoUrl = "url(\"https://engage1.stable-cw.product.mttnow.com/mcw/src/img/common-img/logo@2x.png\n)";

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

//        Assert.assertEquals(logoText, expectedLogoText);
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