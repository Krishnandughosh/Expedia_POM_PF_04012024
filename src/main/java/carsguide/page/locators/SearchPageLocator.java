package carsguide.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import java.util.List;

public class SearchPageLocator {
  @FindBy(how = How.XPATH, using = "//h1")
  public WebElement searchPageHeader;
  @FindBy(how = How.XPATH, using = "//select[@id='makes']")
  public WebElement makes;
  @FindBy(how = How.XPATH, using = "//select[@id='models'] ")
  public WebElement models;
  @FindBy(how = How.XPATH, using = "//select[@id='locations']")
  public WebElement location;
  @FindBy(how = How.XPATH, using = "//input[@id='search-submit']")
  public WebElement searchButton;

  @FindBy( how= How.XPATH,using="//select[@id='models']/option")
  public WebElement modelOption;

}
