package carsguide.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocator {

  @FindBy(how = How.XPATH, using = "//a[contains(text(),'buy + sell')]")
  public WebElement buySellTab;
  @FindBy(how = How.XPATH, using = "//p[contains(text(),'Buy')]//parent :: div//a[contains(text(),'Used')]")
  public WebElement usedLink;
  @FindBy(how = How.XPATH, using = "//p[contains(text(),'Buy')]//parent :: div//a[contains(text(),'New')]")
  public WebElement newLink;
}
/*
https://www.carsguide.com.au
Home Page
 buySellTab
//p[contains(text(),'Buy')]//parent :: div//a[contains(text(),'Used')] usedLink
//p[contains(text(),'Buy')]//parent :: div//a[contains(text(),'New')] newLink
Used Car Page
//h1 header
//select[@id='makes'] makes
//select[@id='models'] models
//select[@id='locations'] location
//input[@id='search-submit'] search
Used Car Result
//h1 header

New Car Page

New Car Result
//h1 header
* */