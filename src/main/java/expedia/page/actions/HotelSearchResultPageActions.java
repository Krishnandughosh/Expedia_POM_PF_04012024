package expedia.page.actions;

import expedia.base.PageBase;
import expedia.page.locators.FlightSearchResultPageLocator;
import expedia.page.locators.HotelSearchResultPageLocator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static expedia.base.GlobalConfig.factoryWaitTimeOut;

public class HotelSearchResultPageActions extends PageBase {
  public HotelSearchResultPageLocator hotelSearchResultPage;

  public HotelSearchResultPageActions() {
    this.hotelSearchResultPage = new HotelSearchResultPageLocator();
    AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, factoryWaitTimeOut);
    PageFactory.initElements(factory, this.hotelSearchResultPage);
  }
  public String getHotelSearchResultPageHeader() {
    return (value(hotelSearchResultPage.staysSearchResultHeader));
  }
}
