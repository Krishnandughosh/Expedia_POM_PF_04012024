package expedia.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlightSearchResultPageLocator {
  @FindBy(how = How.XPATH, using = "//li/span[contains(text(),'Choose departing flight')]")
  public WebElement flightsSearchReasultHeader;
}
