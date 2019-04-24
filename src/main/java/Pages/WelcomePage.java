package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WelcomePage extends BasePage {

//    CONSTRUCTOR

  public WelcomePage(WebDriver driver) {
    super(driver);
    waitForPageElements();
  }

  @FindBy(className = "start-subtitle")
  private WebElement movie;

  String welcomePageUrl = "https://start.ro.co/rory/vaginal-dryness/online-visit/10";

  private void waitForPageElements() {
    wait.until(ExpectedConditions.visibilityOf(movie));
  }

  public String getExpectedWelcomePageUrl() {
    return welcomePageUrl;
  }
}
