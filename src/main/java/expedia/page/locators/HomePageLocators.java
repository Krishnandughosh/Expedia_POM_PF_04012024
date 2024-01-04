package expedia.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {
  @FindBy(how = How.XPATH, using = "//span[contains(text(),'Stays')]/parent::a")
  public WebElement staysTab;
  @FindBy(how = How.XPATH, using = "//label[contains(text(),'Dates')]//following-sibling ::input")
  public WebElement datesFeild;
  @FindBy(how = How.XPATH, using = "//div[@id='destination_form_field-menu']/parent::div/parent::div/parent::div/parent::div/parent::div")
  public WebElement detinationFeild;

  @FindBy(how = How.XPATH, using = "//input[@id='destination_form_field']")
  public WebElement goingToFeild;
  @FindBy(how = How.XPATH, using ="(//input[@id='destination_form_field']//parent :: div//parent :: div//parent :: div//li//button)[1]")
  public WebElement goingToFeildSelect;

  @FindBy(how = How.XPATH, using = "//button[@id='search_button']")
  public WebElement searchButton;
  @FindBy(how = How.XPATH, using = "//span[contains(text(),'Flights')]/parent::a")
  public WebElement flightsTab;
  @FindBy(how = How.XPATH, using = "//span[contains(text(),'One-way')]")
  public WebElement oneWayFeild;
  @FindBy(how = How.XPATH, using = "//label[contains(text(),'Leaving from')]//following-sibling ::input")
  public WebElement leavingFromFeild;
}
