import carsguide.TestBase;
import carsguide.page.actions.HomePageAction;
import carsguide.page.actions.SearchPageAction;
import carsguide.page.actions.SearchResultPageAction;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

@Slf4j
public class UsedCarSearch_Test extends TestBase {
  HomePageAction home;
  SearchPageAction searchPage;
  SearchResultPageAction searchResultPage;
  String makes="Audi";
  String model="A1";
  String location="";
  String price="";
  String expectedTitle="Used Car";
  @Test
  public void validationUsedCarSearchTest() throws InterruptedException {
    log.info("This is a log message in {} class", getClass().getName());
    home=new HomePageAction();
    searchPage =new SearchPageAction();
    searchResultPage=new SearchResultPageAction();
    home.buySellTabOpen();
    home.usedCarLinkClick();
    String searchPageTitle =searchPage.getTitle();
    Assert.assertTrue(searchPageTitle.contains(expectedTitle));
    String searchPageHeader =searchPage.getHeader();
    Assert.assertTrue(searchPageHeader.contains(expectedTitle));
    searchPage.selectMake(makes);
    searchPage.selectmodel(model);
    searchPage.clickSearchButton();
    String searchResultPageTitle =searchResultPage.getTitle();
    Assert.assertTrue(searchResultPageTitle.contains(makes));
    String searchResultPageHeader =searchResultPage.getHeader();
    Assert.assertTrue(searchResultPageHeader.contains(makes));
    Assert.assertTrue(searchResultPageHeader.contains(model));
  }
}
