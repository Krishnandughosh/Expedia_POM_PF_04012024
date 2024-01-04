package expedia.page.actions;

import expedia.base.PageBase;
import expedia.page.locators.FlightSearchResultPageLocator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static expedia.base.GlobalConfig.factoryWaitTimeOut;

public class FlightSearchResultPageActions extends PageBase {
  public FlightSearchResultPageLocator flightSearchResultPage;

  public FlightSearchResultPageActions() {
    this.flightSearchResultPage = new FlightSearchResultPageLocator();
    AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, factoryWaitTimeOut);
    PageFactory.initElements(factory, this.flightSearchResultPage);
  }
  public String getFlightSearchResultPageHeader() {
    return (value(flightSearchResultPage.flightsSearchReasultHeader));
  }
}
