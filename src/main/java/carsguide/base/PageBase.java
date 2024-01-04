package carsguide.base;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static carsguide.base.GlobalConfig.browser;
import static carsguide.base.GlobalConfig.impliciteWaitTimeOut;
import static carsguide.base.GlobalConfig.url;

@Slf4j
public class PageBase {

  public static WebDriver driver;

  public static void initConfiguration() {

    switch (browser.toLowerCase()) {
      case "chrome":
        driver = new ChromeDriver();
        log.info("Chrome Driver is launch");
        break;
      case "firefox":
        driver = new FirefoxDriver();
        log.info("Firefox Driver is launch");
        break;
      case "edge":
        driver = new EdgeDriver();
        log.info("Edge Driver is launch");
        break;
      default:
        driver = new ChromeDriver();
        log.info("Default Chrome Driver is launch");
        break;
    }
    driver.get(url);
    log.info("URL " + url + " is launch");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(impliciteWaitTimeOut, TimeUnit.SECONDS);
  }

  public static void click(WebElement element) {
    element.click();
    log.info("Clicking on an Element : " + element);
  }

  public static void mouseOver(WebElement element) {
    Actions action = new Actions(driver);
    action.moveToElement(element).perform();
    log.info("MouseOver on an Element : " + element);
  }

  public static void type(WebElement element, String value) {
    element.sendKeys(value);
    log.info("Typing in an Element : " + element + " entered value as : " + value);
  }

  public String value(WebElement element) {
    String text = element.getText();
    log.info("Text Value : " + element + " : value is " + text);
    return text;
  }

  public String getTitle() {
    String title = driver.getTitle();
    log.info("Getting the Title of the page :: " + title);
    return title;
  }

  public static void selectDropDown(WebElement element, String value) {
    Select selectData = new Select(element);
    selectData.selectByValue(value);
    log.info("Selecting from DropDown :: " + element + " with value " + value);
  }

  public static void quitBrowser() {
    driver.quit();
    log.info("Driver is close");
  }


}



