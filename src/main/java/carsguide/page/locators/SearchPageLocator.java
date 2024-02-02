package carsguide.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import java.util.List;

public class SearchPageLocator {
  @FindBy(how = How.XPATH, using = "//h1")
  public WebElement searchPageHeader;
  @FindBy(how = How.XPATH, using = "//div[@class='dropdown']//select[@id='make']")
  public WebElement makes;
  @FindBy(how = How.XPATH, using = "//div[@class='dropdown']//select[@id='model'] ")
  public WebElement models;
  @FindBy(how = How.XPATH, using = "//div[@class='dropdown']//select[@id='location']")
  public WebElement location;
  @FindBy(how = How.XPATH, using = "//button[contains(text(),'vehicles')]")
  public WebElement searchButton;

  @FindBy( how= How.XPATH,using="//select[@id='models']/option")
  public WebElement modelOption;

}
