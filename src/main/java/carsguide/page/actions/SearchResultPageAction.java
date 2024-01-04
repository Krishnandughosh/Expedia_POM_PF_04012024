package carsguide.page.actions;

import carsguide.base.PageBase;
import carsguide.page.locators.SearchResultPageLocator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static carsguide.base.GlobalConfig.factoryWaitTimeOut;

public class SearchResultPageAction extends PageBase {
  public SearchResultPageLocator searchResultPageLocator;

  public SearchResultPageAction() {
    this.searchResultPageLocator = new SearchResultPageLocator();
    AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, factoryWaitTimeOut);
    PageFactory.initElements(factory, this.searchResultPageLocator);
  }

  public String getHeader() {
    String header=value(searchResultPageLocator.searchResultPageHeader);
    return header;
  }

}
