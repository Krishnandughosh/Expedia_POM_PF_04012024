package expedia;

import expedia.page.actions.FlightSearchResultPageActions;
import expedia.page.actions.HomePageActions;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
public class FlightSearch_Test extends TestBase {
  HomePageActions homePage;
  FlightSearchResultPageActions flightSearchResultPage;

  @Test
  public void flightSearch(){
    String leavingFrom ="CCU";
    String goingTo="IAD";
    String title="flights";
    homePage=new HomePageActions();
    homePage.goToFlightsTab();
    homePage.goToOneWay();
    homePage.searchFlights(leavingFrom,goingTo);
    Assert.assertTrue(flightSearchResultPage.getTitle().contains(title));
    Assert.assertTrue(flightSearchResultPage.getFlightSearchResultPageHeader().contains(title));
  }


}
