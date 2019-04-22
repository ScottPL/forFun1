package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OnlineVisitPage extends BasePage {

//    CONSTRUCTOR

  public OnlineVisitPage(WebDriver driver) {
    super(driver);
    waitForPageElements();
  }

  @FindBy(className = "start-subtitle")
  private WebElement movie;

  String onlineVisitPageUrl = "https://start.ro.co/rory/vaginal-dryness/online-visit/10";

  private void waitForPageElements() {
    wait.until(ExpectedConditions.visibilityOf(movie));

  }

  public String getExpectedOnlineVisitPageUrl() {
    return onlineVisitPageUrl;
  }
}
