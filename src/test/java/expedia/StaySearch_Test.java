package expedia;

import expedia.page.actions.FlightSearchResultPageActions;
import expedia.page.actions.HomePageActions;
import expedia.page.actions.HotelSearchResultPageActions;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
public class StaySearch_Test extends TestBase {
  HomePageActions homePage;
  HotelSearchResultPageActions hotelSearchResultPage;

  @Test
  public void flightSearch() throws InterruptedException {
    String goingTo="PURI";
    String title="Hotel";
    String header="properties";
    homePage=new HomePageActions();
    hotelSearchResultPage=new HotelSearchResultPageActions();
    homePage.goToStaysTab();
    homePage.searchStays(goingTo);
    Assert.assertTrue(hotelSearchResultPage.getTitle().contains(title));
    Assert.assertTrue(hotelSearchResultPage.getHotelSearchResultPageHeader().contains(header));
  }

}
