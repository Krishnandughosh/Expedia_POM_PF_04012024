package expedia.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HotelSearchResultPageLocator {


  @FindBy(how = How.XPATH, using = "//div[contains(text(),'properties')]")
  public WebElement staysSearchResultHeader;
}
