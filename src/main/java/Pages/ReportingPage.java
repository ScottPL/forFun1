package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ReportingPage extends BasePage{

//    CONSTRUCTOR

    public ReportingPage (WebDriver driver) {
        super(driver);
        waitForPageElements();
    }

    @FindBy(className = "title")
    private WebElement reportName;

//  VARIABLES

    String reportingPageUrl = "https://engagecore1.stable-cw.product.mttnow.com/mcw/#/engage/reporting";

   private void waitForPageElements() {
        wait.until(ExpectedConditions.visibilityOf(reportName));

    }

    public String getExpectedReportingUrl() {
        return reportingPageUrl;
    }
}
