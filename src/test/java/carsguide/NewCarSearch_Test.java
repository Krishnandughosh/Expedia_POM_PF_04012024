package carsguide;

import carsguide.page.actions.HomePageAction;
import carsguide.page.actions.SearchPageAction;
import carsguide.page.actions.SearchResultPageAction;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.testng.Tag;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
@Feature("NewCarSearch")
@Story("NewCarSearch_Test")
@Owner("Krishnandu")
@Tag("Functional")
public class NewCarSearch_Test extends carsguide.TestBase {
  HomePageAction home;
  SearchPageAction searchPage;
  SearchResultPageAction searchResultPage;
  String makes = "Audi";
  String model = "A1";
  String location = "";
  String price = "";
  String expectedTitle = "New Car";

  @Test
  @Description("running the validation of new car test")
  public void validationUsedCarSearchTest() throws InterruptedException {
   log.info("This is a log message in {} class", getClass().getName());
    home = new HomePageAction();
    searchPage = new SearchPageAction();
    searchResultPage = new SearchResultPageAction();
    step("Navigating to buySellTab", () -> {
      home.buySellTabOpen();
    });
    step("Click on the New Car Link", () -> {
      home.newCarLinkClick();
    });

    String searchPageTitle = searchPage.getTitle();
    Assert.assertTrue(searchPageTitle.contains(expectedTitle));
    String searchPageHeader = searchPage.getHeader();
    Assert.assertTrue(searchPageHeader.contains(expectedTitle));
    step("Selecting the Car Makes", () -> {
      searchPage.selectMake(makes);
    });
    step("Selecting the Car Model", () -> {
      searchPage.selectmodel(model);
    });
    step("Clcik on the Button", () -> {
      searchPage.clickSearchButton();
    });
    String searchResultPageTitle = searchResultPage.getTitle();
    Assert.assertTrue(searchResultPageTitle.contains(makes));
    String searchResultPageHeader = searchResultPage.getHeader();
    Assert.assertTrue(searchResultPageHeader.contains(makes));
    Assert.assertTrue(searchResultPageHeader.contains(model));
  }
}
