package carsguide.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResultPageLocator {
  @FindBy(how = How.XPATH, using = "//h1")
  public WebElement searchResultPageHeader;
}
